package Number_Programs;

public class WrapperClasses
{
    public static void main(String[] args)
    {
        //Wrapping of objects or Boxing
        int i=5;
        Integer object = new Integer(i);
        
        //AutoBoxing
        Integer object2 = i;
        int k = object2; //AutoUnboxing
        System.out.println("Value of k is : " + k);
        System.out.println("Value of object2 is : " + object2.intValue());
        
        //Unwrapping of objects or Unboxing
        int j = object.intValue();
        System.out.println("Value of j is : " + j);
    }
}