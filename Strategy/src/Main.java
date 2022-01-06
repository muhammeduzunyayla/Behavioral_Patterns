public class Main {

    public static void main(String[] args) {
	 Context context=new Context(new YilbasiTheme());
     context.temaGetir();
     context.indirimgetir(100);



     Context context1=new Context(new WeekendTheme());
     context1.temaGetir();
     context1.indirimgetir(200);

     Context context2=new Context(new DefaultTheme());
     context2.temaGetir();
     context2.indirimgetir(500);

    }
}
