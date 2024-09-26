enum Operation {
    ADD {
        public int apply(int x, int y) {
            return x + y;
        }
    },
    SUBTRACT {
        public int apply(int x, int y) {
            return x - y;
        }
    },
    MULTIPLY {
        public int apply(int x, int y) {
            return x * y;
        }

        public int just(int x) {
            return x; 
        }
    },
    DIVIDE {
        public int apply(int x, int y) {
            return x / y;
        }

        // No just() method defined here
    };

    public abstract int apply(int x, int y);  // Abstract method

    // Default implementation of just() that can be overridden
    public int just(int x) {
        return 0;
    }
}

public class LastEnumExample {
    public static void main(String[] args) {
        int result1 = Operation.ADD.apply(3, 7);       // Addition
        int result2 = Operation.MULTIPLY.apply(3, 7);  // Multiplication
        
        // Attempting to call just() on MULTIPLY
        int justValue = Operation.MULTIPLY.just(5);    // Just returns the value

        // Attempting to call just() on ADD, which throws an exception
        
        int justValueAdd = Operation.ADD.just(5); 
        System.out.println(justValueAdd);
        

        System.out.println("Addition result: " + result1);         // Output: 10
        System.out.println("Multiplication result: " + result2);    // Output: 21
        System.out.println("Just value: " + justValue);             // Output: 5
    }
}
