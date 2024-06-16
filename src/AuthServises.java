import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AuthServises {

    static Random random = new Random();


    public static void weather() {
        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.runAsync(() -> {
            int climate = random.nextInt(0, DB.climates.length);
            int gradus =
                    (climate == 0) ? random.nextInt(0, 20) :
                            (climate == 1) ? random.nextInt(-2, 9) :
                                    (climate == 2) ? random.nextInt(-20, 0) :
                                            (climate == 3) ? random.nextInt(-20, 7) :
                                                    (climate == 4) ? random.nextInt(0, 20) :
                                                            random.nextInt(0, 15);
            Climate climate1 = new Climate(DB.climates[climate].getName());


            Weather weather = new Weather(gradus, climate1);
            System.out.println("Loading...");
            try {
                Thread.sleep(3000);
                System.out.println(weather);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

            try {

                Thread.sleep(3100);
                while (true) {
                    System.out.println("""
                        1.Refresh
                        2.back""");
                    switch (Input.input_INT("choose: ")) {
                        case 1 -> {
                            weather();
                        }
                        case 2 -> {
                            return;
                        }
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }


    public static void dollarKurs() throws InterruptedException {
        CompletableFuture.runAsync(() -> {
            int dollirOlish = random.nextInt(12000, 12450);
            int dollirSotish = random.nextInt(dollirOlish, dollirOlish + 10);
            int euroOlish = random.nextInt(13000, 13600);
            int euroSotish = random.nextInt(euroOlish, euroOlish + 200);
            int rublOlish = random.nextInt(90, 140);
            int rublSotish = random.nextInt(rublOlish, rublOlish + 20);

            DollarKurs dollarKurs111 = new DollarKurs(dollirOlish, dollirSotish, euroOlish, euroSotish, rublOlish, rublSotish);
            try {
                System.out.println("Loading...");
                Thread.sleep(3000);
                System.out.println(dollarKurs111);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread.sleep(3100);
        while (true) {
            System.out.println("""
                    1.Refresh
                    2.back""");
            switch (Input.input_INT("choose: ")) {
                case 1 -> {
                    dollarKurs();
                }
                case 2 -> {
                    return;
                }
            }


        }
    }
}
