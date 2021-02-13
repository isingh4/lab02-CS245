import java.util.Arrays;

public class Lab02 {
    public void selectionSort(int num[]) {
        for (int i = 0; i < num.length - 1; i++) {
            int temp = i;
            for (int j = i+1; j < num.length; j++) {
                if (num[j] < num[temp]) {
                    temp = j;
                }
            }
            int x = num[temp];
            num[temp] = num[i];
            num[i] = x;
        }
    }

    public int[] twoSum(int[] num, int sum) {
        selectionSort(num);
        int [] sumArray= new int [2];
        int [] error = {-1};
        for (int i = 0; i < num.length-1; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] + num[j] == sum) {
                   sumArray[0]= i;
                   sumArray[1]=j;
                   return sumArray;
                }


            }
        }
        return error;
    }

    public static void main(String[] args) {
        Lab02 lab02= new Lab02();
        int[] num = {22,16,41,2,32,18};
        System.out.println("The two indicies are "+ Arrays.toString(lab02.twoSum(num,50)));
    }
}