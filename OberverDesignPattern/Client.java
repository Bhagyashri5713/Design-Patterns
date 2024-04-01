package OberverDesignPattern;

public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer phone = new PhoneDisplay();
        Observer tv = new TvDisplay();

        weatherStation.addOberver(phone);
        weatherStation.addOberver(tv);

        weatherStation.setWeather("Sunny");
    }
}
