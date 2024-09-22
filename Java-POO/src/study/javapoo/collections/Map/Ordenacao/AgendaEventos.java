package study.javapoo.collections.Map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    Map<LocalDate, Evento> atracoesevneto;

    public AgendaEventos() {
        this.atracoesevneto = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        atracoesevneto.put(data, new Evento(nome, atracao));
    }

    //     Exibe a agenda de eventos em ordem crescente de data.
    public void exibirAgenda() {
        //TODO oTREMAP JA ORDENA BASEADO NO LOCALDATE
        // MAS NADA IMPEDE QUE PASSE IM COMPARETOR COMPAREBLE
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(atracoesevneto);
       System.out.println(eventoTreeMap);
    }


    public void obterProximoEvento() {

        LocalDate dateAtual = LocalDate.now();
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(atracoesevneto);
        for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
            if (entry.getKey().equals(dateAtual) || entry.getKey().isAfter(dateAtual)) {
                System.out.println("O proximo evento será: "+entry.getKey()+" Evento: " + entry.getValue().toString());
                break;
            }

        }
    }
}