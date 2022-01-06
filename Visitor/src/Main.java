public class Main {

    public static void main(String[] args) {

        Book roman=new Roman();
        roman.name="Serenad";
        roman.yazar="Zülfü Livaneli";
        roman.kategorisi="Roman";

        Book ansiklopedi=new Ansiklopedi();
        ansiklopedi.name="Almanya Tarihi";
        ansiklopedi.yazar="Çağdaş Atan";
        ansiklopedi.kategorisi="Ansiklopedi";

        IBookZiyaretci xml=new Xml();
        IBookZiyaretci json=new Json();

        roman.kabulet(xml);
        roman.kabulet(json);
        ansiklopedi.kabulet(xml);
        ansiklopedi.kabulet(json);


    }
}
//yılbaşı teması 20 indirim
//hafta sonu düzeni 5 indirim
//bir de normal arayüzümüz var