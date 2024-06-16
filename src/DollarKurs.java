import java.util.Locale;

public class DollarKurs {
    private int kursSotishDollar;
    private int kursOlishDollar;
    private int kursSotishEuro;
    private int kursOlishEuro;
    private int kursSotishRuble;
    private int kursOlishRuble;


    public DollarKurs(int kursSotishDollar, int kursOlishDollar, int kursSotishEuro, int kursOlishEuro, int kursSotishRuble, int kursOlishRuble) {
        this.kursSotishDollar = kursSotishDollar;
        this.kursOlishDollar = kursOlishDollar;
        this.kursSotishEuro = kursSotishEuro;
        this.kursOlishEuro = kursOlishEuro;
        this.kursSotishRuble = kursSotishRuble;
        this.kursOlishRuble = kursOlishRuble;
    }

    public int getKursSotishDollar() {
        return kursSotishDollar;
    }

    public void setKursSotishDollar(int kursSotishDollar) {
        this.kursSotishDollar = kursSotishDollar;
    }

    public int getKursOlishDollar() {
        return kursOlishDollar;
    }

    public void setKursOlishDollar(int kursOlishDollar) {
        this.kursOlishDollar = kursOlishDollar;
    }

    public int getKursSotishEuro() {
        return kursSotishEuro;
    }

    public void setKursSotishEuro(int kursSotishEuro) {
        this.kursSotishEuro = kursSotishEuro;
    }

    public int getKursOlishEuro() {
        return kursOlishEuro;
    }

    public void setKursOlishEuro(int kursOlishEuro) {
        this.kursOlishEuro = kursOlishEuro;
    }

    public int getKursSotishRuble() {
        return kursSotishRuble;
    }

    public void setKursSotishRuble(int kursSotishRuble) {
        this.kursSotishRuble = kursSotishRuble;
    }

    public int getKursOlishRuble() {
        return kursOlishRuble;
    }

    public void setKursOlishRuble(int kursOlishRuble) {
        this.kursOlishRuble = kursOlishRuble;
    }

    @Override
    public String toString() {
        return String.format(Locale.US,"------------------------------------------------------------------\n\uD83C\uDDFA\uD83C\uDDF8Dollars\nsotib olish: %d \t\t\t sotish: %d\n\uD83C\uDDEA\uD83C\uDDFAEuro\nsotib olish: %d \t\t\t sotish: %d\n\uD83C\uDDF7\uD83C\uDDFARuble\nsotib olish: %d \t\t\t sotish: %d\n------------------------------------------------------------------\n", kursSotishDollar,kursOlishDollar,kursSotishEuro,kursOlishEuro,kursSotishRuble,kursOlishRuble);
    }
}
