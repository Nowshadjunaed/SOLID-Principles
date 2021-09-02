/*
The code may look good but if we want to add multiplication/division we have to change the code.
That means modification will occur.So it violates open close principle
*/
import java.security.InvalidParameterException;

public class Calculation {
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
