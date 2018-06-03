package java_util;

import java.util.ArrayList;

public class Player {
	private int id;
	private String name;
	
	private ArrayList<String> card;
	

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name,ArrayList<String> card) {
		this.id = id;
		this.name = name;
		this.card = card;
	}

	
	public ArrayList<String> getCard() {
		return card;
	}

	public void setCard(ArrayList<String> card) {
		this.card = card;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
