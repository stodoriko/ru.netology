import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class MyStatsServiceTest {

    @Test
    public void shouldGetSalesSum() {
        StatsService service = new StatsService();

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = service.allSalesSum(arr);
        System.out.println("Сумма всех продаж: " + sum);
    }


    @Test
    public void shouldGetAvgSalesSum() {
        StatsService service = new StatsService();

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int averageSum = service.avgSum(arr);
        System.out.println("Средняя сумма всех продаж: " + averageSum);
    }


    @Test
    public void shouldGetMaxSalesMonth() {
        StatsService service = new StatsService();

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int maxMonth = service.maxSalesMonth(arr);
        System.out.println("Лучший месяц по продажам: " + maxMonth);
    }


    @Test
    public void shouldGetMinSalesMonth() {
        StatsService service = new StatsService();

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int numberMonth = service.minSalesMonth(arr);
        System.out.println("Худший месяц по продажам: " + numberMonth);
    }


    @Test
    public void shouldGetBelowAvgMonth() {
        StatsService service = new StatsService();

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int numberMonths = service.belowAvgMonths(arr);
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего: " + numberMonths);
    }

    
    @Test
    public void shouldGetAboveAvgMonth() {
        StatsService service = new StatsService();

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int numberMonths = service.aboveAvgMonths(arr);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего: " + numberMonths);
    }
}
