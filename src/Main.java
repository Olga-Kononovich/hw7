public class Main {
    public static void main(String[] args) {

        int totalAmount = 2459000;
        int contribution = 15000;
        int totalSavings = 0;
        int months = 0;

        while (totalSavings < totalAmount) {
            totalSavings += contribution;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + totalSavings + " рублей");
        }


        for (int a = 1; a <= 10; a = a + 1) {
            System.out.print(a);
        }


        int start = 10;
        while (start > 0) {
            System.out.print(start);
            start = start - 1;
        }


        int populationСountry = 12000000;
        int birthRate = 17;
        int mortality = 8;
        int on = 1000;
        int year = 1;
        while (year <= 10) {
            populationСountry = (birthRate - mortality) * on + populationСountry;
            System.out.println("Год " + year + ", численность населения составляет " + populationСountry);
            year++;
        }


        int amountMonth = 15000;
        int finalAccumulation = 12_000_000;
        int month = 0;
        double totalSavings1 = 0;
        double percent = 1.07;
        while (totalSavings1 < finalAccumulation) {
            totalSavings1 += amountMonth * percent;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");
            }
        }


        int amountMonth1 = 15000;
        int finalAccumulation1 = 12_000_000;
        int month1 = 0;
        int totalSavings2 = 0;
        double percent1 = 1.07;
        while (totalSavings2 < finalAccumulation1) {
            totalSavings2 += amountMonth1 * percent1;
            month1++;
            {
                System.out.println("Месяц " + month1 + ", сумма накоплений равна " + totalSavings2 + " рублей");
            }
        }


        int depositAmount2 = 15000;
        int bid2 = 7;
        int time = 108;
        for (int i = 0; i < time; i = i + 6) {
            depositAmount2 += depositAmount2 * bid2 / 100;
            if (time % 6 == 0) ;
            System.out.println("Через " + (i + 6) + " месяцев сумма накоплений: " + depositAmount2 + " рублей");
        }


        int firstFriday = 5;
        int daysInMonth = 31;
        for (int day = firstFriday; day <= daysInMonth; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }


        int currentYear =2025;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int cometPeriod = 79;
        for (int year1 = startYear; year1<= currentYear; year1++) {
            if (year1 % cometPeriod ==0 ) {
                System.out.println(+ year1+ "годы появления кометы за последние 200 лет");
            }
        }
        int nextCometYear = (currentYear / cometPeriod + 1) * cometPeriod;
        System.out.println("Следующий год появления кометы:");
        System.out.println(nextCometYear);
    }

}

































