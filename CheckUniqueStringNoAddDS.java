/**
 * Created by SRamasubramanian on 10/2/2016.
 */
public class CheckUniqueStringNoAddDS
{
    public static void main(String[] args)
    {
        String s = "Something";
        boolean isUnique = true;

        for (int i=0; i<s.length() && isUnique; i++)
        {
            char c = Character.toLowerCase(s.charAt(i));

            for (int j=i+1; j<s.length(); j++)
            {
                if (Character.toLowerCase(s.charAt(j)) == c)
                {
                    System.out.println("String is not unique!");
                    isUnique = false;
                    break;
                }
            }
        }
        if (isUnique)
            System.out.println("String is unique!");
    }
}
