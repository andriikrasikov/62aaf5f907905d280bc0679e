package ua.ithellel.lesson4;

//1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();                       //1
        checkSumSign(2, 3);                //2
        printColor(2);                     //3
        compareNumber(2, 3);               //4
        boolNumbersSum(2, 3);              //5
        checkNumb(1);                         //6
        boolNumb1(2);                         //7
        stringXTimes("text", 5);           //8
        checkYear2(2022);                     //9

    }

    // 2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    public static void printThreeWords() {
        System.out.println("                  TASK-1");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //  3. Создайте метод checkSumSign()
    public static void checkSumSign(int a, int b) {
        System.out.println("                  TASK-2");
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else if (a + b < 0) {
            System.out.println("Сумма отрицательная");
        }
    }
    // 4. Создайте метод printColor()
    public static void printColor(int value) {
        System.out.println("                  TASK-4");
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
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
    }}

// 6. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

    public static void boolNumbersSum(int a, int b) {
        System.out.println("                  TASK-6");
        if (a + b >= 10 && a + b <= 20) {
            System.out.println("true");
        } else {
        System.out.println("false");
    }}

//    7. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    public static void checkNumb(int a) {
        System.out.println("                  TASK-7");
        if (a >= 0) {
            System.out.println("The number is positive");
        } else System.out.println("The number is negative");
    }

    //8. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static void boolNumb1(int a) {
        System.out.println("                  TASK-8");
        if (a < 0) {
            System.out.println("true");
        } else System.out.println("false");
    }


    //9. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static void stringXTimes(String a, int b) {
        System.out.println("                  TASK-9");
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }


    //      10. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void checkYear2(int a) {
        System.out.println("                  TASK-10");
        if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

