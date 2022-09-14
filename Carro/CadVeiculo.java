

public class CadVeiculo {
    public static void main (String[] args) {
        Veiculo meuCarro = criaVeiculo("Palio", "Fiat", 2010);
        Veiculo teuCarro = criaVeiculo("Gol", "Volkswagen", 2008);
        Veiculo vizinhoCarro = new Veiculo();
        vizinhoCarro.clonar(meuCarro);

        Veiculo veiculoQuarto = criaVeiculo("Uno");

        System.out.printf("Teu carro é um %s %s %d \n",
            teuCarro.marca,
            teuCarro.modelo,
            teuCarro.anoModelo);

        int tempoUso;
        tempoUso = teuCarro.calculaTempoUso();
        System.out.println("Tempo de uso: " + tempoUso);

        System.out.printf("Meu carro é um %s da marca %s do ano %d \n",
            meuCarro.modelo,
            meuCarro.marca, 
            meuCarro.anoModelo);
            
        tempoUso = teuCarro.calculaTempoUso();
        System.out.println("Tempo de uso: " + tempoUso );


    }
        static Veiculo criaVeiculo(String modelo) {
            return criaVeiculo(modelo, "sem marca", 0);
        }  
        static Veiculo criaVeiculo(String modelo, String marca) {
            return criaVeiculo(modelo, marca, 0);
        }
        static Veiculo criaVeiculo(String modelo, String marca, int anoModelo) {
            Veiculo vei = new Veiculo();
            vei.modelo = modelo;
            vei.marca = marca;
            vei.anoModelo = anoModelo;
            return vei;
    }
}
