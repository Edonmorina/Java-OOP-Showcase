package Autosalloni;

import Autosalloni.Automjetet.Automjeti;

public class Autosalloni {
    private String emri;
    private int index = 0;
    private Automjeti[] autosalloni;
    private static int nrAutomjeteve;

    public Autosalloni(String emri) {
        this.emri = emri;
    }

    static {
        System.out.println("Blloku statik");
        nrAutomjeteve = 250;
    }

    {
        System.out.println("Blloku jo-statik");
        autosalloni = new Automjeti[nrAutomjeteve];
        autosalloni[index++] = new Coupe("01GRIAO5296KRIHO5", "Mercedes", 2, 2);
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public boolean exists(Automjeti a) {
        for (int i = 0; i < index; i++) {
            if (autosalloni[i].equals(a)) {
                return true;
            }
        }
        return false;
    }

    public void shtoAutomjetin(Automjeti a) {
        if (a == null) {
            System.out.println("Automjeti nuk eshte incializuar");
        } else if (exists(a)) {
            System.out.println("Automjeti ekziston ne varg");
        } else if (index == autosalloni.length) {
            System.out.println("Nuk ka me vend ne varg");
        } else {
            autosalloni[index++] = a;
        }
    }

    public Automjeti avgNumriUlseve() {
        int avgSum = 0; // avgSum / nrAutomjeteve = avg;
        int nrAutomjeteve = autosalloni.length;
        int avg = avgSum / nrAutomjeteve;

        Automjeti automjetiMePakUlse = null;

        for (int i = 0; i < index; i++) {
            if (autosalloni[i] instanceof Coupe) {
                avgSum += ((Coupe) autosalloni[i]).getNrUlseve();
            }
        }

        for (int i = 0; i < index; i++) {
            if (autosalloni[i] instanceof Coupe) {
                if (automjetiMePakUlse == null || ((Coupe) autosalloni[i]).getNrUlseve() <= avg) {
                    automjetiMePakUlse = (Coupe) autosalloni[i];
                }
            }
        }

        return automjetiMePakUlse;
    }

    public void shtypAutomatik(boolean b) {
        for (int i = 0; i < index; i++) {
            if (autosalloni[i].eshteAutomatik() == b) {
                System.out.println(autosalloni[i]);
            }
        }
    }

    public class Minibusi extends Automjeti {
        private int nrDyerve;

        public Minibusi(String nrShasise, String prodhuesi, int vitiProdhimit, int nrDyerve) {
            super(nrShasise, prodhuesi, vitiProdhimit);
            this.nrDyerve = nrDyerve;
        }

        @Override
        public boolean eshteAutomatik() {
            return true;
        }

        @Override
        public String toString() {
            return "Minibusi " + super.toString() + " : " + nrDyerve;
        }
    }

    static class Coupe extends Automjeti {
        private int nrUlseve;

        public Coupe(String nrShasise, String prodhuesi, int vitiProdhimit, int nrUlseve) {
            super(nrShasise, prodhuesi, vitiProdhimit);
            this.nrUlseve = nrUlseve;
        }

        public int getNrUlseve() {
            return nrUlseve;
        }

        public void setNrUlseve(int nrUlseve) {
            this.nrUlseve = nrUlseve;
        }

        @Override
        public boolean eshteAutomatik() {
            return false;
        }

        @Override
        public String toString() {
            return "Coupe " + super.toString() + " - me " + nrUlseve + " ulese";
        }
    }
}
