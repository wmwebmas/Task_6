import ru.netology.sqr.SQRSService;

public class Main {

    public static void main(String[] args) {
        SQRSService service = new SQRSService();
        int result = service.calcSqrt(10,99);
        System.out.println("Количество квадратных корней в диапазоне от 10 до 99 составляет: " + result);

    }
}
