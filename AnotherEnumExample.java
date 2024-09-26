enum Size {
    SMALL(30), MEDIUM(40), LARGE(50), EXTRA_LARGE(60); 

    private int sizeValue; 

    //Constructor 
    Size(int sizeValue) {
        this.sizeValue = sizeValue;
    }
    
    //Getter method 
    public int getSizeValue() {
        return sizeValue;
    }

}

public class AnotherEnumExample {
    public static void main(String[] args) {
        Size shirtSize  = Size.LARGE; 

        System.out.println("Shirt size is: " + shirtSize);
        System.out.println("Size value is: " + shirtSize.getSizeValue());
    }
}


