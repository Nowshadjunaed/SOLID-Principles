/*
The code may look good but if we want to add multiplication/division we have to change the code.
That means modification will occur in this class.Again if we create class for some other operation then further modifications will need
in this class to perform their operation.This is the problem here.We have to think a solution where if a new class is added for operation we don't have to
make any modification in this class.
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

        if(operation instanceof Summation) {
            Summation obj = (Summation) operation;
            ans = obj.geta()+obj.getb();
        } else if(operation instanceof Subtraction) {
            Subtraction obj = (Subtraction) operation;
            ans = obj.geta()-obj.getb();
        }
        return ans;
    }
}
