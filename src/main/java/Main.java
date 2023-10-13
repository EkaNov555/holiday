import ru.netology.javaql.javaqlmvn.services.HolidayService;

public class Main {
    public static void main(String[] args) {
        HolidayService service = new HolidayService();
        int holiday = service.calcHoliday(10000, 3000, 20000);
        System.out.println(holiday);
    }
}
