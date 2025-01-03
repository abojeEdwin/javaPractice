import java.util.Arrays;

public class ArrayIteration {
    public static void main(String[] args) {
        int  array []  = {2,3,4,5,6,4,5,7,8};

        System.out.printf("%s%8s%n", "Index","Value");

        for(int i=0; i<array.length; i++){
            System.out.printf("%5d%8d%n",i,array[i]);
        }
    }
}
