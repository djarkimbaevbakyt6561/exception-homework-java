import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exitSystem = false;
        while (!exitSystem) {
            System.out.println("Выберите: (1)Параллелепипед - (2)Цилиндр");
            try {
                int num = scanner.nextInt();
                switch (num) {
                    case 1 -> {
                        boolean exitParallelepiped = false;
                        while (!exitParallelepiped) {
                            System.out.println("Выберите: (1)Найти площадь - (2)Найти объем");
                            try {
                                int parallelepipedNum = scanner.nextInt();
                                Parallelepiped parallelepiped = new Parallelepiped();
                                System.out.print("Введите длину: ");
                                int length = scanner.nextInt();
                                System.out.print("Введите ширину: ");
                                int width = scanner.nextInt();
                                System.out.print("Введите высоту: ");
                                int height = scanner.nextInt();
                                if (length <= 0 || height <= 0 || width <= 0) {
                                    throw new ArithmeticException();
                                }
                                parallelepiped.height = height;
                                parallelepiped.length = length;
                                parallelepiped.width = width;
                                if (parallelepipedNum == 1) {
                                    int result = parallelepiped.areaParallelepiped();
                                    System.out.println("Площадь параллелепипеда равна: " + result);

                                } else if (parallelepipedNum == 2) {
                                    int result = parallelepiped.volumeOfParallelepiped();
                                    System.out.println("Объем параллелепипеда равна: " + result);
                                } else {
                                    throw new RightNumberException();
                                }
                                exitParallelepiped = true;
                                exitSystem = true;

                            } catch (ArithmeticException e) {
                                System.out.println("Введенное число меньше или равно нулю!");
                            } catch (RightNumberException e) {
                                System.out.println("Введите правильное число!");
                            } catch (InputMismatchException e) {
                                System.out.println("Введите число!");
                            }
                            scanner.nextLine();
                        }
                    }
                    case 2 -> {
                        boolean exitCylinder = false;
                        while (!exitCylinder) {
                            System.out.println("Выберите: (1)Найти площадь - (2)Найти объем");
                            try {
                                int cylinderNum = scanner.nextInt();
                                Cylinder cylinder = new Cylinder();
                                System.out.print("Введите радиус: ");
                                int radius = scanner.nextInt();
                                System.out.print("Введите высоту: ");
                                int height = scanner.nextInt();
                                if (height <= 0 || radius <= 0) {
                                    throw new ArithmeticException();
                                }
                                cylinder.height = height;
                                cylinder.radius = radius;
                                if (cylinderNum == 1) {
                                    double result = cylinder.areaCylinder();
                                    System.out.println("Площадь цилиндра равна: " + result);

                                } else if (cylinderNum == 2) {
                                    double result = cylinder.volumeOfCylinder();
                                    System.out.println("Объем цилиндра равна: " + result);
                                } else {
                                    throw new RightNumberException();
                                }
                                exitCylinder = true;
                                exitSystem = true;

                            } catch (ArithmeticException e) {
                                System.out.println("Введенное число меньше или равно нулю!");
                            } catch (RightNumberException e) {
                                System.out.println("Введите правильное число!");
                            } catch (InputMismatchException e) {
                                System.out.println("Введите число!");
                            }
                            scanner.nextLine();
                        }
                    }
                    default -> {
                        throw new RightNumberException();
                    }
                }
            } catch (RightNumberException e) {
                System.out.println("Введите правильное число!");

            } catch (InputMismatchException e) {
                System.out.println("Введите число!");
            }
            scanner.nextLine();

        }
    }
}