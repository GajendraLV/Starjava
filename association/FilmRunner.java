class FilmRunner{
public static void main(String [] args){
Actor actor=new Actor(800,producer);
Producer producer=new Producer(600,actor,director);
Director director=new Director( 5000,actor,producer);
actor.displayactor();
producer.displayproducer();
director.displaydirector();
}
}