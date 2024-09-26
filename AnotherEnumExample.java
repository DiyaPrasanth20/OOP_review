enum Size {
    SMALL(30, "white"), MEDIUM(40, "pink"), LARGE(50, "blue"), EXTRA_LARGE(60, "red"); 

    //instance var 
    private int sizeValue; 
    private String color; 

    //Constructor 
    Size(int sizeValue, String color) {
        this.sizeValue = sizeValue;
        this.color = color; 
    }
    
    //Getter method 
    public int getSizeValue() {
        return sizeValue;
    }

    public String getColor() {
        return color; 
    }

}

public class AnotherEnumExample {
    public static void main(String[] args) {
        Size shirtSize  = Size.LARGE; 

        System.out.println("Shirt size is: " + shirtSize);
        System.out.println("Size value is: " + shirtSize.getSizeValue());
        System.out.println(shirtSize.getColor());
    }
}


