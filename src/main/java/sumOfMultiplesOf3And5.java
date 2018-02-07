public class sumOfMultiplesOf3And5 {

    public static void main(String args[])
    {
        int range;
        range = 1000;
        Calculate calculate = new Calculate();
        System.out.println("Sum of multiples of 3 and 5 below " + range + " = " + calculate.getSumOfMultiples(range));
    }

}
