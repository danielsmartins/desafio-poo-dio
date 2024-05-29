import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("seu pior pesadelo");
        curso1.setCargaHoraria(372);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso assembly");
        curso2.setDescricao("💀💀💀");
        curso2.setCargaHoraria(456);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("advantages of being an Java developer");
        mentoria.setDescricao("Spoiler: headache");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp só os loucos sabem");
        bootcamp.setDescricao("Estou perto de saber");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDanas = new Dev();
        devDanas.setNome("Daniel");
        devDanas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Danas:" + devDanas.getConteudosInscritos());
        devDanas.progredir();
        devDanas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Incritos Danas:" + devDanas.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Danas" + devDanas.getConteudosConcluidos());
        System.out.println("XP:" +devDanas.calcularTotalXp());

        Dev devJota = new Dev();
        devJota.setNome("Jota");
        devJota.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Jota:" + devJota.getConteudosInscritos());
        devJota.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Incritos Jota:" + devJota.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jota" + devJota.getConteudosConcluidos());
        System.out.println("XP:" +devJota.calcularTotalXp());
    }
}
