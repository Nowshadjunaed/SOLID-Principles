/*
Now we can easily add multiplication or any other operation.For this ,we don't have to change code in  Calculation class.
We just have to add the class of the particular operation (Multiplication).So. here open close principle is maintained.
*/
import java.security.InvalidParameterException;

public class Calculation implements Solve {
    @Override
    public int calculate(Operation operation)
    {
        int ans = 0;
        if(operation == null) {
            throw new InvalidParameterException("invalid");
        }

        return operation.performOperation();
    }
}
