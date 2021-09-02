/* Let we have two system.Both system can concatenate two strings ,append character at specific position
and calculate current length of string.But only 2nd system can delete character at specific position and check whether
two strings are equal or not.
 */
public interface Operation {
    String concatenate(String str1,String str2);
    String AppendCharacterAtSpecificPosition(String str,int pos,char ch);
    int CurrentLength(String str);

    String DeleteCharacterAtSpecificPosition(String str,int pos);
    Boolean CheckTwoStringEqual(String str1,String str2);

}
