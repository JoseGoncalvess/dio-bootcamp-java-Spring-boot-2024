package org.bootCamp;

import java.time.LocalDate;

import org.bootCamp.domain.BootCamp;
import org.bootCamp.domain.Curso;
import org.bootCamp.domain.Dev;
import org.bootCamp.domain.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso JAVA = new Curso();
        JAVA.setTitulo("curso java");
        JAVA.setDescricao("descrição curso java");
        JAVA.setCargaHoraria(8);

        Curso LDPG = new Curso();
        LDPG.setTitulo("Logicca de Programmação");
        LDPG.setDescricao("descrição de Logicca de Programmação");
        LDPG.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        BootCamp bootcamp = new BootCamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(LDPG);
        bootcamp.getConteudos().add(JAVA);
        bootcamp.getConteudos().add(mentoria);

        Dev goncalves = new Dev("Gonçlaves");
        goncalves.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos :" + goncalves.getNome() + goncalves.getConteudoscadastrados());
        goncalves.progredir();
        goncalves.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos :" + goncalves.getNome() + goncalves.getConteudoscadastrados());
        System.out.println("Conteúdos Concluídos:" + goncalves.getNome() + goncalves.getConteudosfinalizados());
        System.out.println("XP:" + goncalves.calcularTotalXp());

    }
}