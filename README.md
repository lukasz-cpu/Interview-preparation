# interview-preparation

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

![s](https://user-images.githubusercontent.com/22981511/223093638-761ac6d8-3f70-492b-b4f2-90c4107b5c9f.png)

4. Authentication vs. Authorization

- Authentication (AuthN) is a process that verifies that someone or something is who they say they are. Technology systems typically use some form of authentication to secure access to an application or its data. For example, when you need to access an online site or service, you usually have to enter your username and password. Then, behind the scenes, it compares the username and password you entered with a record it has on its database. If the information you submitted matches, the system assumes you are a valid user and grants you access. System authentication in this example presumes that only you would know the correct username and password. It, therefore, authenticates you by using the principle of something only you would know.

- Authorization is the security process that determines a user or service's level of access. In technology, we use authorization to give users or services permission to access some data or perform a particular action. If we revisit our coffee shop example, Rahul and Lucia have different roles in the coffee shop. As Rahul is a barista, he may only place and view orders. Lucia, on the other hand, in her role as manager, may also have access to the daily sales totals. Since Rahul and Lucia have different jobs in the coffee shop, the system would use their verified identity to provide each user with individual permissions. It is vital to note the difference here between authentication and authorization. Authentication verifies the user (Lucia) before allowing them access, and authorization determines what they can do once the system has granted them access (view sales information).

5. Stateless vs Stateful

- Stateless - There's no memory (state) that's maintained by the program
- Stateful - The program has a memory (state)

Stateless:
```java
//The state is derived by what is passed into the function

function int addOne(int number)
{
    return number + 1;
}
```

Stateful
```java
// The state is maintained by the function

private int _number = 0; //initially zero

function int addOne()
{
   _number++;
   return _number;

```

6. Deadlock

A deadlock occurs when two or more processes or threads are blocked waiting for each other to release resources that they need in order to proceed. In other words, each process or thread is holding a resource that the other process or thread needs, and neither of them can proceed until they are able to acquire the resource that the other is holding. Deadlocks can occur in a variety of situations, but they typically arise in systems where there are multiple processes or threads competing for a limited set of resources, such as shared memory, I/O devices, or locks. To prevent deadlocks, it is important to design systems that minimize resource contention and ensure that resources are released in a timely and predictable manner. Here are some strategies that can help prevent deadlocks:

- Avoid circular wait: Design the system to prevent circular waits, where each process is waiting for a resource that is held by another process in the circle.
- Resource allocation order: Specify an order for acquiring resources and make sure all processes follow the same order. This will ensure that resources are acquired in a predictable manner and can help prevent deadlocks.
- Use timeouts: Set timeouts for resource requests, so that if a process or thread is unable to acquire a resource within a certain time, it will release the resources it is holding and try again later.
- Resource preemption: If a process or thread is holding a resource that another process needs, the system can preempt the resource and give it to the waiting process. This can be done in a controlled manner to prevent resource starvation.
- Deadlock detection and recovery: Implement algorithms to detect deadlocks and recover from them. One common approach is to use a resource allocation graph to identify cycles and release resources in a way that breaks the cycle.

![firefox_LHiG2bQtxk](https://user-images.githubusercontent.com/22981511/223111747-4b87b7c1-8d7a-4256-af9b-c39acf440505.png)

7. 
How HashMap Internally Works

https://www.youtube.com/watch?v=1CJbB6SzjVw&t=1s

8. ACID 

https://stackoverflow.com/questions/3740280/how-do-acid-and-database-transactions-work
![Lambo](https://user-images.githubusercontent.com/22981511/223170073-397405b6-3164-40cc-bb10-26d608e05cc3.png)

9. 
Optimistic Locking is a strategy where you read a record, take note of a version number (other methods to do this involve dates, timestamps or checksums/hashes) and check that the version hasn't changed before you write the record back. When you write the record back you filter the update on the version to make sure it's atomic. (i.e. hasn't been updated between when you check the version and write the record to the disk) and update the version in one hit.If the record is dirty (i.e. different version to yours) you abort the transaction and the user can re-start it. This strategy is most applicable to high-volume systems and three-tier architectures where you do not necessarily maintain a connection to the database for your session. In this situation the client cannot actually maintain database locks as the connections are taken from a pool and you may not be using the same connection from one access to the next.

![firefox_OLz5c6nnio](https://user-images.githubusercontent.com/22981511/223186759-fa25b2fa-4c42-4be2-8b18-d3b9084ddb6f.jpeg)

https://stackoverflow.com/questions/129329/optimistic-vs-pessimistic-locking

10. Pessimistic
Pessimistic Locking is when you lock the record for your exclusive use until you have finished with it. It has much better integrity than optimistic locking but requires you to be careful with your application design to avoid Deadlocks. To use pessimistic locking you need either a direct connection to the database (as would typically be the case in a two tier client server application) or an externally available transaction ID that can be used independently of the connection. 

![firefox_uhxmyykBBn](https://user-images.githubusercontent.com/22981511/223187794-1200d259-52a1-475c-891e-59b9573e7bb0.png)

https://stackoverflow.com/questions/129329/optimistic-vs-pessimistic-locking

11. Dependency injection

Dependency injection is a design pattern commonly used in Java programming to achieve loose coupling between classes and to promote code reusability. In dependency injection, an object's dependencies are provided to it rather than having the object create them itself.

```java
public class MyClass {
   private final MyDependency myDependency;

   public MyClass(MyDependency myDependency) {
      this.myDependency = myDependency;
   }
}
```

Dependency injection is basically providing the objects that an object needs (its dependencies) instead of having it construct them itself. It's a very useful technique for testing, since it allows dependencies to be mocked or stubbed out.

Dependencies can be injected into objects by many means (such as constructor injection or setter injection). One can even use specialized dependency injection frameworks (e.g. Spring) to do that, but they certainly aren't required. You don't need those frameworks to have dependency injection. Instantiating and passing objects (dependencies) explicitly is just as good an injection as injection by framework.

12. What's the difference between INNER JOIN, LEFT JOIN, RIGHT JOIN and FULL JOIN?

https://stackoverflow.com/questions/5706437/whats-the-difference-between-inner-join-left-join-right-join-and-full-join

![firefox_uhxmyykBBn](https://user-images.githubusercontent.com/22981511/223193707-a1b70483-2dd3-4903-8286-833102ea7ccf.png)


13. Builder Pattern
 
The Builder Pattern is a creational design pattern that is commonly used in Java programming. It is used to create complex objects by separating the construction of an object from its representation. The pattern involves the use of a separate builder class that is responsible for creating the desired object.

```java
public class Person {
    private final String name;
    private final int age;
    private final String address;
    private final String phone;

    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.phone = builder.phone;
    }

    public static class PersonBuilder {
        private String name;
        private int age;
        private String address;
        private String phone;

        public PersonBuilder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    // getters and setters
}

```

To use the Builder Pattern, we would create a new Person object using the builder, like this:

```java
Person person = new Person.PersonBuilder("John", 30)
        .address("123 Main St")
        .phone("555-555-1234")
        .build();
```

14. Singleton Pattern

```java
public class MyClass{
    private static Myclass instance;

    private MyClass(){
        //Private instantiation
    }

    public static synchronized MyClass getInstance()  //If you want your method thread safe...
    {
        if (instance == null) {
            instance = new MyClass();
        }

        return instance;
    }
}
```

15. Strategy Pattern

```java
public interface PaymentStrategy {
    void pay(double amount);
}
```

```java
public class CreditCardPayment implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardPayment(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    public void pay(double amount) {
        System.out.println(amount + " paid using credit card.");
    }
}

public class PayPalPayment implements PaymentStrategy {
    private String emailId;
    private String password;

    public PayPalPayment(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    public void pay(double amount) {
        System.out.println(amount + " paid using PayPal.");
    }
}
```
```java
public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) {
        paymentStrategy.pay(amount);
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new CreditCardPayment("John Doe", "1234 5678 9012 3456", "123", "12/22"));
        paymentContext.executePayment(100.0);

        paymentContext = new PaymentContext(new PayPalPayment("john.doe@example.com", "password123"));
        paymentContext.executePayment(200.0);
    }
}

```

16. Facade Pattern

Suppose we have a complex subsystem with several classes that work together to perform a task. We can simplify the interface to this subsystem by creating a Facade class that encapsulates the complexity of the subsystem and provides a simpler interface to the clients.

Let's take an example of a computer system that has several components like CPU, RAM, HardDisk, etc. The Facade class will encapsulate the complexity of the subsystem and provide a simple interface to start the computer.

```java
public class CPU {
    public void processData() {
        System.out.println("CPU is processing data...");
    }
}

public class RAM {
    public void load() {
        System.out.println("RAM is loading data...");
    }
}

public class HardDisk {
    public void readData() {
        System.out.println("HardDisk is reading data...");
    }
}

public class ComputerFacade {
    private CPU cpu;
    private RAM ram;
    private HardDisk hardDisk;

    public ComputerFacade() {
        cpu = new CPU();
        ram = new RAM();
        hardDisk = new HardDisk();
    }

    public void start() {
        hardDisk.readData();
        ram.load();
        cpu.processData();
        System.out.println("Computer has started successfully!");
    }
}

public class Main {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}

```

17. Comparable vs Comparator

![firefox_FJVfhJ2S7K](https://user-images.githubusercontent.com/22981511/223449976-e0135d23-23ad-4351-ab27-c966d580b636.jpeg)

18. Are private methods testable?

Yes, it is possible to test private methods in Java using reflection. However, testing private methods should generally be avoided as it can make the tests brittle and difficult to maintain. Instead, you should focus on testing the public behavior of your classes.

```java
public class MyClass {
    private int privateMethod(int x) {
        return x * 2;
    }
}
```

and

```java
import java.lang.reflect.Method;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyClassTest {
    @Test
    public void testPrivateMethod() throws Exception {
        MyClass myObject = new MyClass();
        Method privateMethod = MyClass.class.getDeclaredMethod("privateMethod", int.class);
        privateMethod.setAccessible(true);
        int result = (int) privateMethod.invoke(myObject, 3);
        assertEquals(6, result);
    }
}
```

19. Stack

Java Collection Framework provides a class named “Stack”. This Stack class extends the Vector class and implements the functionality of the Stack data structure. 

![firefox_DKh0mpSAOW](https://user-images.githubusercontent.com/22981511/223490693-73be5aaa-2913-441b-8fe0-0eaafb68d80d.jpeg)

A stack data structure supports the following operations:

    Push: Adds an element to the stack. As a result, the value of the top is incremented.
    Pop: An element is removed from the stack. After the pop operation, the value of the top is decremented.
    Peek: This operation is used to look up or search for an element. The value of the top is not modified.


![firefox_GN1WCQeIvB](https://user-images.githubusercontent.com/22981511/223490893-63cdadf1-3dcd-4920-8196-05717ca6bb75.png)



https://www.techiedelight.com/stack-implementation-in-java/


20. Queue

The Queue interface is present in java.util package and extends the Collection interface is used to hold the elements about to be processed in FIFO(First In First Out) order. It is an ordered list of objects with its use limited to inserting elements at the end of the list and deleting elements from the start of the list, (i.e.), it follows the FIFO or the First-In-First-Out principle.

Being an interface the queue needs a concrete class for the declaration and the most common classes are the PriorityQueue and LinkedList in Java. Note that neither of these implementations is thread-safe. PriorityBlockingQueue is one alternative implementation if the thread-safe implementation is needed.

![firefox_XCK62qZjR0](https://user-images.githubusercontent.com/22981511/223498582-d21f6123-2e23-4bb0-84e9-9a3395428be9.png)

![firefox_8T97ZbxCGk](https://user-images.githubusercontent.com/22981511/223497835-e382b0fb-9a0a-4c0a-a870-1627d7f2cbfd.png)

21. Type of references in Java

- Stron References - This is the default type/class of Reference Object. Any object which has an active strong reference are not eligible for garbage collection. The object is garbage collected only when the variable which was strongly referenced points to null.

```java
MyClass obj = new MyClass ();
```
Here ‘obj’ object is strong reference to newly created instance of MyClass, currently obj is active object so can’t be garbage collected.
```java
obj = null;
```
'obj' object is no longer referencing to the instance. 
So the 'MyClass type object is now available for garbage collection.  

- Weak Reference 

<img width="692" alt="Screenshot 2023-03-07 at 22 53 46" src="https://user-images.githubusercontent.com/22981511/223562362-ec7e8a60-0abc-4819-8bf2-a507152e99c8.png">

- Phantom References

Similarly to weak references, phantom references don't prohibit the garbage collector from enqueueing objects for being cleared. The difference is phantom references must be manually polled from the reference queue before they can be finalized. That means we can decide what we want to do before they are cleared.

![firefox_lIqnlS4qQT](https://user-images.githubusercontent.com/22981511/223655817-fbc5915a-bb2a-4f15-a7eb-37fb72e248b2.png)

- Soft References

![firefox_7IhjGtHKZl](https://user-images.githubusercontent.com/22981511/223659006-80938333-b091-4168-8a55-20459e684d63.png)

22. Race condition

In Java, a race condition occurs when two or more threads access a shared resource or variable simultaneously, and the result of the operation depends on the timing or order of execution of the threads. This can lead to unpredictable and erroneous behavior, as each thread may assume the resource or variable is in a particular state that may have been changed by another thread.

```java
public class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
```

23. POST vs PUT vs PATCH

![firefox_7IhjGtHKZl](https://user-images.githubusercontent.com/22981511/223697267-ba28c59d-c54e-4ef7-a3c9-d5666b557ef4.png)

24. LinkedList vs ArrayList


![asd](https://user-images.githubusercontent.com/22981511/223700306-86128405-3d0c-490a-9c8a-bf76aac45c21.png)

25. SOLID

![asdsssa](https://user-images.githubusercontent.com/22981511/223722088-cd23ec4c-cf59-4705-91f3-4fbdbb8350fe.png)

26. What is the difference between an interface and abstract class?

Interface

![asdasdadzxczx](https://user-images.githubusercontent.com/22981511/223732251-b3575777-b9f3-4f2d-8a77-9ab69d2ed9c6.png)

Abstract class

![ok12o3k1o2k313](https://user-images.githubusercontent.com/22981511/223732708-96641b16-6c7f-459f-ada4-827c7495727e.png)

27. Singleton in synchronised way

```java
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // private constructor to prevent instantiation from outside the class
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```
28. Exceptions in Java

All exception classes are subtypes of the java.lang.Exception class. The exception class is a subclass of the Throwable class. Other than the exception class there is another subclass called Error which is derived from the Throwable class.

Errors are abnormal conditions that happen in case of severe failures, these are not handled by the Java programs. Errors are generated to indicate errors generated by the runtime environment. Example: JVM is out of memory. Normally, programs cannot recover from errors.

The Exception class has two main subclasses: IOException class and RuntimeException Class.

![Perszing](https://user-images.githubusercontent.com/22981511/223754755-ddf1c4c3-71d6-4cb0-bac1-d8d418d73689.png)

29. Primary Key 


![sadsadd](https://user-images.githubusercontent.com/22981511/223788268-327b89e1-3e48-439f-aed4-ad0951b5376b.png)

30. Indexes in database

![firefox_2tCttBnWBI](https://user-images.githubusercontent.com/22981511/223967912-6ecb6c2d-cc04-45db-8c27-ea85646ed786.png)


![firefox_xSitH7EXPQ](https://user-images.githubusercontent.com/22981511/223968707-8a712106-5951-426a-b5fb-e4959243bc96.png)

31. String Pool 

![firefox_ANDWNoFm0i](https://user-images.githubusercontent.com/22981511/223973632-f164c76d-cc6a-460a-b69f-a9f707183fe8.png)

32. Type Erasure 

![firefox_HAkBwO0LMY](https://user-images.githubusercontent.com/22981511/223975743-a7fbd3bd-e20e-40f5-a6fc-2f427047fdff.png)

33. HashSet vs LinkedHashSet

![firefox_HAkBwO0LMY](https://user-images.githubusercontent.com/22981511/223977692-975a69be-c926-4a5d-91b7-069dde588c32.png)

34. Finding the middle element of Linked List

![firefox_eInNp0Nk4W](https://user-images.githubusercontent.com/22981511/223987571-85c6bed5-4e27-4b52-a4db-d8c8bed1bb32.png)

35. Difference between FetchType LAZY and EAGER in Java Persistence API?

LAZY = fetch when needed
EAGER = fetch immediately

![firefox_eInNp0Nk4W](https://user-images.githubusercontent.com/22981511/224004337-d0065a8c-e7d4-46f5-b1eb-a723bb8f450e.png)

36. What is the solution for the N+1 issue in JPA and Hibernate?

https://stackoverflow.com/questions/32453989/what-is-the-solution-for-the-n1-issue-in-jpa-and-hibernate

![ApplicationFrameHost_KCfgI6OHNu](https://user-images.githubusercontent.com/22981511/224013392-2fc7f1c6-dd95-40e3-b9f2-bfa72cc8ca3c.png)
![firefox_IR1mhLVSHk](https://user-images.githubusercontent.com/22981511/224012097-1f1529df-1e77-47da-9d53-c48888d937b2.png)

37. Pagination

![firefox_IR1mhLVSHk](https://user-images.githubusercontent.com/22981511/224035889-9ccc3ba0-2f85-43cd-a408-a1a6da9df96c.png)


38. Sequence vs Identity

![firefox_lZwXisPDMK](https://user-images.githubusercontent.com/22981511/224037159-06cd1ec1-be23-4da0-b31c-ccba079708b0.png)

39. Spring Bean Scopes

![firefox_6lcQvhIXWZ](https://user-images.githubusercontent.com/22981511/224047774-035275ed-fc09-440b-9095-0fcdb8b0734b.png)

- singleton
- prototype
- request
- session
- application
- websocket

40. Time Scheduling in Spring Boot

![obraz](https://user-images.githubusercontent.com/22981511/224048349-00ee882a-e3ee-498c-9604-e94e2f3eb52a.png)

https://stackoverflow.com/questions/54341037/time-scheduling-in-spring-boot

41. Difference between StringBuilder and StringBuffer

![firefox_BPsB4nf2Wn](https://user-images.githubusercontent.com/22981511/224050958-a7a715d2-ae80-4ba1-b030-f4d53a0af044.png)

42. Transactions Isolation

- ISOLATION_READ_UNCOMMITTED - Allows dirty reads.
- ISOLATION_READ_COMMITTED - Does not allow dirty reads.
- ISOLATION_REPEATABLE_READ - If a row is read twice in the same transaction, the result will always be the same.
- ISOLATION_SERIALIZABLE - Performs all transactions in a sequence.

![firefox_cVYMPRk7Em](https://user-images.githubusercontent.com/22981511/224058433-6ce863aa-060a-43fc-a9a0-ac411571e0e1.png)

43. Phenomenons in SQL
- dirty read: a transaction reads data written by a concurrent uncommitted transaction 
- non repeatable reads: A transaction re-reads data it has previously read and finds that data has been modified by another transaction (that committed since the initial read) 
- phantom-read: A transaction re-executes a query returning a set of rows that satisfy a search condition and finds that the set of rows satisfying the condition has changed due to another recently-committed transaction
- serialization anomaly: The result of successfully committing a group of transactions is inconsistent with all possible orderings of running those transactions one at a time.

44. Hashset vs Treeset

![firefox_q3jS5HjTxA](https://user-images.githubusercontent.com/22981511/224069977-eda6f7c4-c283-4c2d-b80f-970b4f9fbc29.png)

45. Difference between HashMap, LinkedHashMap and TreeMap

![firefox_OhPsyo40mB](https://user-images.githubusercontent.com/22981511/224072475-02fef992-8b87-48df-8826-b2804e32a20a.png)

46. @Qualifier

This annotation may be used on a field or parameter as a qualifier for candidate beans when autowiring. It may also be used to annotate other custom annotations that can then in turn be used as qualifiers.

https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/annotation/Qualifier.html

47. SOAP vs REST (differences)

![firefox_6rhupwrjOT](https://user-images.githubusercontent.com/22981511/224080242-e0e7107e-30e9-4eed-b258-3ce3a09b85b8.png)

48. GROUP BY and HAVING 

In SQL, "GROUP BY" and "HAVING" are both clauses that are used in conjunction with the SELECT statement to filter and aggregate data. While both clauses are related to filtering data based on a condition, they have different functions.

The "GROUP BY" clause is used to group the result set by one or more columns. This is useful when you want to aggregate data based on a specific category. For example, if you have a table of sales data, you might use the GROUP BY clause to group the data by product category to see the total sales for each category:

```java
SELECT product_category, SUM(sales) FROM sales_table GROUP BY product_category;
```

The "HAVING" clause is used to filter the results of the GROUP BY clause. It allows you to specify a condition that must be met for the grouped data to be included in the result set. For example, you might use the HAVING clause to filter the results of the previous example to only include categories where the total sales are greater than a certain amount:

```java
SELECT product_category, SUM(sales) FROM sales_table GROUP BY product_category HAVING SUM(sales) > 100000;
```

49.UNION

In SQL, the "UNION" operator is used to combine the result sets of two or more SELECT statements into a single result set. The result set returned by the UNION operator contains all the distinct rows from the combined result sets of the SELECT statements.

The syntax for the UNION operator is as follows:

```java
SELECT column1, column2, ... FROM table1
UNION
SELECT column1, column2, ... FROM table2
[UNION ...];
```

50. Java 8 Functional Interface

![firefox_qLhJXC6IjR](https://user-images.githubusercontent.com/22981511/224123224-9c797719-38f8-490e-aba2-d70dea79957e.png)

51. Semaphores 

A counting semaphore. Conceptually, a semaphore maintains a set of permits. Each acquire() blocks if necessary until a permit is available, and then takes it. Each release() adds a permit, potentially releasing a blocking acquirer. However, no actual permit objects are used; the Semaphore just keeps a count of the number available and acts accordingly. Semaphores are often used to restrict the number of threads than can access some (physical or logical) resource.

![Screenshot 2023-03-10 at 13 19 40](https://user-images.githubusercontent.com/22981511/224314504-e1ce93b4-b19e-4f2d-a86e-e15d3f1a3cbc.png)

52.

- Future
https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/Future.html

- FutureTask
https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/FutureTask.html

- Callable
https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/Callable.html

- Runnable 
https://docs.oracle.com/javase/7/docs/api/java/lang/Runnable.html

53. The difference between the Runnable and Callable interfaces in Java?

![Screenshot 2023-03-10 at 13 33 50](https://user-images.githubusercontent.com/22981511/224317417-11c983af-ed94-45f5-a709-9e5a170ad58b.png)

54. Liskov substitution 

```java
class Shape {
  int area() {
    return 0;
  }
}

class Rectangle extends Shape {
  int width;
  int height;
  
  @Override
  int area() {
    return width * height;
  }
}

class Square extends Shape {
  int side;
  
  @Override
  int area() {
    return side * side;
  }
}

class AreaCalculator {
  int calculateArea(Shape shape) {
    return shape.area();
  }
}

public class LiskovSubstitutionExample {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    rectangle.width = 5;
    rectangle.height = 10;
    
    Square square = new Square();
    square.side = 5;
    
    AreaCalculator calculator = new AreaCalculator();
    int rectangleArea = calculator.calculateArea(rectangle);
    int squareArea = calculator.calculateArea(square);
    
    System.out.println("Rectangle area: " + rectangleArea);
    System.out.println("Square area: " + squareArea);
  }
}

```

55. Dependency inversion principle 

```java
public interface Database {
    void saveData(String data);
}

public class MySqlDatabase implements Database {
    public void saveData(String data) {
        System.out.println("Saving " + data + " to MySQL database");
    }
}

public class PostgresDatabase implements Database {
    public void saveData(String data) {
        System.out.println("Saving " + data + " to Postgres database");
    }
}

public class OrderProcessor {
    private final Database database;
    
    public OrderProcessor(Database database) {
        this.database = database;
    }
    
    public void processOrder(String orderData) {
        // Process order
        database.saveData(orderData);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a MySQL database instance and use it to process an order
        Database mySqlDatabase = new MySqlDatabase();
        OrderProcessor orderProcessor = new OrderProcessor(mySqlDatabase);
        orderProcessor.processOrder("Order data");
        
        // Create a Postgres database instance and use it to process another order
        Database postgresDatabase = new PostgresDatabase();
        orderProcessor = new OrderProcessor(postgresDatabase);
        orderProcessor.processOrder("Another order data");
    }
}

```


