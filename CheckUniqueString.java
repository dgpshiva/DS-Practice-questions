/**
 * Created by SRamasubramanian on 10/1/2016.
 */
public class HashMap
{
    private char[] table;
    private static int TABLE_SIZE = 257;
    private boolean isUnique;

    HashMap()
    {
        table = new char[TABLE_SIZE];
        isUnique = true;
    }

    public boolean insert(char value)
    {
        int hash = (int)value;
        if ((int)table[hash] != 0)
        {
            isUnique = false;
            return isUnique;
        }
        else
        {
            table[hash] = value;
            return isUnique;
        }
    }
}


/**
 * Created by SRamasubramanian on 10/1/2016.
 */
public class CheckUniqueString
{
    public static void main(String[] args)
    {
        boolean isUnique = true;

        HashMap map = new HashMap();

        String s = "Something";

        for (int i=0; i<s.length(); i++)
        {
            isUnique = map.insert(Character.toLowerCase(s.charAt(i)));
            if (!isUnique)
            {
                System.out.println("String is not unique!");
                break;
            }
        }
        if (isUnique)
        {
            System.out.println("String is unique!");
        }
    }
}
