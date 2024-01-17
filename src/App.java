
public class App {
    public static void main(String[] args) throws Exception {

        Pessoa pessoa = new Pessoa("pessoa teste", 1, "teste", "teste");

        System.out.println(pessoa.toString());
        
        pessoa.getEndereco().setNumero(1000);
        
        System.out.println(pessoa.toString());
    }
}
