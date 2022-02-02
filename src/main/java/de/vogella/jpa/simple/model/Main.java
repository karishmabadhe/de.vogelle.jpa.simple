package de.vogella.jpa.simple.model;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Long id = sc.nextLong();
		sc.nextLine();
		String summary = sc.nextLine();
		String description = sc.nextLine();
		create(id, summary, description);
		sc.close();
	}

	public static void create(Long id, String summary, String description) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ToDo");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		ToDo todo = new ToDo();
		todo.setId(id);
		todo.setSummary(summary);
		todo.setDescription(description);
		em.persist(todo);
		em.getTransaction().commit();
		em.close();
	}
}