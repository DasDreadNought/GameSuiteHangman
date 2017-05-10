package domain;

import java.util.ArrayList;
import java.util.List;

public class Tekening {
	private String naam;
	private static final int MIN_X = 0;
	private static final int MIN_Y = 0;
	private static final int MAX_X = 399;
	private static final int MAX_Y = 399;
	private List<Vorm> vormen = new ArrayList();
	
	public Tekening (String naam){
		if(naam==null||naam.trim().isEmpty()) throw new IllegalArgumentException("Lege Tekening naam");
		this.naam = naam;
	}
	
	public String getNaam(){
		return naam;
	}
	
	public Vorm getVorm(int index){
		return vormen.get(index);
	}
	
	public int getAantalVormen(){
		return vormen.size();
	}
	
	public void voegToe(Vorm v){
		if(v!=null) vormen.add(v);
		else throw new IllegalArgumentException("Vorm is null");
	}
	
	public void verwijder(Vorm v){
		if(vormen.contains(v)){
			vormen.remove(v);
		}
	}
	
	public boolean bevat(Vorm v){
		return vormen.contains(v);
	}
	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("Tekening met naam ");
		builder.append(this.getNaam());
		builder.append("bestaat uit ");
		builder.append(this.getAantalVormen());
		builder.append("vormen:\n");
		for(Vorm v : vormen){
			builder.append(v.toString());
			builder.append("\n");
		}
		return builder.toString();
	}
	
	public boolean equals(Object o){
		if(o!=null&&o instanceof Tekening){
			if(this.getAantalVormen()==((Tekening)o).getAantalVormen()){
				for(Vorm v : vormen){
					if(!((Tekening)o).bevat(v)){return false;}
				} return true;
			}
		}
		
		return false;
	}
}
