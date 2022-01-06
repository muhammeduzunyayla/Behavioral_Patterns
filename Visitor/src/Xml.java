public class Xml implements IBookZiyaretci{
    @Override
    public void ihracatZiyaretcisi(Roman roman) {
        System.out.println(roman.name + " Xml formatına dönüştürüldü");
    }

    @Override
    public void ihracatZiyaretcisi(Ansiklopedi ansiklopedi) {
        System.out.println(ansiklopedi.name+" Xml formatına dönüştürüldü");

    }
}
