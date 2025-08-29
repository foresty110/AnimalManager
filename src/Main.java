import java.util.InputMismatchException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.

        Scanner scanner = new Scanner(System.in);
        AnimalManagement animalManagement = new AnimalManagement();

        boolean useAnimalManagement = true;
        while (useAnimalManagement) {

            //시스템 메뉴 보기
            showMenu();

            //메뉴 입력받기
            System.out.print("\n메뉴를 선택하세요: ");
            int menu = checkInput(scanner, 7);

            switch (menu) {

                case 1:
                    //동물 등록

                    //동물 이름 입력받기
                    System.out.print("동물 이름을 입력하세요: ");
                    String name = scanner.next();

                    //동물 나이 입력받기
                    System.out.print("동물 나이를 입력하세요: ");
                    int age = checkInput(scanner, Integer.MAX_VALUE);

                    //동물 종류 입력받기
                    String[] animalType = {"강아지", "고양이"};
                    for (int i = 0; i < animalType.length; i++) {
                        System.out.print((i + 1) + "." + animalType[i] + " ");
                    }
                    System.out.println();
                    System.out.print("동물 종류를 선택하세요: ");
                    int type = checkInput(scanner, 2);

                    Animal animal = null;
                    switch (type) {
                        case 1:
                            animal = new Dog(name, age);
                            break;
                        case 2:
                            animal = new Cat(name, age);
                            break;
                        default:
                            break;
                    }

                    animalManagement.register(animal);

                    System.out.println(name + "(" + animalType[type - 1] + " " + age + "살)가 등록되었습니다.");
                    break;
                case 2:
                    //동물 목록 보기
                    animalManagement.showList();

                    break;
                case 3:
                    //동물과 놀기
                    System.out.println("함께 놀고 싶은 동물을 선택하세요: ");
                    animalManagement.showList();

                    //동물 선택 입력받기
                    System.out.print("선택: ");
                    int playAnimal = checkInput(scanner, animalManagement.getAnimalNum());
                    animalManagement.play(playAnimal);

                    break;
                case 4:
                    //먹이 주기
                    System.out.println("먹이를 줄 동물을 선택하세요: ");
                    animalManagement.showList();

                    //동물 선택 입력받기
                    System.out.print("선택: ");
                    int feedAnimal = checkInput(scanner, animalManagement.getAnimalNum());
                    animalManagement.feed(feedAnimal);

                    break;
                case 5:
                    //동물 상태 확인
                    System.out.println("상태를 확인할 동물을 선택하세요: ");
                    animalManagement.showList();

                    //동물 선택 입력 받기
                    System.out.print("선택: ");
                    int statusIdx = checkInput(scanner, animalManagement.getAnimalNum());
                    animalManagement.checkStatus(statusIdx);

                    break;
                case 6:
                    //울음소리 듣기
                    System.out.println("울음소리를 들을 동물을 선택하세요: ");
                    animalManagement.showList();

                    //동물 선택 입력받기
                    System.out.print("선택: ");
                    int soundIdx = checkInput(scanner, animalManagement.getAnimalNum());
                    animalManagement.sound(soundIdx);

                    break;
                case 7:
                    //종료
                    useAnimalManagement = false;
                    break;
                default:
                    break;
            }
        }


    }

    public static int checkInput(Scanner sc, int max) {
        while (true) {
            try {
                int choice = sc.nextInt();
                if (choice > 0 && choice <= max) {
                    return choice;
                } else {
                    System.out.println("1부터 " + max + " 사이의 숫자를 입력해주세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요.");
                sc.nextLine(); // 잘못된 입력 제거
            }

        }
    }

    public static void showMenu() {
        System.out.print("\n=== 동물원 관리 시스템 ===" +
                "\n1. 동물 등록" +
                "\n2. 동물 목록 보기" +
                "\n3. 동물과 놀기" +
                "\n4. 먹이주기" +
                "\n5. 동물 상태 확인" +
                "\n6. 울음소리 듣기 " +
                "\n7. 종료");
    }
}