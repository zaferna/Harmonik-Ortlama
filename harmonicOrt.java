public class harmonicOrt {
    public static void main(String[] args) {

       double[] arr = {1,2,3,4,5,};
        double sum = 0;

        for(int i = 0 ;i<arr.length;i++){

            sum+= 1/arr[i];
            


        }
        System.out.println(sum/arr.length);
    }
}
