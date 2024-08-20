package com.br.contratacaocombo;

import java.util.ArrayList;

public class verificarComboCompleto {
    public void statuscombo(String[] servicosContratados) {
        ArrayList<String> combo = new ArrayList<String>();
        for (String servico : servicosContratados) {
            if ("movel,banda larga,tv".contains(servico)) {
                    combo.add(servico);

            }

        }

        if (combo.size()<3){
            System.out.println("Combo Incompleto");
        }else {
            System.out.println("Combo Completo");
        }

    }

    public void statuscomboold(String[] servicosContratados) {
        String combo = "";
        for (String servico : servicosContratados) {
            if ("movel,banda larga,tv".contains(servico)) {
                combo = combo +","+ servico;

            }

        }
       combo =  combo.replaceFirst(",","").trim();

        if (combo.split(",").length <3){
            System.out.println("Combo Incompleto");
        }else {
            System.out.println("Combo Completo");
        }

    }
}