package com.infotel.TpMavenSpringData.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.TpMavenSpringData.metier.Adresse;


public interface AdresseRepository extends JpaRepository<Adresse, Integer> {
	
	public List<Adresse> findByVille(String ville);
	@Query("Select a from Adresse a where a.ville like :x")
	public List<Adresse> rechercherParMCAdd(@Param("x")String ville);
		
	@Transactional
	@Modifying
	@Query("update Adresse a set a.nomRue = ?1, a.numRue = ?2, a.ville =?3 , a.cp = ?4 where a.idAdresse = ?5")
	public void modifierAdresseParId(String nomRue, int numRue, String ville, int cp, Integer idAdresse);

}
