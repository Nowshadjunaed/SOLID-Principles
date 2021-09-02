/*
Now operation interface has all the method of firstsytem.And operation interface doesn't contain extraa method.So First system should not implement
any method which is related to SecondSystem.
 */
public class FirstSystem implements Operation {
    @Override
    String concatenate(String str1,String str2){
        //implementation
    }
    @Override
    String AppendCharacterAtSpecificPosition(String str,int pos,char ch)
    {
        //implementation
    }
    @Override
    int CurrentLength(String str){
        //implementation
    }
}
