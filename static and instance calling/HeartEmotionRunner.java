class HeartEmotionRunner {
    public static void main(String[] args) {
        Heart heart = new Heart();
        Emotion emotion = new Emotion();
        
        emotion.express(heart);
        
        System.out.println("Pulse Rate: " + Heart.pulseRate);
    }
}