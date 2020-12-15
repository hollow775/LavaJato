import java.util.ArrayList;
import java.util.List;

public class Fila {
    int tamanho = 0;

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    List<Object> objeto = new ArrayList<>();
    void insere(Object a){
        this.objeto.add(a);
        this.tamanho++;
    }
    Object remove(){
        this.tamanho--;
        return this.objeto.remove(0);
    }
    Object getObj1(){
        return this.objeto.get(0);
    }
    Object getObj2(){
        return this.objeto.get(1);
    }
    boolean fila_vazia(){
        return this.objeto.isEmpty();
    }


}
