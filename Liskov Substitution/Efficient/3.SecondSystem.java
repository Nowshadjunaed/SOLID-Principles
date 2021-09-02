/*
second system extends operation class.We don't need the function name RemainderOfTwoNumbers here.But to abide by liskov principle
we added this in operation class. So I added a customize exception for this method in this class.So now we can use parent
class instance to access any of the child member
*/
public class SecondSystem extends Operation {
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
    @Override
    int RemainderOfTwoNumbers(int a,int b){
        throw new NullPointerException("SecondSystem");
    }
}
