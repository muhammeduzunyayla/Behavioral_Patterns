public abstract class Banknot {
protected Banknot _banknot;
public void Sonraki(Banknot hesap){
    this._banknot=hesap;
}
public abstract Miktar ParaCek(int tutar);
}
