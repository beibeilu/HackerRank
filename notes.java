((n & 1) == 1 || (6 <= n && n <= 20)) ? "Weird" : "Not Weird"

//condition ? true : false

// Bit
(n & 1) == 1    //position odd or negative even
(n & 1) == 0    //positive even or negative odd

// Bit shift
n >> = 1        // Same as n = n >> 1, shift right 1 bit, equivalent to n / 2

  
int n = in.nextInt();
in.close();     //Close input


public static int factorial(int n){
        if (n > 1){
            return n * factorial(n-1);
        }
        return 1; // base case
}
