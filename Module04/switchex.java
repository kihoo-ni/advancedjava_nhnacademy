package Module04;

public class switchex{
    public static void main(String[] args) {
        int monthNumber = 6;
        int daysInMonth = 0;
        switch (monthNumber) {
            case 2:
                daysInMonth = 28; break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30; break;
            default:
                daysInMonth = 31; break;
            }

            System.out.println(daysInMonth);
        }
        
}