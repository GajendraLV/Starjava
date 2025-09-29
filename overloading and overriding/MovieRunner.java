class MovieRunner {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.play(); 
        movie.stop();

        

        ActionMovie actionMovie = new ActionMovie();
        actionMovie.play(); 
        actionMovie.stop(); 
        actionMovie.addExplosionScene(); 

       
      
        Movie polymorphicMovie = new ActionMovie();
        polymorphicMovie.play(); 
        polymorphicMovie.stop(); 
        
    }
}