public class Caminhao {
    private int id = 0;
    private String chassi = "";
    private boolean radio;
    private int eixos = 0;
    private float cargaMaxima = 0;

    public Caminhao(){
    }
    public Caminhao(int id, String chassi, boolean radio, int eixos, float cargaMaxima){
        this.id = id;
        this.chassi = chassi;
        this.radio = radio;
        this.eixos = eixos;
        this.cargaMaxima = cargaMaxima;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getChassi(){
        return chassi;
    }
    public void setChassi(String chassi){
        this.chassi = chassi;
    }
    public boolean isRadio(){
        return radio;
    }
    public void setRadio(boolean radio){
        this.radio = radio;
    }
    public int getEixos(){
        return eixos;
    }
    public void setEixos(int eixos){
        this.eixos = eixos;
    }
    public float getCargaMaxima(){
        return cargaMaxima;
    }
    public void setCargaMaxima(float cargaMaxima){
        this.cargaMaxima = cargaMaxima;
    }

}
