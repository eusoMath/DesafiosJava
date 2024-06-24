package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso java");
		curso1.setCargaHoraria(8);
		
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Js");
		curso2.setDescricao("Descrição curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);*/
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devMatheus = new Dev();
		devMatheus.setNome("Matheus");
		devMatheus.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Matheus" + devMatheus.getConteudoInscritos());
		devMatheus.progredir();
		devMatheus.progredir();
		System.out.println("Conteúdos concluídos Matheus" + devMatheus.getConteudoConcluidos());
		System.out.println("XP = " + devMatheus.calcularXp());
		
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudoInscritos());
		devCamila.progredir();
		System.out.println("Conteúdos concluídos Camila" + devCamila.getConteudoConcluidos());
		System.out.println("XP = " + devCamila.calcularXp());
		
		
		
		
	}
}
