public class Main {
    public static void main(String[] args) {
        // Задача 1
        double dog = 8.0;
        System.out.println("Собака - " + dog);

        double cat = 3.6;
        System.out.println("Кот - " + cat);

        double papper = 763789;
        System.out.println("Бумага - " + papper);

        // Задача 2
        var dogs = dog + 4;
        System.out.println("Собаки - " + dogs);

        var cats = cat + 4;
        System.out.println("Коты - " + cats);

        var pappers = papper + 4;
        System.out.println("Бумага - " + pappers);

        // Задача 3
        double dog3 = dogs - 3.5;
        System.out.println("Собаки - " + dog3);

        double cat3 = cats - 1.6;
        System.out.println("Коты - " + cat3);

        double papper3 = papper + 4;
        System.out.println("Бумага - " + papper3);

        // Задача 4
        var friend = 19;
        var allFriends = friend;
        System.out.println("Всего друзуй сейчас - " + allFriends);

        var friends = allFriends + 2;
        System.out.println("Стало друзей - " + friends);

        var afterAllFriends = friend / 7;
        System.out.println("Осталось друзей - " + afterAllFriends);

        // Задача 5
        double frog = 3.5;
        System.out.println("Было лягушек - " + frog);

        double frogs = frog * 10 / 3.5;
        System.out.println("Стало лягушек - " + frogs);

        double allFrogs = frogs + 4;
        System.out.println("Осталось лягушек - " + allFrogs);

        // Задача 6
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeightBoxers = weightBoxer1 + weightBoxer2;
        var differenceWeightBoxers = weightBoxer2 - weightBoxer1;

        System.out.println("Общая масса боксеров - " + totalWeightBoxers);
        System.out.println("Разница в весе между боксерами - " + differenceWeightBoxers);

        // Задача 7
        var remainderOfDivision = weightBoxer2 % weightBoxer1;
        System.out.println("Остаток деления - " + remainderOfDivision);

        // Задача 8
        var allHours = 640;
        var oneWorker = 8;
        var allWorkers = allHours / oneWorker;
        System.out.println("Всего работников в компании - " + allWorkers + " человек");
        var plusWorkers = allWorkers + 94;
        var allTimes = allHours / plusWorkers;
        System.out.println("Если в компании работает " + plusWorkers + " человека, то всего по " + allTimes + " часа работы может быть поделено между сотрудниками");
    }
}