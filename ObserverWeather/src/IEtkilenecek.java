public interface IEtkilenecek {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
