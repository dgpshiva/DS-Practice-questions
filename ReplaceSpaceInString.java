/**
 * Created by shiva on 10/3/16.
 */
public class ReplaceSpaceInString
{
    static char[] replaceSpace(char[] str, int length)
    {
        int spaceCount = 0;
        int newLength = 0;

        for (int i=0; i<length; i++)
        {
            if (str[i] == ' ')
                spaceCount++;
        }

        newLength = length + (2*spaceCount);
        str[newLength] = '\0';

        for (int i=length-1; i>=0; i--)
        {
            if (str[i] == ' ')
            {
                str[newLength - 1] = '0';
                str[newLength - 2] = '2';
                str[newLength - 3] = '%';
                newLength = newLength - 3;
            }
            else
            {
                str[newLength - 1] = str[i];
                newLength--;
            }
        }

        return str;
    }

    public static void main(String[] args)
    {
        char[] result = replaceSpace("Test is again     ".toCharArray(), 13);

        for (char c : result)
        {
            System.out.print(c);
        }


    }
}
