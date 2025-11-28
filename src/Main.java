public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " +
                    age + ", то он совершеннолетний\n");
        } else {
            System.out.println("Если возраст человека равен " +
                    age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Task 2");
        int airTemperature = 6;
        if (airTemperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки\n");
        }

        System.out.println("Task 3");

        int maxSpeed = 59;
        if (maxSpeed > 60) {
            System.out.println("Если скорость " + maxSpeed + ", то придется заплатить штраф");
        } else {
            System.out.println("Можно ездить спокойно\n");
        }

        System.out.println("Task 4");

        int humanAge = 25;

        if (humanAge >= 2 && humanAge <= 6)  {
            System.out.println("Если человеку " + humanAge + " лет(года), то ему нужно ходить в детский сад\n");
        } else if (humanAge >= 7 && humanAge <= 17) {
            System.out.println("Если человеку " + humanAge + " лет, то ему нужно ходить в школу\n");
        } else if (humanAge >= 18 && humanAge <= 24) {
            System.out.println("Если человеку " + humanAge + " лет, то ему нужно ходить в университет\n");
        } else {
            System.out.println("Если человеку " + humanAge + " лет(года), то ему нужно ходить на работу\n");
        }

        System.out.println("Task 5");

        int childrenAge = 15;

        if (childrenAge < 5) {
            System.out.println("Если ребенку " + childrenAge + " года, то он не может кататься на атракционе");
        } else if (childrenAge > 5 && childrenAge <= 14) {
            System.out.println("Если ребенку " + childrenAge + " лет, то он может кататься только в сопровождении " +
                    " взрослого. Если взрослого нет, то кататься нельзя");
        } else if (childrenAge > 14) {
            System.out.println("Если ребенку " + childrenAge + " лет, то он модет кататься на атракционе" +
                    " без сопровождения взрослого\n");
        }

        System.out.println("Task 6");

        int ticketsPurchased = 101;

        if (ticketsPurchased >= 102) {
            System.out.println("Вагон полностью забит, мест больше нет\n");
        } else if (ticketsPurchased < 102 && ticketsPurchased > 60) {
            System.out.println("Есть только стоячие места\n");
        } else if (ticketsPurchased < 60) {
            System.out.println("В вагоне есть стоячие и сидячие места\n");
        }

        System.out.println("Task 7");

        int one = 1;
        int two = 6;
        int three = 3;

        if (one >= two && one >= three) {
            System.out.println("Большее из трех чисел " + one + " \n");
        } else if (two >= one && two >= three) {
            System.out.println("Большее из трех чисел " + two + " \n");
        } else {
            System.out.println("Большее из трех чисел " + three + " \n");
        }
    }
}