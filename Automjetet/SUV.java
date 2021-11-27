package Autosalloni.Automjetet;

public class SUV extends Automjeti {
    private boolean eshte4x4;

    public SUV(String nrShasise, String prodhuesi, int vitiProdhimit, boolean eshte4x4) {
        super(nrShasise, prodhuesi, vitiProdhimit);
        this.eshte4x4 = eshte4x4;
    }

    public boolean getEshte4x4() {
        return eshte4x4;
    }

    public void setEshte4x4(boolean eshte4x4) {
        this.eshte4x4 = eshte4x4;
    }

    @Override
    public boolean eshteAutomatik() {
        return false;
    }

    @Override
    public String toString() {
        if (eshte4x4) {
            return "SUV " + super.toString() + " : eshte 4x4";
        } else {
            return "SUV " + super.toString() + " : nuk eshte 4x4";
        }
    }

}
