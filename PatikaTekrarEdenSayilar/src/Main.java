import java.util.Arrays;

public class Main {



    public static void main(String[] args) {

        int [] list = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(list);
        int start=1;
        int a=0;


        for (int i=0;i< list.length;i++) {
            if (list[i] != a) {
                for (int j = 0; j < list.length; j++) {

                    if (i != j && list[i] == list[j]) {
                        a = list[i];
                        start++;

                    }


                }
                System.out.println(list[i]+" sayısı "+start+" kere tekrar edilmiştir. ");
                start = 1;
            }
        }








    }
}
