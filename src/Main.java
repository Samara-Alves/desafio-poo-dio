import dio.desafio.poo.dominio.Bootcamp;
import dio.desafio.poo.dominio.Curso;
import dio.desafio.poo.dominio.Dev;
import dio.desafio.poo.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Descrição:Curso Java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso Js");
    curso2.setDescricao("Descrição:Curso JavaScript");
    curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria Java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devCamila.getConteudoInscritos());

        devCamila.progredir();
        System.out.println("Conteúdos inscritos" + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos concluídos" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos" + devAna.getConteudoInscritos());

        devAna.progredir();
        devAna.progredir();
        devAna.progredir();
        System.out.println("Conteúdos inscritos" + devAna.getConteudoInscritos());
        System.out.println("Conteúdos concluídos" + devAna.getConteudosConcluidos());
        System.out.println("XP:" + devAna.calcularTotalXp());








    }

}
