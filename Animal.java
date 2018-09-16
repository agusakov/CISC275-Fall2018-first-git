abstract public class Animal implements Comparable<Animal> {
int legs;

public int getLegs() {
//System.out.println("Got " + this.legs + " legs!");	
return this.legs;
	}

public int compareTo(Animal a1) {
	return a1.legs - this.legs;
}

}
