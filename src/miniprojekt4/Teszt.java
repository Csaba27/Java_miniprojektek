package miniprojekt4;

public class Teszt {
    public static void main(String[] args) {
        RegularisSzamla szamla1 = new RegularisSzamla("1");
        RegularisSzamla szamla2 = new RegularisSzamla("2");
        szamla1.betesz(100);
        szamla1.kivesz(500);
        System.out.println(szamla1);
        szamla2.betesz(100);
        szamla2.kivesz(100);
        System.out.println(szamla1);

        FolyoSzamla szamla3 = new FolyoSzamla("3");
        FolyoSzamla szamla4 = new FolyoSzamla("4");

        szamla3.betesz(100);
        szamla3.kivesz(10);
        szamla3.kivesz(10);
        szamla3.kivesz(10);
        szamla3.kivesz(10);
        szamla3.levonKoltseg();
        System.out.println(szamla3.getEgyenleg());
        szamla3.kivesz(20);
        szamla3.levonKoltseg();
        System.out.println(szamla3.getEgyenleg());
        System.out.println(szamla3.equals(szamla4));
        System.out.println(szamla3.equals(szamla3));
        System.out.println(szamla3.equals(null));
        System.out.println(szamla3);

        TakarekSzamla szamla5 = new TakarekSzamla("5", 6.0);

        TakarekSzamla szamla6 = new TakarekSzamla("5", 6.0);
        System.out.println(szamla5.equals(szamla6));
        szamla6.setKamatRata(1.2);
        szamla6.betesz(1000);
        szamla6.kivesz(200);
        System.out.println(szamla6.getEgyenleg());
        System.out.println(szamla6.getKamatRata());
        szamla6.hozzaadKamat();
        System.out.println(szamla6.getEgyenleg());
        System.out.println(szamla6);
    }
}
