/*
Here, FirstSystem class extends operation.It implements all abstract method of operation. But it implements one extraa
method named RemainderOfTwoNumbers which is not a member of operation class.That's why it can not be accessed using the instance of
operation class or parent class.So it violates Liskov Substitution Principle
*/

public class FirstSystem extends Operation {
    @Override
    int SumOfTwoNumbers(int a,int b){
        return a+b;
    }
    @Override
    int SubtractionOfTwoNumbers(int a,int b)
    {
        return a-b;
    }
    @Override
    int MultiplicationOfTwoNumbers(int a,int b){
        return a*b;
    }

    int RemainderOfTwoNumbers(int a,int b){
        return a%b;
    }
}
