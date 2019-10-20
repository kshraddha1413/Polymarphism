
class Movie {
	private String name;

	public Movie(String name) {

		this.name = name;
	}

	public String plot() {
		return "no plot here";

	}
}

class BeautiAndBeast extends Movie {

	public BeautiAndBeast() {
		super("BeautiAndBeast");

	}

	public String plot() {
		return "plot of Beauty and beast";

	}
}

class Cindrella extends Movie {

	public Cindrella() {
		super("Cindrella");

	}

	public String plot() {
		return "plot of Cindrella";

	}
}

class Alladin extends Movie {

	public Alladin() {
		super("Alladin");

	}

	public String plot() {
		return "plot of Alladin";

	}

}
class Main{
	public static void main(String[] args) {
		Movie m=new Movie("StarWar");
		System.out.println(m.plot());
		Alladin a=new Alladin();
		System.out.println(a.plot());
	}
}