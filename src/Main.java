public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        byte a = 1;
        System.out.println("Значение переменной " + "a" + " с типом byte " + "равно " + a);

        short b = 30000;
        System.out.println("Значение переменной " + "b" + " с типом short " + "равно " + b);

        int c = 200000;
        System.out.println("Значение переменной " + "c" + " с типом int " + "равно " + c);

        long d = 1000000;
        System.out.println("Значение переменной " + "d" + " с типом long " + "равно " + d);

        float e = 1.1f;
        System.out.println("Значение переменной " + "e" + " с типом float " + "равно " + e);

        double f = 202.123;
        System.out.println("Значение переменной " + "f" + " с типом double " + "равно " + f);


        byte a1 = 67;

        short b1 = -159;

        int c1 = 27897;

        long d1 = 987678965549L;

        float e1 = 27.12f;

        double f1 = 2.786;


        byte classLudmila = 23;

        byte classAnna = 27;

        byte classEkaterina = 30;

        short totalSheets = 480;

        int oneSheetPerStudent = totalSheets/(classLudmila + classAnna + classEkaterina);
        System.out.println("На каждого ученика рассчитано " + oneSheetPerStudent + " листов бумаги");


        byte machinePerformancePerOneMinute = 8;

        byte forTwentyMinutes = 20;

        int machinePerformancePerTwentyMinutes = machinePerformancePerOneMinute * forTwentyMinutes;
        System.out.println("За 20 минут машина произвела " + machinePerformancePerTwentyMinutes + " штук бытлок");

        short forDay = 1440;

        int machinePerformanceForDay = machinePerformancePerOneMinute * forDay;
        System.out.println("За 20 минут машина произвела " + machinePerformanceForDay + " штук бытлок");

        short forThreeDays = 4320;

        int machinePerformanceForThreeDays = machinePerformancePerOneMinute * forThreeDays;
        System.out.println("За 20 минут машина произвела " + machinePerformanceForThreeDays + " штук бытлок");

        int forMonth = 43200;

        long machinePerformanceForMonth = machinePerformancePerOneMinute * forMonth;
        System.out.println("За 20 минут машина произвела " + machinePerformanceForMonth + " штук бытлок");


        byte totalCansOfPaint = 120;

        byte whitePaintConsumptionPerClass = 2;

        byte brownPaintConsumptionPerClass = 4;

        int totalClasses = totalCansOfPaint/(whitePaintConsumptionPerClass + brownPaintConsumptionPerClass);

        int buyWhitePaintPerAllClasses = totalClasses * whitePaintConsumptionPerClass;

        int buyBrownPaintPerAllClasses = totalClasses * brownPaintConsumptionPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + buyWhitePaintPerAllClasses + " банок белой краски и " + buyBrownPaintPerAllClasses + " банок коричневой краски");


        byte bananas = 5;

        byte weightBanana = 80;

        int weightBananas = bananas * weightBanana;

        byte milk = 2;

        byte weightMilk = 105;

        int weightMilks = milk * weightMilk;

        byte iceCream = 2;

        byte weightIceCream = 50;

        int weightIceCreams = iceCream * weightIceCream;

        byte egg = 4;

        byte weightEgg = 70;

        int weightEggs = egg * weightEgg;

        int totalWeightGram = weightBananas + weightMilks + weightIceCreams + weightEggs;
        System.out.println(totalWeightGram + " грамм");

        short grPerKg = 1000;

        float totalWeightKilogram = totalWeightGram/(float)grPerKg;
        System.out.println(totalWeightKilogram + " килограмм");


        short needToReset = 7000;

        short loseEveryDay1 = 250;

        short loseEveryDay2 = 500;

        int needDaysToLoseWeight1 = needToReset/loseEveryDay1;
        System.out.println(needDaysToLoseWeight1 + " дней");

        int needDaysToLoseWeight2 = needToReset/loseEveryDay2;
        System.out.println(needDaysToLoseWeight2 + " дней");

        int needDaysOnAverage = (needDaysToLoseWeight1 + needDaysToLoseWeight2)/2;
        System.out.println(needDaysOnAverage + " день");


        int salaryMasha = 67760;

        int salaryDenis = 83690;

        int salaryKristina = 76230;

        float annualSalaryIncrease = 0.1f;

        byte year = 12;

        float salaryIncreaseMasha = salaryMasha * annualSalaryIncrease;

        float salaryIncreaseDenis = salaryDenis * annualSalaryIncrease;

        float salaryIncreaseKristina = salaryKristina * annualSalaryIncrease;

        float fullSalaryIncreaseMasha = salaryMasha + salaryIncreaseMasha;

        float fullSalaryIncreaseDenis = salaryDenis + salaryIncreaseDenis;

        float fullSalaryIncreaseKristina = salaryKristina + salaryIncreaseKristina;

        float fullSalaryIncreaseMashaYear = year * fullSalaryIncreaseMasha;

        float fullSalaryIncreaseDenisYear = year * fullSalaryIncreaseDenis;

        float fullSalaryIncreaseKristinaYear = year * fullSalaryIncreaseKristina;

        float fullSalaryMashaYear = year * salaryMasha;

        float fullSalaryDenisYear = year * salaryDenis;

        float fullSalaryKristinaYear = year * salaryKristina;

        float differenceInAnnualIncomeMasha = fullSalaryIncreaseMashaYear - fullSalaryMashaYear;

        float differenceInAnnualIncomeDenis = fullSalaryIncreaseDenisYear - fullSalaryDenisYear;

        float differenceInAnnualIncomeKristina = fullSalaryIncreaseKristinaYear - fullSalaryKristinaYear;

        System.out.println("Маша теперь получает " + fullSalaryIncreaseMasha + " рублей. Годовой доход вырос на " + differenceInAnnualIncomeMasha + " рублей");
        System.out.println("Денис теперь получает " + fullSalaryIncreaseDenis + " рублей. Годовой доход вырос на " + differenceInAnnualIncomeDenis + " рублей");
        System.out.println("Кристина теперь получает " + fullSalaryIncreaseKristina + " рублей. Годовой доход вырос на " + differenceInAnnualIncomeKristina + " рублей");

    }
}