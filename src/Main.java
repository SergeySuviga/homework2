public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(cat);
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println("Задача 6");
        var weightOfOneBoxer = 78.2;
        var weightOfTheSecondBoxer = 82.7;
        var totalWeight = weightOfOneBoxer + weightOfTheSecondBoxer;
        System.out.println("Общий вес двух бойцев " + totalWeight + " кг ");


        var differenceDetweenFighters = weightOfOneBoxer - weightOfTheSecondBoxer;
        System.out.println("Разница между весами бойцов " + differenceDetweenFighters + " кг! ");
    }

        public static void task7() {
            System.out.println("Задача 7");
            var WeightOfTheSecondBoxer = 82.7;
            var WeightOfOneBoxer = 78.2;
            var TotalWeight = WeightOfTheSecondBoxer + WeightOfOneBoxer;
            System.out.println("Общий вес двух бойцев " + TotalWeight + " кг ");

            var DifferenceDetweenFighters = (WeightOfTheSecondBoxer - WeightOfOneBoxer) % TotalWeight;
            System.out.println("Разница между весами бойцов " + DifferenceDetweenFighters + " кг! ");

    }
    public static void task8() {
        System.out.println("Задача 8");
        var TotalHours = 640;
        var WorkingShift = 8;
        var Human = TotalHours / WorkingShift;
        System.out.println("Всего работников в компании " + Human + " человек ");

        var MorePeople = 94;
        var TotalPerson = TotalHours + MorePeople;
        System.out.println("Всего человек " + TotalPerson);

        var MoreHours = TotalPerson / WorkingShift;

        System.out.println("Если в компании работает " + TotalPerson + " человек, то всего " + MoreHours + " часов работы может быть поделено между сотрудниками.");
    }




}