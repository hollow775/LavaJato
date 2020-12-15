public class Carro {
    private int id = 0;
    private String chassi = "";
    private String modelo = "";
    private String cor = "";
    private int assentos = 0;

    public Carro(){
    }
    public Carro(int id, String chassi, String modelo, String cor, int assentos){
        this.id = id;
        this.chassi = chassi;
        this.modelo = modelo;
        this.cor = cor;
        this.assentos = assentos;
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
    public String getModelo(){
        return modelo;
    }
    public void serModelo(String modelo){
        this.modelo = modelo;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public int getAssentos(){
        return assentos;
    }
    public void setAssentos(int assentos){
        this.assentos = assentos;
    }

}
