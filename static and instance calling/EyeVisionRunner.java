class EyeVisionRunner {
    public static void main(String[] args) {
        Eye eye = new Eye();
        Vision vision = new Vision();
        
        vision.focus(eye);
        
        System.out.println("Eye Color: " + Eye.eyeColor);
    }
}