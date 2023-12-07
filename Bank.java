public class Bank {

    public static void main(String[] args) {
        
        int returnedValue = withDraw();
        System.out.println(returnedValue);
	
        char returnedValues = firstLetterVowel();
        System.out.println(returnedValues);

        byte byteValues = age();
        System.out.println(byteValues);

        boolean booleanValues = cash();
        System.out.println(booleanValues);

        long longValues = phone();
        System.out.println(longValues);

        double doubleValues = balance();
        System.out.println(doubleValues);

        float floatValues = amt();
        System.out.println(floatValues);
	 
	short shortValues = emp();
        System.out.println(shortValues);
    }

    static int withDraw() {
        int value = 20000;
        return value;
    }

    static char firstLetterVowel() {
        char value = 'a';
        return value;
    }

    static byte age() {
        byte value = 77;
        return value;
    }

    static boolean cash() {
        boolean value = true;
        return value;
    }

    static long phone() {
        long value = 8903253781L; 
        return value;
    }

    static double balance() {
        double value = 1000.000;
        return value;
    }

    static float amt() {
        float value = 50.000000f; 
        return value;
    }

     static short emp() {
        short value = 1000; 
        return value;
    }
}
