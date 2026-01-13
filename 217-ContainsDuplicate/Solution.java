import java.util.HashSet;
class Solution
{
    public boolean containsDuplicate(int[] nums)
    {
        HashSet<Integer> numbers=new HashSet<>();
        for(int num:nums)
        {
            if(numbers.add(num)==false)
            {
                return true;
            }
            
        }
        return false;
    }
}