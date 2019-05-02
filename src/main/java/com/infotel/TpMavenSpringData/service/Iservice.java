package com.infotel.TpMavenSpringData.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;

public interface Iservice {
	
	public Personne ajouterPersonne(Personne p);
	public Optional<Personne> getPersonne(int idPersonne);
	public void supprimerPersonne(Personne p);
	public void modifierPersonneParId(String prenom, String nom, int age, Integer idPersonne);
	public List<Personne> findAllPersonne();
	public List<Personne> findByprenom(String prenom);
	public List<Personne> rechercherParMC(@Param("x")String nom);
	public void ajouterPersonneAdresse(int idAdresse, Integer idPersonne);
	
	
	public Adresse ajouterAdresse(Adresse a);
	public Optional<Adresse> getAdresse(int idAdresse);
	public void supprimerAdresse(Adresse a);
	public void modifierAdresseParId(String nomRue, int numRue, String ville, int cp, Integer idAdresse);
	public List<Adresse> findAllAdresse();
	public List<Adresse> findByVille(String ville);
	public List<Adresse> rechercherParMCAdd(@Param("x")String ville);
	
	
	
}
