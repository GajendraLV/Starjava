class PaperRunner {
    public static void main(String[] args) {
        Paper.brand = "JK Paper";          
        Paper.pages = 100;                 
        Paper.batchNumber = 1234567899L;   
        Paper.thickness = 0.20f;           
        Paper.weight = 1.2;                
        Paper.isRuled = false;             
        Paper.qualityGrade = 'B';          

        Paper.info(); 
    }
}
