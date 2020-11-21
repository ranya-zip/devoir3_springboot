package com.ranya.movies.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Director {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long idDir;
	
	private String nomDir;
	private String prenomDir;
	@OneToMany (mappedBy="directory")
	private List<Movie> movies;	
	
	
	
	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public long getIdDir() {
		return idDir;
	}
	public void setIdDir(long idDir) {
		this.idDir = idDir;
	}
	public String getNomDir() {
		return nomDir;
	}
	public void setNomDir(String nomDir) {
		this.nomDir = nomDir;
	}
	public String getPrenomDir() {
		return prenomDir;
	}
	public void setPrenomDir(String prenomDir) {
		this.prenomDir = prenomDir;
	}
	

}
  	