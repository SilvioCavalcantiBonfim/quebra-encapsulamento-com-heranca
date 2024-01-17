# Quebra de Encapsulamento em Java

Este repositório contém um exemplo de quebra de encapsulamento em Java.

## Código

O código a seguir demonstra a quebra do encapsulamento:

```java
public class App {
    public static void main(String[] args) throws Exception {

        Pessoa pessoa = new Pessoa("pessoa teste", 1, "teste", "teste");

        System.out.println(pessoa.toString());
        
        pessoa.getEndereco().setNumero(1000);
        
        System.out.println(pessoa.toString());
    }
}
```

## Explicação

No código acima, criamos um objeto `Pessoa` e imprimimos suas informações. Em seguida, acessamos diretamente o objeto `Endereco` da `Pessoa` e alteramos o número do endereço. Isso é uma quebra do princípio de encapsulamento.

O encapsulamento é um dos quatro princípios fundamentais da Programação Orientada a Objetos (POO). Ele ajuda a proteger os dados ao esconder os detalhes de implementação e permitir o acesso e a modificação por meio de métodos públicos.

Neste caso, o ideal seria ter um método na classe `Pessoa` para alterar o número do endereço, em vez de permitir o acesso direto ao objeto `Endereco`. Isso garantiria que qualquer lógica de validação ou transformação necessária fosse aplicada corretamente.