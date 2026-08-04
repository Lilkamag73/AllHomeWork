import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        task1(scanner);
        task2(scanner);
        task3(scanner);
        task4(scanner);
        task5(scanner);
        task6(scanner);
        task7();
        scanner.close();
    }

    public static void task1(Scanner scanner) {
        System.out.println("Введите возраст человека");
        int age;
        age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то  он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то  он не достиг совершеннолетия, нужно немного подождать");
        }

    }

    public static void task2(Scanner scanner) {
        System.out.println("Введите температуру на улице:");

        int temp;
        temp = scanner.nextInt();
        if (temp <= 5) {
            System.out.println("На улице холодно, нужно наденть шапку");
        } else {
            System.out.println("На улице тепло, можно идти без шапки");
        }

    }

    public static void task3(Scanner scanner) {
        System.out.println("Введите скорость автомобиля:");
        int speed;
        speed = scanner.nextInt();
        if (speed <= 60) {
            System.out.println("Скорость автомобиля " + speed + " км/ч, то можно ездить спокойно");
        } else {
            System.out.println("Скорость автомобиля " + speed + " км/ч, то нужно заплатить штраф");
        }
    }

    public static void task4(Scanner scanner) {
        System.out.println("Введите возраст человека:");
        int age;
        age = scanner.nextInt();
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то  ему нужно ходить в десткий сад");
        } else {
            if (age >= 7 && age <= 17) {
                System.out.println("Если возраст человека равен " + age + ", то  ему нужно ходить в школу");
            } else {
                if (age >= 18 && age <= 24) {
                    System.out.println("Если возраст человека равен " + age + ", то  ему место в унииверситете");
                } else {
                    if (age > 24) {
                        System.out.println("Если возраст человека равен " + age + ", то  ему нужно работать");
                    }
                }
            }
        }
    }

    public static void task5(Scanner scanner) {
        System.out.println("Введите возраст ребенка:");
        int age;
        age = scanner.nextInt();
        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то  он не может кататься на атракционе");
        } else {
            if (age > 5 && age <= 14) {
                System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
            } else {
                if (age > 14) {
                    System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого");
                }
            }
        }
    }

    public static void task6(Scanner scanner) {
        System.out.println("Введите сколько человек в вагоне:");
        int people;
        people = scanner.nextInt();
        if (people < 60) {
            System.out.println("В вагоне " + people + " человек, можно спокойно сесть");
        } else if (people < 102) {
            System.out.println("В вагоне " + people + " человек, остались только стоячие места");
        } else {
            System.out.println("В вагоне " + people + " человек, вагон заполнен");
        }

    }

    public static void task7() {
        int one;
        int two;
        int three;

        if (one >= two && one >= three) {
            System.out.println("Самое большое число One = " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Самое большое число Two = " + two);
        } else {
            System.out.println("Самое большое число Three = " + three);
        }
    }
}