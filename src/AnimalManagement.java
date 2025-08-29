import java.util.ArrayList;

public class AnimalManagement {
    private ArrayList<Animal> animals = new ArrayList<>();


    public int getAnimalNum() {
        return animals.size();
    }

    void register(Animal animal) {
        animals.add(animal);
    }

    void showList() {
        if (animals.isEmpty()) {
            System.out.println("등록된 동물이 없습니다.");
            return;
        }
        int count = 0;
        for (Animal animal : animals) {
            String type = "";
            if (animal instanceof Dog) {
                type = "강아지";
            } else if (animal instanceof Cat) {
                type = "고양이";
            }
            System.out.println(++count + ". " + animal.getName() + " (" + type + ", " + animal.getAge() + "살)");
        }
    }

    void feed(int index) {
        animals.get(index - 1).feed();
    }

    void play(int index) {
        animals.get(index - 1).play();
    }

    void sound(int index) {
        animals.get(index - 1).bark();
    }

    void checkStatus(int index) {
        animals.get(index - 1).showStatus();
    }


}
