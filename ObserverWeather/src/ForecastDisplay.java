public class ForecastDisplay implements DisplayElement,Observer{
   private float mevcutBasinc= 29.92f;
   private float sonBasinc;
   private WeatherData weatherData;
   public ForecastDisplay(WeatherData weatherData){
       this.weatherData=weatherData;
       weatherData.registerObserver(this);
   }

   @Override
    public void guncelleme(float sicaklik, float nem, float basinc) {
        sonBasinc=mevcutBasinc;
        mevcutBasinc=basinc;
        display();
    }
    @Override
    public void display() {
        System.out.println("Tahmin:");
        if(mevcutBasinc>sonBasinc){
            System.out.println("Güzel günler göreceksin Güneşli günler");

        }
        else if(mevcutBasinc==sonBasinc){
            System.out.println("Aynı be ");
        }
        else if (mevcutBasinc<sonBasinc){
            System.out.println("Aga dikkat et, soğuk ve yağışlı geçecek");
        }
   }
}
