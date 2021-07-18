package entities;

import java.util.Objects;

public class Votation {
	
	private String name;
	private Integer voto;
	
	
	public Votation(String name, Integer voto) {
		this.name = name;
		this.voto = voto;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getVoto() {
		return voto;
	}
	public void setVoto(Integer voto) {
		this.voto = voto;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(name, voto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Votation other = (Votation) obj;
		return Objects.equals(name, other.name) && Objects.equals(voto, other.voto);
	}

	public void contVoto(Integer voto) {
		this.voto += voto;
	}

	@Override
	public String toString() {
		return "name: " + name 
				+ ", voto=" 
				+ voto;
	}
	
	

}
