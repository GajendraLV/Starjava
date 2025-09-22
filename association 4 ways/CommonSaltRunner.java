class CommonSaltRunner {
    public static void main(String[] args) {
        
        CommonSalt salt = new CommonSalt(50, "Iodized");

        
        Sambar sambar = new Sambar(80, "Hotel Saravana Bhavan", salt);
        Curry curry = new Curry(120, "Udupi Hotel", salt);

        
        salt.displaySalt();
       
        sambar.displaySambar();
        
        curry.displayCurry();
    }
}