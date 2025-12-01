public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1(2)");

        int clientOS = 1;
        int clientDeviceYear = 2015;

        switch (clientOS) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке\n");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке\n");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке\n");
                }
                break;
        }

        System.out.println("Task 3");

        int year = 1700;
        boolean leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);

        if (year <= 1584) {
            System.out.println("Введите год выше, чем 1584\n");
        } else {
            if (leapYear) {
                System.out.println(year + " год является високосным\n");
            } else {
                System.out.println(year + " год не является високосным\n");
            }
        }

        System.out.println("Task 4");

        int deliveryDistance = 25;
        int deliveryDays = 0;

        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            System.out.println("Свыше 100 км доставки нет\n");
        }
        System.out.println("Потребуется дней: " + deliveryDays + " \n");

        System.out.println("Task 5");

        int monthNumber = 12;
        System.out.println("Месяц " + monthNumber + " принадлежит к сезону - ");
        switch (monthNumber) {
            case 12: case 1: case 2:
                System.out.println("зима");
                return;
            case 3: case 4: case 5:
                System.out.println("весна");
                return;
            case 6: case 7: case 8:
                System.out.println("лето");
                return;
            case 9: case 10: case 11:
                System.out.println("осень");
                return;
        }
        System.out.println();
    }
}