public class İstatistikEkranı implements Observer,DisplayElement{
    private float maksSicaklik=0.0f;
    private float minSicaklik=200;
    private float sicaklikTop=0.0f;
    private int numReadings;
    private WeatherData weatherData;
    public İstatistikEkranı(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Ortalama/Max/Min sicaklik = " + (sicaklikTop / numReadings) + "/" + maksSicaklik + "/" + minSicaklik);

    }

    @Override
    public void guncelleme(float sicaklik, float nem, float basinc) {
        sicaklikTop += sicaklik;
        numReadings++;
        if(sicaklik>maksSicaklik){
            maksSicaklik=sicaklik;
        }
        if(sicaklik<minSicaklik){
            minSicaklik=sicaklik;
        }
        display();
    }

}
