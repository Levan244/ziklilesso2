public class Main {
    public static void main(String[] args){
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
        System.out.println();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15_000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000){
            month++;
            total = total + salary;
            System.out.println("Месяц " + month + " Итого " + total);
        }
        System.out.println();

    }

    private static void task2() {
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number = number + 1;
            System.out.print( number + " " );

        }
        System.out.println();
        for (number = 10; number > 0; number-- ){

            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println();

    }

    private static void task3() {
        System.out.println("задача 3");
        int populationCountry = 12_000_000;
        int fertility = 17 ;
        int death = 8 ;
        int i = 1;
        for (;i <= 10; i++) {
            populationCountry += populationCountry / 1000 * (fertility - death);

            System.out.println("год " + i + " поуляция страны " + populationCountry);
        }
        System.out.println();
        System.out.println();

    }

    private static void task4() {
        System.out.println("задача 4");
        double salary =15000;
        int mounth = 1;
        while (salary < 12_000_000){
            salary+= salary * 0.07;
            mounth++;
            System.out.println("Месяц " + mounth + " накопления " + salary);

        }
        System.out.println();
        System.out.println();


    }

    private static void task5() {
        System.out.println("задача 5");
        double salary = 15000;
        int month = 1;
        while (salary < 12_000_000) {
            salary += salary * 0.07;
           if (month % 6 == 0){
               System.out.println("Месяц " + month + " накопления " + salary);
           }
           month++;
        }
        System.out.println();
        System.out.println();

    }

    private static void task6() {
        System.out.println("задача 6");
        double salary = 15000;
        int month = 1;
        while (month < 9 * 12) {
            salary += salary * 0.07;
            if (month % 6 == 0){
                System.out.println("Месяц " + month + " накопления " + salary);
            }
            month++;
        }
        System.out.println();
    }

    private static void task7() {
        System.out.println("задача 7");
        int friday = 4;
        do {
            System.out.println("Сегодня пятница" + friday +"-е число.Необходимо подготовить ответ");
            friday += 7;
        } while (friday<= 31);
        System.out.println();
    }

    private static void task8() {
        System.out.println("задача 8");
        int year200 =2023 - 200;
        int year100 = 2023 +100;
        for (int year = 0; year<= year100; year = year + 79){
            if (year>=year200){
                System.out.println(year);
            }
        }

    }



}