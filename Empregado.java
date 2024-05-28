public abstract class Empregado {
    private String nome;
    
    public Empregado(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + '}';
    }
    
    // Método abstrato sobrescrito pelas subclasses
    public abstract double calcularSalario(); // Renomeado de "salarios" para "calcularSalario"
}
