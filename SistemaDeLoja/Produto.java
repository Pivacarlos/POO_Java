class Produto {

    private int codigo;
    private String nome;
    private double preco;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco; 
    }

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

        public String toString(double porcetagem) { double precoAtual = preco * porcetagem; 
            System.out.println("Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + precoAtual + "]");
            return null;
        }
} 