class Actor { 
    public Actor() {
        this(500, "Actor"); 
        System.out.println("Actor: Default constructor");
    }
    public Actor(int remuneration, String actorName) {
        this(800, "Actor", 25.2f);
		System.out.println("this is"+remuneration);
    }
	public Actor(int remuneration, String actorName, float numbers){
		this(800, "Actor", 25.2f, 2454445545d);
		System.out.println("this is"+actorName);
	}
	public Actor(int remuneration, String actorName, 
	float numbers, double percentage){
		this(800, "Actor", 25.2f, 2454445545d, 245454565l);
		System.out.println("this is"+numbers);
	}
	public Actor(int remuneration, String actorName, 
	float numbers, double percentage, long phone){
		this(800, "Actor", 25.2f, 2454445545d, 245454565l, 'A');
		System.out.println("this is"+percentage);
}
public Actor(int remuneration, String actorName, 
	float numbers, double percentage, long phone, char symbol){	
	System.out.println("this is"+phone);
	}
	}