/**
 * Created by SRamasubramanian on 10/3/2016.
 */
public class CheckPermutation
{
    static boolean checkPermutation(String string1, String string2)
    {
        int len = string1.length();
        if (len != string2.length())
        {
            return false;
        }

        int[] hashTable = new int[257];
        char[] string1AsCharArray =  string1.toCharArray();
        for (char c : string1AsCharArray)
            hashTable[Character.toLowerCase(c)]++;

        for (int i=0; i<len; i++)
        {
            if (--hashTable[Character.toLowerCase(string2.charAt(i))] < 0)
                return false;
        }

        return true;
    }


    public static void main(String[] args)
    {
        String string1 = "Shiva";
        String string2 = "hvias";

        boolean isPermutaed = checkPermutation(string1, string2);

        if (isPermutaed)
            System.out.println("Strings are permutations");
        else
            System.out.println("Strings are not permutations");

    }
}
