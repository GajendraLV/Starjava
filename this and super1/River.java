class River extends Nature {
    
    public String elementName;
    public String type;
    public double length;
    public boolean isNatural;
    
    public River() {
        super();
        System.out.println("This is no argumental constructor in River class.");
    }

    public River(String elementName, String type, double length, boolean isNatural) {
        this();  // calling no-arg constructor of River
        super.elementName = elementName;
        super.type = type;
        super.length = length;
        super.isNatural = isNatural;

        this.elementName = elementName;
        this.type = type;
        this.length = length;
        this.isNatural = isNatural;
    }
	 public void displayInfo() {
        System.out.println("Nature class elementName = " + super.elementName);
        System.out.println("Nature class type = " + super.type);
        System.out.println("Nature class length = " + super.length);
        System.out.println("Nature class isNatural = " + super.isNatural);

        System.out.println("River class elementName = " + this.elementName);
        System.out.println("River class type = " + this.type);
        System.out.println("River class length = " + this.length);
        System.out.println("River class isNatural = " + this.isNatural);
    }
}