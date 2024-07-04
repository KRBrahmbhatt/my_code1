public class array {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5};
        int expected_value = 3;

        for(int i=0;i<num.length;i++)
        {
            if(num[i]==expected_value)
            {
                System.out.println("yes");
                break;
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
