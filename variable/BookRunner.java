class BookRunner {
    public static void main(String[] args) {
        Book.title = "Clean Code";              
        Book.pages = 464;                       
        Book.isbn = 9780132350884L;             
        Book.price = 349.50f;                   
        Book.rating = 4.7;                      
        Book.isPublished = true;                
        Book.category = 'B';                    

        Book.info(); 
    }
}
