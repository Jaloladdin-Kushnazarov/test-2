import java.util.Random;

public class Weather {
    private int gradust;
    private Climate climate;

    public Weather(int gradust, Climate climate) {
        this.gradust = gradust;
        this.climate = climate;
    }

    public int getGradust() {
        return gradust;
    }

    public void setGradust(int gradust) {
        this.gradust = gradust;
    }

    public Climate getClimate() {
        return climate;
    }

    public void setClimate(Climate climate) {
        this.climate = climate;
    }

    @Override
    public String toString() {
        return "-----------------------------------------\nGradus: " + gradust + "ºC\nWeather: " + climate + "\n-----------------------------------------";
    }
}
