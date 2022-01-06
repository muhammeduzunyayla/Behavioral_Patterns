public interface IBookZiyaretci {
    // Her ConcreteVisitor örneği için metot temsil eder.
// Parametre olarak Element sınıfından türeyen sınıfların örneğini alır.
// UML diyagramındaki Visitor yapısına denk gelir.

    void ihracatZiyaretcisi(Roman roman);
    void ihracatZiyaretcisi(Ansiklopedi ansiklopedi);
}
