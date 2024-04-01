package miniprojekt4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Tranzakcio {
    enum TranzakcioTipus {
        DEPOSIT,
        WITHDRAW
    }

    public LocalDateTime idopont;
    TranzakcioTipus tranzTipus;
    public double osszeg;

    public Tranzakcio(TranzakcioTipus tranzTipus, double osszeg) {
        this.idopont = LocalDateTime.now();
        this.tranzTipus = tranzTipus;
        this.osszeg = osszeg;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String idopont = this.idopont.format(formatter);

        return "Tranzakcio{" +
                "idopont=" + idopont +
                ", tranzTipus=" + tranzTipus +
                ", osszeg=" + osszeg +
                '}';
    }
}
