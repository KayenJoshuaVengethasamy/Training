package src.gorilla.test;

import java.util.ArrayList;
import java.util.List;

public class Chocolates {
    private static int solution(final int[] chocolates){
        int n= chocolates.length;
        List<Integer> differentChocolates = new ArrayList<>();
        if (n%2 != 0 ){
            return 0;
        }
        for(int i:chocolates){
            if (!differentChocolates.contains(i)){
                differentChocolates.add(i);
            }
        }
        int[] result = new int[differentChocolates.size()];
        int j = 0;
        for (int k : differentChocolates){
            result[j++] = k;
        }
        return result.length;
    }
    public static void main(String[] args) {
        final int result = solution(new int[]{1,1,2,2,2,3});
        System.out.print((result == 3 ? "OK: ": "FAIL: ")+ result);
    }
}
