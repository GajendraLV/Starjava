class Nature {
    
    public String elementName;
    public String type;
    public double length;
    public boolean isNatural;
    
    public Nature() {
        System.out.println("This is no argumental constructor in Nature class.");
    }

    public Nature(String elementName, String type, double length, boolean isNatural) {
        this.elementName = elementName;
        this.type = type;
        this.length = length;
        this.isNatural = isNatural;
        System.out.println("This is parameterized constructor in Nature class.");
    }
}
