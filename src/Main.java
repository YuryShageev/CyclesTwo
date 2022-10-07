public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Task 1");
        int saveMonth = 15000;
        int total = 0;
        int month = 1;
        int rate = 12;
        while (total < 2459000) {
            total = total + (total/100 * rate / 12);
            total = total + saveMonth;
            month = month + 1;
            System.out.println("Месяц " + month + ", Сумма накоплений равна " + total + " рублей");
            }

//Задача 2
        System.out.println("Task 2");
        int number = 0;
        while (number <10) {
            number = number + 1;
            System.out.println(number);
        }
        for (int i = 10; number > 0; number--) {
            System.out.println(number);
        }

        //Задача 3
        System.out.println("Task 3");
        int populationTotal = 12000000;
        int bornPerThousandYear = 17;
        int deadPerThousandYear = 8;
        int growthPerThousandYear = bornPerThousandYear - deadPerThousandYear;
        int year = 0;
        int growthTotal = 0;
        while (year <= 10) {
            growthTotal = (populationTotal / 1000) * growthPerThousandYear * year + populationTotal;
            year = year + 1;
            System.out.println("Год " + year + ", численность населения составляет " + growthTotal);
        }
    }
}