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

3. Stack and Heap Structure


![firefox_xSwpXsbCNC](https://user-images.githubusercontent.com/22981511/223092868-1fdf70e8-d04a-497f-a4ac-f50120329a6a.jpeg)

![firefox_LHiG2bQtxk](https://user-images.githubusercontent.com/22981511/223093323-f858e41f-71c2-4b13-bd92-aa8d6a66dc13.png)

