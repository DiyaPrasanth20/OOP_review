enum Day{
    MONDAY, TUESDAY, Wednesday, THURSDAY, FRIDAY, SATURDAY, SUNDAY 
}

public class EnumExample{
    public static void main(String[] args) {
        Day today = Day.Wednesday; 
        System.out.println("Today is: " + today);

        switch(today) {
            case MONDAY:
                System.out.println("Start of the week");
                break; 
            case Wednesday:
                System.out.println("Mid-day of week"); 
                break; 
            case FRIDAY: 
                System.out.println("Almost weekend");
                break; 
            default: 
                System.out.println("Another Day");
        }


    }
}
