public class Musteri {
    String name;
    private int tcNo;
    private int maas;
    private int kbbSkor;
    private int geciktirmeAy;
    public Musteri(String name,int tcNo, int maas, int kbbSkor, int geciktirmeAy){
        this.name=name;
        this.tcNo=tcNo;
        this.maas=maas;
        this.kbbSkor=kbbSkor;
        this.geciktirmeAy=geciktirmeAy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTcNo() {
        return tcNo;
    }

    public void setTcNo(int tcNo) {
        this.tcNo = tcNo;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public int getKbbSkor() {
        return kbbSkor;
    }

    public void setKbbSkor(int kbbSkor) {
        this.kbbSkor = kbbSkor;
    }

    public int getGeciktirmeAy() {
        return geciktirmeAy;
    }

    public void setGeciktirmeAy(int geciktirmeAy) {
        this.geciktirmeAy = geciktirmeAy;
    }
}
