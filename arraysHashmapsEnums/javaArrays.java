public class javaArrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7,8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+",");
        }
        System.out.println('.');



      //reversing an array
        for(int i=0;i<numbers.length/2; i++){
            int temp =numbers[i];
            numbers[i]=numbers[numbers.length-i-1];
            numbers[numbers.length-i-1]=temp;

        }
        for (int number : numbers) {
            System.out.print(number+",");
        }
        System.out.println('.');


        //remove duplicates
        int[] nembni = {1,7,4,8,3,9,2,3,3,4,4,4,5,6,6,7,7,8,8,8};
        int uniqueCount =0;
        for(int i=0;i<nembni.length;i++){
            boolean duplicate = false;

            for(int j=i+1; j<nembni.length;j++){
                if(nembni[i]==nembni[j]){
                    duplicate =true;
                    break;
                }
            }
            if(!duplicate){
                nembni[uniqueCount]=nembni[i];
                uniqueCount++;
            }
        }
        for (int number : nembni) {
            System.out.print(number+",");
        }
    }


}