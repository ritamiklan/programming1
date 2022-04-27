package objectExcercises1;

import java.util.ArrayList;

public class Crew {

	private ArrayList<Sailor> sailorList;

	public Crew() {

		sailorList = new ArrayList<Sailor>();

	}

	public void addCrewMember(Sailor sailor) {

		sailorList.add(sailor);

	}

	public String toString() {

		String output = "";

		for (Sailor sailorObject : sailorList) {

			output += (sailorObject.getName() + " (" + sailorObject.getEmail() + ") \n");
		}

		return output;

	}
}

/*
 * 
 * - ArrayList<Sailor> sailorList + Crew() + void addCrewMember(Sailor sailor) +
 * String toString()
 * 
 * 
 */