public class Ansiklopedi extends Book{
    // UML diyagramındaki Element'ten türer.
// Kabulet metoduna bulunduğu nesne örneği gönderilir.
// UML diyagramındaki ConcreteElement yapısına denk gelir.
    @Override
    public void kabulet(IBookZiyaretci ziyaretci) {
        ziyaretci.ihracatZiyaretcisi(this);

    }


}
