import dio.desafio.poo.dominio.Curso;
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




        System.out.println(curso1);
        System.out.println(curso2);
    }

}