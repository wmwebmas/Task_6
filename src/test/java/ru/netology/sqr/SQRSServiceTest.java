package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRSServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/CsvParams.csv")

    public void testQuantity (int firstNum, int secondNum) {

        SQRSService service = new SQRSService();

        int quantity = service.calcSqrt (firstNum, secondNum);

        Assertions.assertEquals(firstNum, secondNum, quantity);
    }
}
