public class KrediKartiOdemeZamaniKontrolu extends AbstractKrediIstegi{
    @Override
    public void ExecuteProcess(Musteri musteri) {
        if(super.KrediOnaylandi){//Bir önceki adımdan geçtiyse bunu çalıştırır
            //burada daha önce kredi kartı borcunu geciktirip geciktirmediği
            //bilgisi alınarak geciktirdiyse kaç ay geciktirdiği verisi getiriliyor
            int OdemeZamani=musteri.getGeciktirmeAy();
            if(OdemeZamani > 3){// eğer 3 aydan fazla bir gecikme süresi varsa red
                super.KrediOnaylandi=false;


            }
            else{
                super.KrediOnaylandi=true;
            }

        }
    }
}
