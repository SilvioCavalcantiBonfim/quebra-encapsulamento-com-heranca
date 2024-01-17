package numero;

public class Endereco {
  private long numero;
  private String estado;
  private String bairro;

  public Endereco() {
  }

  public Endereco(long numero, String estado, String bairro) {
    this.numero = numero;
    this.estado = estado;
    this.bairro = bairro;
  }

  public long getNumero() {
    return numero;
  }

  public void setNumero(long numero) {
    this.numero = numero;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  @Override
  public String toString() {
    return "Endereco numero=" + numero + ", estado=" + estado + ", bairro=" + bairro;
  }

  
}
