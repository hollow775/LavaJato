public class Main {

    public static void main(String[] args) {
        // criar os objetos necessário para a execução do algoritmo
        Fila F = new Fila();
        Fila espera = new Fila();
        Object objeto = new Object();

        //criar os carros
        Carro carro1 = new Carro(1,"2Ch123t", "Sedan", "azul",5);
        Carro carro2 = new Carro(2, "4Ta543i", "Hatch", "Preto", 5);
        Carro carro3 = new Carro(3, "7tuY019o", "SUV", "Rosa", 5);
        Carro carro4 = new Carro(4, "9asd123l", "Cupe", "Cinza", 2);
        Carro carro5 = new Carro(5, "0dsd980g", "Conversivel", "Preto", 4);
        //criar as motos
        Moto moto1 = new Moto(6, "1abc123a", true, 160, true);
        Moto moto2 = new Moto(7,"1abc123b", false, 100, true);
        Moto moto3 = new Moto(8,"1abc123c", false, 50, false);
        Moto moto4 = new Moto(9,"1abc123d", true, 50, false);
        Moto moto5 = new Moto(10,"1abc123e", true, 1500, true);
        //criar os caminhoes
        Caminhao caminhao1 = new Caminhao(11, "2Ch123a", true, 2, 24);
        Caminhao caminhao2 = new Caminhao(12, "2Ch123b", false, 2, 30);
        Caminhao caminhao3 = new Caminhao(13, "2Ch123c", false, 2, 32);
        Caminhao caminhao4 = new Caminhao(14, "2Ch123d", false, 3, 40);
        Caminhao caminhao5 = new Caminhao(15, "2Ch123e", true, 3, 45);

        //fila com os objetos
        F.insere(carro1);
        F.insere(carro2);
        F.insere(carro3);
        F.insere(carro4);
        F.insere(carro5);
        F.insere(moto1);
        F.insere(moto2);
        F.insere(moto3);
        F.insere(moto4);
        F.insere(moto5);
        F.insere(caminhao1);
        F.insere(caminhao2);
        F.insere(caminhao3);
        F.insere(caminhao4);
        F.insere(caminhao5);

        //while que vai fazer os carros entrarem na fila e sairem
        while(!F.fila_vazia()){
            if(espera.getTamanho()<3){
                espera.insere(F.remove());
            }else if(espera.getTamanho()==3){
                objeto = espera.remove();
                System.out.println("-----------LAVADO-----------");
                dadosVeiculo(objeto);
                System.out.println("-----------NA ESPERA-----------");
                objeto = espera.getObj1();
                dadosVeiculo(objeto);
                objeto = espera.getObj2();
                dadosVeiculo(objeto);
            }
        }
        while(!espera.fila_vazia()){
            objeto = espera.remove();
            dadosVeiculo(objeto);
        }
    }
    public static void imprimirCarro(Carro dadosCarro) {
        System.out.println("O id do carro é: " + dadosCarro.getId());
        System.out.println("O chassi do carro é: " + dadosCarro.getChassi());
        System.out.println("O modelo do carro é: " + dadosCarro.getModelo());
        System.out.println("A cor do carro é: " + dadosCarro.getCor());
        System.out.println("O carro tem: " + dadosCarro.getAssentos() + " assentos");
    }
    public static void imprimirMoto(Moto dadosMoto){
        System.out.println("O id da moto é: "+dadosMoto.getId());
        System.out.println("O chassi da moto é: "+dadosMoto.getChassi());
        System.out.println("A moto tem "+dadosMoto.getCilindradas());
        System.out.println("A moto tem marcha?"+dadosMoto.isMarcha());
        System.out.println("A moto tem abafador de escapamento? "+dadosMoto.isAbafadorEsc());
    }
    public static void imprimirCaminhao(Caminhao dadosCaminhao){
        System.out.println("O id do caminhao é: "+dadosCaminhao.getId());
        System.out.println("O chassi do caminhao é: "+dadosCaminhao.getChassi());
        System.out.println("A carga máxima é: "+dadosCaminhao.getCargaMaxima()+" toneladas");
        System.out.println("O caminhao tem radio?: "+dadosCaminhao.isRadio());
        System.out.println("O caminhao tem "+dadosCaminhao.getEixos()+" eixos");
    }
    public static void dadosVeiculo(Object objeto){
        Carro dadosCarro = new Carro();
        Moto dadosMoto = new Moto();
        Caminhao dadosCaminhao = new Caminhao();
        if(objeto instanceof Carro){
            dadosCarro = (Carro) objeto;
            System.out.println("-----------CARRO-----------");
            imprimirCarro(dadosCarro);
        }else if(objeto instanceof Moto){
            dadosMoto = (Moto) objeto;
            System.out.println("-----------MOTO----------");
            imprimirMoto(dadosMoto);
        }else{
            dadosCaminhao = (Caminhao) objeto;
            System.out.println("-----------CAMINHÃO-----------");
            imprimirCaminhao(dadosCaminhao);
        }
    }
}
