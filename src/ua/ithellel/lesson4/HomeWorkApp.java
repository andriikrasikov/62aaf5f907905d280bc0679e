package ua.ithellel.lesson4;

//1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();                       //2
        checkSumSign(2, 3);                //3
        printColor(2);                     //4
        compareNumber(2, 3);               //5
        System.out.println(boolNumbersSum(2, 3));              //6
        checkNumb(1);                         //7
        System.out.println(boolNumb1(2));                         //8
        stringXTimes("text", 5);           //9
        System.out.println(checkYear2(2022));                     //10

    }

    // 2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    public static void printThreeWords() {
        System.out.println("                  TASK-2");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //  3. Создайте метод checkSumSign()
    public static void checkSumSign(int a, int b) {
        int c = a + b;
        System.out.println("                  TASK-3");
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 4. Создайте метод printColor()
    public static void printColor(int value) {
        System.out.println("                  TASK-4");
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }


// 5. Создайте метод compareNumbers(),

    public static void compareNumber(int a, int b) {
        System.out.println("                  TASK-5");
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

// 6. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

    public static boolean boolNumbersSum(int a, int b) {
        int c = a + b;
        System.out.println("                  TASK-6");
        return (c >= 10 && c <= 20);

    }

//    7. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    public static void checkNumb(int a) {
        System.out.println("                  TASK-7");
        if (a >= 0) {
            System.out.println("The number is positive");
        } else System.out.println("The number is negative");
    }

    //8. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean boolNumb1(int a) {
        System.out.println("                  TASK-8");
            return (a < 0);
        }


    //9. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static void stringXTimes(String a, int b) {
        System.out.println("                  TASK-9");
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }


    //      10. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean checkYear2(int a) {
        System.out.println("                  TASK-10");
        return (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0));
        }
    }


