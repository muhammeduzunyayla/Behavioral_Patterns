public class MusteriMaasiKontrolu extends AbstractKrediIstegi{
    @Override
    public void ExecuteProcess(Musteri musteri) {
        if(super.KrediOnaylandi){
            // bir önceki adımdan geçtiyse buraya gelir
            int musteriMaas=musteri.getMaas();
            if(musteriMaas>6250){
                super.KrediOnaylandi=true;
            }
            else {
                super.KrediOnaylandi=false;
            }
        }
    }
}
