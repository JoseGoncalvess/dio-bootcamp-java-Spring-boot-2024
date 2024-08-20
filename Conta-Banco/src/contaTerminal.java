import com.conta.banco.estructure.Conta;

public class contaTerminal {
    public static void main(String[] args) {
        Conta novaconta = new Conta();

        System.out.println("Olá ," +novaconta.getName()+" obrigado por criar uma conta em nosso banco, sua agência é "+ novaconta.getAgencia() +", conta "+ novaconta.getNumero() +" e seu saldo "+ novaconta.getSaldo() +" já está disponível para saque\".");

    }



}