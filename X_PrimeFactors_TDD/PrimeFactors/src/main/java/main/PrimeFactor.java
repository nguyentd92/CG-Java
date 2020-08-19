package main;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public static List<Integer> generate(int n) {
        List<Integer> list = new ArrayList<>();

        for(int candidate = 2; candidate <= n; candidate++)
            for(; n % candidate == 0; n /= candidate)
                list.add(candidate);

        return list;
    }
}
