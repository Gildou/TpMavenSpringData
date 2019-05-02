package com.infotel.TpMavenSpringData.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;
import com.infotel.TpMavenSpringData.service.Iservice;
import com.infotel.TpMavenSpringData.service.ServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Iservice service = context.getBean("serviceImpl", ServiceImpl.class);
		/*
		 * Personne p = context.getBean("personne",Personne.class); p.setAge(25);
		 * p.setPrenom("Toto"); p.setNom("Tata"); service.ajouterPersonne(p);
		 * 
		 * System.out.println(p);
		 */

		/*
		 * System.out.println(service.findByprenom("Toto"));
		 * System.out.println(service.rechercherParMC("Tata"));
		 */
		/*
		 * service.modifierPersonneParId("Lulu", "Satounou",666, 1);
		 * 
		 * System.out.println(service.findAllPersonne());
		 */

		/*
		 * Ici je recrée ma BDD avec une personne et une adresse pour tester ma méthode
		 * d'ajouter d'une personne à une adresse
		 * 
		 * Personne p = context.getBean("personne",Personne.class); p.setAge(25);
		 * p.setPrenom("Toto"); p.setNom("Tata"); service.ajouterPersonne(p);
		 * System.out.println(p);
		 * 
		 * Adresse a = context.getBean("adresse",Adresse.class); a.setNomRue("Orsel");
		 * a.setNumRue(2); a.setVille("Paris"); a.setCp(75000);
		 * service.ajouterAdresse(a); System.out.println(a);
		 */

		service.ajouterPersonneAdresse(1,1);

	}
}
