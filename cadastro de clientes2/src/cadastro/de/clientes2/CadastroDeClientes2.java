
package cadastro.de.clientes2;


public class CadastroDeClientes2 {


    public static void main(String[] args) {
        
        //instanciar os objetos
        uiCadastroCliente formulario = new uiCadastroCliente();
        Pessoa cliente = new Pessoa(formulario.nome, formulario.cpf, formulario.endereco, formulario.cidade, formulario.estado);
    }
    
}
