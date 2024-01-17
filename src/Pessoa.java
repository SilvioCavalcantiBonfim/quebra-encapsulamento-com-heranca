import numero.Endereco;

public class Pessoa {
  private String nome;
  private Endereco endereco;
  public Pessoa() {
  }
  public Pessoa(String nome, long numero, String estado, String bairro) {
    this.nome = nome;
    this.endereco = new Endereco(numero, estado, bairro);
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public Endereco getEndereco() {
    return endereco;
  }
  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }
  @Override
  public String toString() {
    return "Pessoa [nome=" + nome + ", endereco=[" + endereco + "]]";
  }

  
}
