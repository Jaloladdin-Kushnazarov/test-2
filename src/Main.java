import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        while (true) {
            Thread.sleep(3100);
            dispeyMenu();
            switch (Input.input_INT("choose: ")) {
                case 1 -> AuthServises.weather();
                case 2 -> AuthServises.dollarKurs();
            }
        }
    }

    private static void dispeyMenu() {
        System.out.println("""
                1.Weather
                2.Dollar Kurs""");
    }
}