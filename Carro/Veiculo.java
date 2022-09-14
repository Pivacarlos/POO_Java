import java.util.Calendar;

class Veiculo {
    String modelo;
    String marca;
    int anoModelo;
    
    int calculaTempoUso() {
        Calendar calendar = Calendar.getInstance();
        int tempoUso = calendar.get(Calendar.YEAR) - this.anoModelo;
        return tempoUso;

    void clonar (Veiculo veiculoOrigem) {
        this.modelo = veiculoOrigem.modelo;
        this.marca = veiculoOrigem.marca;
        this.anoModelo = veiculoOrigem.anoModelo;
        
    }
}
