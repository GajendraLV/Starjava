class PenRunner {
    public static void main(String[] args) {
        Pen.brand = "Reynolds";            
        Pen.price = 50;                    
        Pen.serialNumber = 1234567890L;    
        Pen.inkLevel = 45.7f;              
        Pen.length = 13.5;                 
        Pen.isWorking = false;             
        Pen.qualityGrade = 'B';            

        Pen.info(); 
    }
}
