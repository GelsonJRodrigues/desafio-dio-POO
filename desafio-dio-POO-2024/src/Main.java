import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m"; // constante faz com que a cor do texto volte ao normal
    public static final String ANSI_RED = "\u001B[31m"; // constante para mudar a cor do texto que será exibido

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGelson = new Dev();
        devGelson.setNome("Gelson");
        devGelson.inscreverBootcamp(bootcamp);
        System.out.println(ANSI_RED + "Conteúdos Inscritos Gelson: " + ANSI_RESET + devGelson.getConteudosInscritos());
        devGelson.progredir();
        devGelson.progredir();
        System.out.println("-");
        System.out.println(ANSI_RED + "Conteúdos Inscritos Gelson: " + ANSI_RESET + devGelson.getConteudosInscritos());
        System.out.println(ANSI_RED + "Conteúdos Concluídos Gelson: " + ANSI_RESET + devGelson.getConteudosConcluidos());
        System.out.println("XP:" + devGelson.calcularTotalXp());

        System.out.println(ANSI_RED + "--------------------------------" + ANSI_RESET);

        Dev devIara = new Dev();
        devIara.setNome("Iara");
        devIara.inscreverBootcamp(bootcamp);
        System.out.println(ANSI_RED + "Conteúdos Inscritos Iara: " + ANSI_RESET + devIara.getConteudosInscritos());
        devIara.progredir();
        devIara.progredir();
        devIara.progredir();
        System.out.println("-");
        System.out.println(ANSI_RED + "Conteúdos Inscritos Iara: " + ANSI_RESET + devIara.getConteudosInscritos());
        System.out.println(ANSI_RED + "Conteúdos Concluidos Iara: " + ANSI_RESET + devIara.getConteudosConcluidos());
        System.out.println("XP:" + devIara.calcularTotalXp());

    }

}
