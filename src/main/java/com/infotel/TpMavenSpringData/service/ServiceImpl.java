package com.infotel.TpMavenSpringData.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TpMavenSpringData.dao.AdresseRepository;
import com.infotel.TpMavenSpringData.dao.PersonneRepository;
import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;

@Service
public class ServiceImpl implements Iservice {

	@Autowired
	private PersonneRepository personneRepository;
	@Autowired
	private AdresseRepository adresseRepository;

	public PersonneRepository getPersonneRepository() {
		return personneRepository;
	}

	public void setPersonneRepository(PersonneRepository personneRepository) {
		this.personneRepository = personneRepository;
	}
	
	

	public AdresseRepository getAdresseRepository() {
		return adresseRepository;
	}

	public void setAdresseRepository(AdresseRepository adresseRepository) {
		this.adresseRepository = adresseRepository;
	}

	@Override
	public Personne ajouterPersonne(Personne p) {

		return personneRepository.save(p);
	}

	@Override
	public Optional<Personne> getPersonne(int idPersonne) {

		return personneRepository.findById(idPersonne);
	}

	@Override
	public void supprimerPersonne(Personne p) {

		personneRepository.delete(p);
	}

	
	@Override
	public void modifierPersonneParId(String prenom, String nom, int age, Integer idPersonne) {
		personneRepository.modifierPersonneParId(prenom, nom,age, idPersonne);
		
	}

	@Override
	public List<Personne> findAllPersonne() {
		// TODO Auto-generated method stub
		return (List<Personne>) personneRepository.findAll();
	}

	@Override
	public List<Personne> findByprenom(String prenom) {

		return personneRepository.findByprenom(prenom);
	}

	@Override
	public List<Personne> rechercherParMC(String nom) {

		return personneRepository.rechercherParMC("%" + nom + "%");
	}
	
	@Override
	public void ajouterPersonneAdresse(int idAdresse, Integer idPersonne) {
		personneRepository.ajouterPersonneAdresse(idAdresse, idPersonne);
		
	}
	
	//+++++++++++++++ADRESSE METHODE+++++++++++

	

	@Override
	public Adresse ajouterAdresse(Adresse a) {
		
		return adresseRepository.save(a);
	}

	

	@Override
	public Optional<Adresse> getAdresse(int idAdresse) {
		
		return adresseRepository.findById(idAdresse);
	}

	@Override
	public void supprimerAdresse(Adresse a) {
		
		adresseRepository.delete(a);
	}


	@Override
	public List<Adresse> findAllAdresse() {
		// TODO Auto-generated method stub
		return (List<Adresse>) adresseRepository.findAll();
	}

	@Override
	public List<Adresse> findByVille(String ville) {
		// TODO Auto-generated method stub
		return adresseRepository.findByVille(ville);
	}

	@Override
	public List<Adresse> rechercherParMCAdd(String ville) {
		// TODO Auto-generated method stub
		return adresseRepository.rechercherParMCAdd("%" + ville + "%");
	}

	@Override
	public void modifierAdresseParId(String nomRue, int numRue, String ville, int cp, Integer idAdresse) {
		adresseRepository.modifierAdresseParId(nomRue, numRue,ville, cp,idAdresse);
		
	}
	
	
	
	
	

}
