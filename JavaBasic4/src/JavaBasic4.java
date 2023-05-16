public class JavaBasic4 {

    static public void main(String[] args) {
        int[] arr = new int[50];
        int j = 0;
         for (int i = 0; i <= 50; i++ ) {
             if (i % 2 == 0)
             {
                 System.out.print(i + ", ");
                 arr[j++] = i;
             }
         }
         System.out.println();
         System.out.println("Print array");
         for (int i = 0; i < j; i++)
         {
             System.out.print(arr[i] + ", ");
         }
    }
}
