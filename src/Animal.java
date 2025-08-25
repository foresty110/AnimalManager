abstract class Animal {
    private String name;
    private int age;
    private int hunger;
    private int happiness;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
        hunger = 100;
        happiness = 100;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void bark() {
        System.out.print(name + ": ");
    }

    public void feed() {
        hunger -= 10;
        System.out.println(name + "의 배고픔이 감소했습니다. ");
    }

    public void play() {
        happiness += 10;
        System.out.println(name + "의 행복도가 증가했습니다. ");
    }

    public void showStatus() {
        System.out.println("배고픔: " + hunger + " 행복도: " + happiness);
    }
}
