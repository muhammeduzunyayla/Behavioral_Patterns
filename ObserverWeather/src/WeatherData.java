import java.util.ArrayList;
import java.util.List;

public class WeatherData implements IEtkilenecek{
    private List<Observer> observers;
    private float sicaklik;
    private  float nem;
    private  float basinc;

    public WeatherData(){
        observers=new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i =observers.indexOf(o);
        if(i>=0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i=0; i<observers.size();i++){
            Observer observer= (Observer) observers.get(i);
            observer.guncelleme(sicaklik,nem,basinc);
        } }
    public  void olcumunDegismesi(){
        notifyObservers();
    }
      public void olcumuDuzenle(float sicaklik,float nem,float basinc){
        this.sicaklik=sicaklik;
        this.nem=nem;
        this.basinc=basinc;
        olcumunDegismesi();
      }

    public float getBasinc() {
        return basinc;
    }

    public float getNem() {
        return nem;
    }

    public float getSicaklik() {
        return sicaklik;
    }
}
