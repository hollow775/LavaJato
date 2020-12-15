public class Moto {
    private int id = 0;
    private String chassi = "";
    private boolean abafadorEsc;
    private float cilindradas = 0;
    private boolean marcha;

    public Moto(){
    }
    public Moto(int id, String chassi, boolean abafadorEsc, float cilindradas, boolean marcha) {
        this.id = id;
        this.chassi = chassi;
        this.abafadorEsc = abafadorEsc;
        this.cilindradas = cilindradas;
        this.marcha = marcha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public boolean isAbafadorEsc() {
        return abafadorEsc;
    }

    public void setAbafadorEsc(boolean abafadorEsc) {
        this.abafadorEsc = abafadorEsc;
    }

    public float getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(float cilindradas) {
        this.cilindradas = cilindradas;
    }

    public boolean isMarcha() {
        return marcha;
    }

    public void setMarcha(boolean marcha) {
        this.marcha = marcha;
    }
}

