package com.krish.algorithms.and.datastructures;
import java.util.HashMap;
import java.util.Map;

public class Socks {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int count = 0;
        Map<Integer, Integer> result = new HashMap<>();                
        for(int a: ar) {
            if(null == result.get(a))
                result.put(a, 1);
            else
                result.put(a, result.get(a) + 1);
        }
        
        for(Integer key: result.keySet()) {
            if(result.get(key) > 1)
                count = count + result.get(key) / 2;
        }
        
        return count;
    }

    public static void main(String[] args) {
    	System.out.println(sockMerchant(10, new int[] {1,3,4,1,6,4,8,2,6,9}));
    }
}
