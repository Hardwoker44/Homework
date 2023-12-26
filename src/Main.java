public class Main {
    public static void main(String[] args) {
        System.out.println("Привет Мир!");
        System.out.println("Hello World!");
        System.out.println("Руль");
        /* Не работает тип переменной var поэтому сделал с float, double и int
        не смог самостоятельно разобраться как ее добавить
        */
        System.out.println("Задание 1");
        double dog = 8.0;
        double cat = 3.6;
        float paper = 763789;
        System.out.println("Ответ задание 1:    "+dog);
        System.out.println("Ответ задание 1:    "+cat);
        System.out.println("Ответ задание 1:    "+paper);
        System.out.println("Задание 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Ответ задание 2:    "+dog);
        System.out.println("Ответ задание 2:    "+cat);
        System.out.println("Ответ задание 2:    "+paper);
        System.out.println("Задание 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Ответ задание 3:    "+dog);
        System.out.println("Ответ задание 3:    "+cat);
        System.out.println("Ответ задание 3:    "+paper);
        System.out.println("Задание 4");
        int friend = 19;
        friend = friend + 2;
        System.out.println("Ответ задание 4:    "+friend);
        friend = friend / 7;
        System.out.println("Ответ задание 4:    "+friend);
        System.out.println("Задание 5");
        float frog = 3.5f;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("Ответ задание 5:    "+frog);
        frog = frog / 3.5f;
        System.out.println("Ответ задание 5:    "+frog);
        frog = frog + 4;
        System.out.println("Ответ задание 5:    "+frog);
        System.out.println("Задание 6");
        float weight1 = 78.2f;
        float weight2 = 82.7f;
        float totalWeight = weight1 + weight2;
        float differenceWeight = weight1 - weight2;
        System.out.println("Общая масса:    "+totalWeight);
        System.out.println("Разница в массе:    "+differenceWeight);
        System.out.println("Задание 7");
        differenceWeight = weight2 - weight1;
        float massDivisionRemainder = weight2 % weight1;
        System.out.println("Разница в массе:    "+differenceWeight);
        System.out.println("Остаток от деления:    "+massDivisionRemainder);
        System.out.println("Задание 8");
        int individualHours = 8;
        int allHours = 640;
        int amountPeople = allHours / individualHours;
        System.out.println("Всего работников в компании -   " + amountPeople + "человек");
        amountPeople = amountPeople + 94;
        System.out.println("Задание 8 - пункт №2");
        System.out.println("Всего работников в компании -   " + amountPeople + "человек");
        int allHours2 = amountPeople * individualHours;
        System.out.println("Если в компании работает "+ amountPeople + " человек, то всего " + allHours2 + " часов работы может быть поделено между сотрудниками");





    }
}