public class Main {

    public static void main(String[] args) {
	WeatherData weatherData=new WeatherData();
    İstatistikEkranı i̇statistikEkranı=new İstatistikEkranı(weatherData);
    ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);

    weatherData.olcumuDuzenle(80,65,30.4f);
    weatherData.olcumuDuzenle(82,70,29.4f);
    weatherData.olcumuDuzenle(78,90,29.2f);

    }
}
