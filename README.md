# interview_prep

1. Fibonacci Sequence


```java
public class Fibonacci {

    public static void main(String[] args) {
        int n = 10; // number of terms in the sequence
        int a = 0, b = 1, c;

        System.out.print("Fibonacci sequence of " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
```

2. Generation of prime numbers

```java
public class PrimeNumbers {
    public static void main(String[] args) {

        for(int i = 2; i < 100; i++){

            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int number) {
        boolean isPrime = true;

        for (int i = 2; i < number; i++){
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
```

