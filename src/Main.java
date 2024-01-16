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
        System.out.println("Домашняя работа №3");
        System.out.println("Задание 1");
        int i = 243434233;
        System.out.println("Значение переменной i c типом int = "+i);
        byte b = 2;
        System.out.println("Значение переменной b c типом byte = "+b);
        short s = 3333;
        System.out.println("Значение переменной s c типом short = "+s);
        long l = 32131312312313131L;
        System.out.println("Значение переменной l c типом long = "+l);
        float f = 2.555667f;
        System.out.println("Значение переменной f c типом float = "+f);
        double d = 243.44444455565;
        System.out.println("Значение переменной d c типом double = "+d);
        System.out.println("Задание 2");
        float f1 = 27.12f;
        long l1 = 987678965549L;
        float f2 = 2.786f;
        short s1 = 569;
        short s2 = -159;
        short s3 = 27897;
        byte b1 = 67;
        System.out.println("Значение переменной f1 c типом float = "+f1);
        System.out.println("Значение переменной l1 c типом long = "+l1);
        System.out.println("Значение переменной f2 c типом float = "+f2);
        System.out.println("Значение переменной s1 c типом short = "+s1);
        System.out.println("Значение переменной s2 c типом short = "+s2);
        System.out.println("Значение переменной s3 c типом short = "+s3);
        System.out.println("Значение переменной b1 c типом byte = "+b1);
        System.out.println("Задание 3");
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        short allPaper = 480;
        int quantityPerPerson = allPaper / (firstClass + secondClass + thirdClass);
        System.out.println("На каждого ученика расчитано "+ quantityPerPerson + " листов бумаги.");
        System.out.println("Задание 4");
        byte produced = 16;
        byte productionTime = 2;
        int productionPerMinute = produced / productionTime;
        byte productionTime1 = 20;
        short productionTime2 = 1440;
        short productionTime3 = 4320;
        int productionTime4 = 44640;
        int produced1 = productionPerMinute * productionTime1;
        int produced2 = productionPerMinute * productionTime2;
        int produced3 = productionPerMinute * productionTime3;
        int produced4 = productionPerMinute * productionTime4;
        System.out.println("За 1 минуту машина производит " + productionPerMinute + " бутылок.");
        System.out.println("За " + productionTime1 + " минут машина произвела " + produced1 + " штук бутылок.");
        System.out.println("За " + productionTime2 + " минут машина произвела " + produced2 + " штук бутылок.");
        System.out.println("За " + productionTime3 + " минут машина произвела " + produced3 + " штук бутылок.");
        System.out.println("За " + productionTime4 + " минут машина произвела " + produced4 + " штук бутылок.");
        System.out.println("Задание 5");
        byte cansWhite = 2;
        byte cansBrown = 4;
        byte allCans = 120;
        int cansOnClass = cansWhite + cansBrown;
        int allClass = allCans / cansOnClass;
        int allWhiteCans = cansWhite * allClass;
        int allBrownCans = cansBrown * allClass;
        System.out.println("В школе, где " + allClass + " классов, нужно " + allWhiteCans + " банок белой краски и " + allBrownCans + " банок коричневой краски.");
        System.out.println("Задание 6");
        byte weightBanana = 80;
        byte allBananas = 5;
        byte weightMilk = 105;
        byte onePortionMilk = 100;
        short allMilk = 200;
        int allPortionMilk = allMilk / onePortionMilk;
        byte weightCream = 100;
        byte allCream = 2;
        byte weightEgg = 70;
        byte allEggs = 4;
        float weightBreakfastGrams = (allBananas * weightBanana) + (allPortionMilk * weightMilk) + (allCream * weightCream) + (allEggs * weightEgg);
        float weightBreakfastKilograms = weightBreakfastGrams / 1000;
        System.out.println("Вес спортивного завтрака = " + weightBreakfastGrams + " граммов.");
        System.out.println("Вес спортивного завтрака = " + weightBreakfastKilograms + " килограмм.");
        System.out.println("Задание 7");
        byte weightKg = 7;
        int weightGr = weightKg * 1000;
        short weightDay1 = 250;
        short weightDay2 = 500;
        int maxDays = weightGr / weightDay1;
        int minDays = weightGr / weightDay2;
        int allDays = maxDays + minDays;
        int averageValue = allDays / 2;
        System.out.println("Минимум потребуется " + minDays + " дней на похудение.");
        System.out.println("Максимум потребуется " + maxDays + " дней на похудение.");
        System.out.println("В среднем может потребоваться " + averageValue + " дней на похудение.");
        System.out.println("Задание 8");
        int masha = 67760;
        int denis = 83690;
        int cristina = 76230;
        int salaryMasha = masha * 10 / 100;
        int salaryDenis = denis * 10 / 100;
        int salaryCristina = cristina * 10 / 100;
        int mashaMoney = salaryMasha + masha;
        int denisMoney = salaryDenis + denis;
        int cristinaMoney = salaryCristina + cristina;
        System.out.println("Маша теперь получает " + mashaMoney +  " рублей. Головой доход вырос на " + salaryMasha + " рублей.");
        System.out.println("Денис теперь получает " + denisMoney +  " рублей. Головой доход вырос на " + salaryDenis + " рублей.");
        System.out.println("Кристина теперь получает " + cristinaMoney +  " рублей. Головой доход вырос на " + salaryCristina + " рублей.");
        System.out.println("Домашняя работа №4");
        System.out.println("Задание 1");
        byte age = 17;
        byte age0 = 19;
        byte ageOfMajority = 18;
        if (age >= ageOfMajority){
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        }else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        }
        if (age0 >= ageOfMajority){
            System.out.println("Если возраст человека равен " + age0 + " то он совершеннолетний");
        }else {
            System.out.println("Если возраст человека равен " + age0 + " то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задание 2");
        byte temperature1 =3;
        byte temperature2 =8;
        byte temperatureMin =5;
        if (temperature1 < temperatureMin){
            System.out.println("На улице " + temperature1 + " градуса нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature1 + " градусов можно не надевать шапку");
        }
        if (temperature2 < temperatureMin){
            System.out.println("На улице " + temperature2 + " градуса нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature2 + " градусов можно не надевать шапку");
        }
        System.out.println("Задание 3");
        byte speed1 = 70;
        byte speed2 = 50;
        byte speedMax = 60;
        if (speed1 > speedMax){
            System.out.println("Если скорость "+ speed1 + " то придется заплатить штраф");
        }else {
            System.out.println("Если скорость "+ speed1 + " то можно ездить спокойно");
        }
        if (speed2 > speedMax){
            System.out.println("Если скорость "+ speed2 + " то придется заплатить штраф");
        }else {
            System.out.println("Если скорость "+ speed2 + " то можно ездить спокойно");
        }
        System.out.println("Задание 4");
        byte age1 = 4;
        byte age2 = 9;
        byte age3 = 20;
        byte age4 = 28;
        if (age1 > 2 && age1 < 6){
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в садик.");
        } else if (age1 > 7 && age1 < 17){
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в школу.");
        } else if (age1 >= 18 && age1 <= 24){
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в университет.");
        } else if (age1 > 24){
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить на работу.");
        }
        if (age2 > 2 && age2 < 6){
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в садик.");
        } else if (age2 > 7 && age2 < 17){
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в школу.");
        } else if (age2 >= 18 && age2 <= 24){
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в университет.");
        } else if (age2 > 24){
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить на работу.");
        }
        if (age3 > 2 && age3 < 6){
            System.out.println("Если возраст человека равен " + age3 + " то ему нужно ходить в садик.");
        } else if (age3 > 7 && age3 < 17){
            System.out.println("Если возраст человека равен " + age3 + " то ему нужно ходить в школу.");
        } else if (age3 >= 18 && age3 <= 24){
            System.out.println("Если возраст человека равен " + age3 + " то ему нужно ходить в университет.");
        } else if (age3 > 24){
            System.out.println("Если возраст человека равен " + age3 + " то ему нужно ходить на работу.");
        }
        if (age4 > 2 && age4 < 6){
            System.out.println("Если возраст человека равен " + age4 + " то ему нужно ходить в садик.");
        } else if (age4 > 7 && age4 < 17){
            System.out.println("Если возраст человека равен " + age4 + " то ему нужно ходить в школу.");
        } else if (age4 >= 18 && age4 <= 24){
            System.out.println("Если возраст человека равен " + age4 + " то ему нужно ходить в университет.");
        } else if (age4 > 24){
            System.out.println("Если возраст человека равен " + age4 + " то ему нужно ходить на работу.");
        }
        System.out.println("Задание 5");
        byte age5 = 4;
        byte age6 = 8;
        byte age7 = 16;
        if (age5 < 5){
            System.out.println("Если возраст ребенка равен " + age5 + " то ему нельзя кататься на атракционе.");
        } else if (age5 > 5 && age5 < 14){
            System.out.println("Если возраст ребенка равен " + age5 + " то ему можно кататься на атракционе в сопровождении взрослого");
        } else if (age5 > 14){
            System.out.println("Если возраст ребенка равен " + age5 + " то ему можно кататься на атракционе без сопровождении взрослого");
        }
        if (age6 < 5){
            System.out.println("Если возраст ребенка равен " + age6 + " то ему нельзя кататься на атракционе.");
        } else if (age6 > 5 && age6 < 14){
            System.out.println("Если возраст ребенка равен " + age6 + " то ему можно кататься на атракционе в сопровождении взрослого");
        } else if (age6 > 14){
            System.out.println("Если возраст ребенка равен " + age6 + " то ему можно кататься на атракционе без сопровождении взрослого");
        }
        if (age7 < 5){
            System.out.println("Если возраст ребенка равен " + age7 + " то ему нельзя кататься на атракционе.");
        } else if (age7 > 5 && age7 < 14){
            System.out.println("Если возраст ребенка равен " + age7 + " то ему можно кататься на атракционе в сопровождении взрослого");
        } else if (age7 > 14){
            System.out.println("Если возраст ребенка равен " + age7 + " то ему можно кататься на атракционе без сопровождении взрослого");
        }
        System.out.println("Задание 6");
        byte capacity = 102;
        byte seatingPlaces = 60;
        byte numberPassenger1 = 39;
        byte numberPassenger2 = 68;
        byte numberPassenger3 = 104;
        if (numberPassenger1 <= capacity && numberPassenger1 > seatingPlaces){
            System.out.println("Все сидячие места в вагоне уже заняты, остались только стоячие места.");
        } else if (numberPassenger1 <= seatingPlaces){
            System.out.println("В вагоне есть сидячие места.");
        } else if (numberPassenger1 > capacity){
            System.out.println("В вагоне не осталось мест.");
        }
        if (numberPassenger2 <= capacity && numberPassenger2 > seatingPlaces){
            System.out.println("Все сидячие места в вагоне уже заняты, остались только стоячие места.");
        } else if (numberPassenger2 <= seatingPlaces){
            System.out.println("В вагоне есть сидячие места.");
        } else if (numberPassenger2 > capacity){
            System.out.println("В вагоне не осталось мест.");
        }
        if (numberPassenger3 <= capacity && numberPassenger3 > seatingPlaces){
            System.out.println("Все сидячие места в вагоне уже заняты, остались только стоячие места.");
        } else if (numberPassenger3 <= seatingPlaces){
            System.out.println("В вагоне есть сидячие места.");
        } else if (numberPassenger3 > capacity){
            System.out.println("В вагоне не осталось мест.");
        }
        System.out.println("Задание 7");
        byte one = 1;
        byte two = 2;
        byte three = 3;
        if (one > two && one > three){
            System.out.println(one);
        }else if (two > one && two > three){
            System.out.println(two);
        }else if (three > one && three > two){
            System.out.println(three);
        }
    }
}