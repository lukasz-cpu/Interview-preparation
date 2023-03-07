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



