public abstract class Book {
    //Temel sınıftır
    //Yeni davranışları kabulet metodu ile alır
    //Uml de Elemente denk gelir
    String name;
    String yazar;
    String kategorisi;

    public abstract void kabulet(IBookZiyaretci ziyaretci);
}
