import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Disciplinas;
import br.com.dio.desafio.dominio.Aluno;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Disciplinas disciplinas1 = new Disciplinas();
        disciplinas1.setTitulo("curso java");
        disciplinas1.setDescricao("descrição curso java");
        disciplinas1.setCargaHoraria(8);

        Disciplinas disciplinas2 = new Disciplinas();
        disciplinas2.setTitulo("curso js");
        disciplinas2.setDescricao("descrição curso js");
        disciplinas2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Curso curso = new Curso();
        curso.setNome("Bootcamp Java Developer");
        curso.setDescricao("Descrição Bootcamp Java Developer");
        curso.getConteudos().add(disciplinas1);
        curso.getConteudos().add(disciplinas2);
        curso.getConteudos().add(mentoria);

        Aluno alunoCamila = new Aluno();
        alunoCamila.setNome("Camila");
        alunoCamila.setIdade(20);
        alunoCamila.inscreverBootcamp(curso);
        System.out.println("Conteúdos Inscritos Camila:" + alunoCamila.getConteudosInscritos());
        alunoCamila.progredir();
        alunoCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + alunoCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + alunoCamila.getConteudosConcluidos());
        System.out.println("A idade da Camila é: " + alunoCamila.getIdade());
        System.out.println("XP:" + alunoCamila.calcularTotalXp());

        System.out.println("-------");

        Aluno alunoJoao = new Aluno();
        alunoJoao.setNome("Joao");
        alunoJoao.setIdade(18);
        alunoJoao.inscreverBootcamp(curso);
        System.out.println("Conteúdos Inscritos João:" + alunoJoao.getConteudosInscritos());
        alunoJoao.progredir();
        alunoJoao.progredir();
        alunoJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + alunoJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + alunoJoao.getConteudosConcluidos());
        System.out.println( "A idade de Joao é:"+ alunoJoao.getIdade());
        System.out.println("XP:" + alunoJoao.calcularTotalXp());

    }

}
