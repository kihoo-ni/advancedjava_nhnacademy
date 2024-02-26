package Module03;

class cast
{
    public static void main(String[] args)
    {
        long longValue = Long.MAX_VALUE;
        int intValue = (int)longValue;
        System.out.printf("(long) %d = %d", longValue, intValue);
    }
}