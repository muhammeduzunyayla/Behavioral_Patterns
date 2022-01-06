public class Json implements IBookZiyaretci{
    @Override
    public void ihracatZiyaretcisi(Roman roman) {
        System.out.println(roman.name+" Json formatına dönüştürüldü");
    }

    @Override
    public void ihracatZiyaretcisi(Ansiklopedi ansiklopedi) {
        System.out.println(ansiklopedi.name + " Json formatına dönüştürüldü");

    }
}
