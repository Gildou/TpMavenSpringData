package com.infotel.TpMavenSpringData.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.TpMavenSpringData.metier.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Integer>{
	
	public List<Personne> findByprenom(String prenom);
	@Query("Select p from Personne p where p.nom like :x")
	public List<Personne> rechercherParMC(@Param("x")String nom);
		
	@Transactional
	@Modifying
	@Query("update Personne p set p.prenom = ?1, p.nom = ?2, p.age =?3 where p.idPersonne = ?4")
	public void modifierPersonneParId(String prenom, String nom, int age, Integer idPersonne);
	
	@Transactional
	@Modifying
	@Query("update Personne p set p.adresse.idAdresse = ?1 where p.idPersonne = ?2")
	public void ajouterPersonneAdresse(int idAdresse, Integer idPersonne);
	
	
	
	

}
