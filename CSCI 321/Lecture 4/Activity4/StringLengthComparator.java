// StringLengthComparator.java
import java.util.Comparator;

public class StringLengthComparator implements Comparator<String>
{
    @Override
    public int compare(Integer num1, Integer num2)
    {
        String binary1 = Integer.toBinaryString(num1);
        String binary2 = Integer.toBinaryString(num2);
        
        int count1 = 0;
        int count2 = 0;
        
        for(int i = 0; i < binary1.length(); i++)
        {
         count1+=binary1.charAt(i)&1;
        }
        
        for(int i = 0; i < binary2.length(); i++)
        {
         count2+=binary2.charAt(i) & 1;
        }
        
        if(count1 == count2)
         return 0;
        else if (count1 < count2)
         return -1;
        else
        return 1;
    }

}