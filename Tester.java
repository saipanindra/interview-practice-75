public class Tester {
    public static void main(String[] args)
    {
        TwoSum t  = new TwoSum();
        printResult(t.twoSum(new int[]{ 3, 2,4}, 6));
    }
    private static void printResult(int[] a)
    {
        System.out.println(a[0] +  ", "+ a[1]);
    }
}

