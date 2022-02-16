import java.util.*; 
class ArrayInteger
{
public static void main(String b[])
{
int[] array_nums = {66, 40, 52};
System.out.println("Original Array: "+Arrays.toString(array_nums)); 
int max_val = array_nums[0];
if(array_nums[2] >= max_val)
max_val = array_nums[2];
System.out.println("Larger value between first and last element: "+max_val); 
}
}