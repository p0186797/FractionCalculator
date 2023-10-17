class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numVal, int denVal){
        numerator = reduceNum(numVal, denVal);
        denominator = reduceDen(numVal, denVal);   
    }
    public static int reduceNum(int numVal, int denVal){
        return numVal / gcd(numVal, denVal);     
    }

    public static int reduceDen(int numVal, int denVal){
        return denVal / gcd(numVal, denVal);
    }

    public static int gcd(int a, int b){
        int min = Math.min(Math.abs(a), Math.abs(b));
        while (a % min != 0 || b % min != 0){
            min --;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(gcd(-120, 16));
     
    }
    
}
