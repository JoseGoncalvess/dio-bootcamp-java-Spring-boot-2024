package study.javapoo.collections.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidado> convidadosList = new HashSet<>();

    public  void  adicionarConvidado(String nome, int codigoConvite){
        convidadosList.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        if (!convidadosList.isEmpty()){
            for (Convidado convidado : convidadosList) {
                if (convidado.getNumberConvite() == codigoConvite) {
                        convidadosList.remove(convidado);
                        break;
                }
            }
        }

    }

    public int  contarConvidados(){
        return  convidadosList.size();
    }

    public void exibirConvidados(){
        convidadosList.forEach(convidado -> System.out.println("O Convidado: "+convidado.getNome()+" Convite nº"+convidado.getNumberConvite()));
    }

}
