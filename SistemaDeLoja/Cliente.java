
class Cliente {
    private String CPF;
    private String nome;
    private String Email;
    private String endereço;

    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }  
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String toString() {
        System.out.println("Cliente [CPF=" + CPF + ", nome=" + nome + ", Email=" + Email + ", endereço=" + endereço + "]");
        return null;
    }

    public Cliente (String CPF, String nome, String Email, String endereço) {
        this.CPF = CPF;
        this.nome = nome;
        this.Email = Email;
        this.endereço = endereço;
    }

}
