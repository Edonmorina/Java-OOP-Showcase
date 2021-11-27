package Autosalloni.Automjetet;

public abstract class Automjeti {
    private String nrShasise;
    private String prodhuesi;
    private int vitiProdhimit;

    public Automjeti(String nrShasise, String prodhuesi, int vitiProdhimit) {
        this.nrShasise = nrShasise;
        this.prodhuesi = prodhuesi;
        this.vitiProdhimit = vitiProdhimit;
    }

    public String getNrShasise() {
        return nrShasise;
    }

    public String getProdhuesi() {
        return prodhuesi;
    }

    public void setProdhuesi(String prodhuesi) {
        this.prodhuesi = prodhuesi;
    }

    public int getVitiProdhimit() {
        return vitiProdhimit;
    }

    public void setVitiProdhimit(int vitiProdhimit) {
        this.vitiProdhimit = vitiProdhimit;
    }

    public abstract boolean eshteAutomatik();

    @Override
    public String toString() {
        return nrShasise + " : " + prodhuesi + " - " + vitiProdhimit;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Automjeti) {
            Automjeti a = (Automjeti) obj;
            if (nrShasise.equals(a.getNrShasise())) {
                return true;
            }
            ;
        }
        return false;
    }
}
