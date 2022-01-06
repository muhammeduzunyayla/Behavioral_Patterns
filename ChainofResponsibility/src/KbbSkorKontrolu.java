public class KbbSkorKontrolu extends AbstractKrediIstegi{
    @Override
    public void ExecuteProcess(Musteri musteri) {
        //Burada kbb skorunun kontrol edildiğini düşünün
        //Yani bu veriyi bir yerden aldık
        int kbbSkor=musteri.getKbbSkor();
        if(kbbSkor>1000){
            super.KrediOnaylandi=true;
        }
        else{
            super.KrediOnaylandi=false;
        }
    }
}
