public abstract class AbstractKrediIstegi {

    public boolean KrediOnaylandi;
    //Bu veri bizim nesneler arasında taşımak isteyeceğimiz veri
    //Birden fazla da olabilirdi.Genelde öyle olur

    protected  AbstractKrediIstegi siradakiIslem;
    public void setNext(AbstractKrediIstegi islem){
        this.siradakiIslem=islem;
    }
    public void Execute(Musteri m){
        ExecuteProcess(m);
        if (this.siradakiIslem != null){
            this.siradakiIslem.KrediOnaylandi=this.KrediOnaylandi;
            //her seferinde bir sonrakine aktarılır
            this.siradakiIslem.Execute(m);
        }

    }
   public abstract void ExecuteProcess(Musteri musteri);
}
