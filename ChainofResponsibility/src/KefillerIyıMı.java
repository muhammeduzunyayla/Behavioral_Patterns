public class KefillerIyıMı extends AbstractKrediIstegi {
    @Override
    public void ExecuteProcess(Musteri musteri) {
        if(super.KrediOnaylandi){//Bir önceki adımdan geçtiyse
            //müşterinin varsa kefilinin sağlam olup olmadığına bakılıyor diye düşünülebilir
            boolean KefilIyiMi=true;
            if(KefilIyiMi){
                super.KrediOnaylandi=true;
            }
            else {
                super.KrediOnaylandi=false;
            }

        }
    }
}
