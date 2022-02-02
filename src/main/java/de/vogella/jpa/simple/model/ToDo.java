package de.vogella.jpa.simple.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDo 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String summary;
	String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString()
	{
		return "ToDo [id=" + id + ", summary=" + summary + ", description=" + description + ", getId()=" + getId()
				+ ", getSummary()=" + getSummary() + ", getDescription()=" + getDescription() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}