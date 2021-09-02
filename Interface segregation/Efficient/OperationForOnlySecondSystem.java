/*
This interface has extraa feature which is related to second system and not related to firstsystem.It extends Operation.So it
has the method of operation interface.
*/
public interface OperationForOnlySecondSystem extends Operation {
    String DeleteCharacterAtSpecificPosition(String str,int pos);
    Boolean CheckTwoStringEqual(String str1,String str2);
}
