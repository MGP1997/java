package test5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test07 {
    public static void main(String[] args) {
        for (int count = 1; count <= 5; count++) {
            System.out.println(makeLotto());
        }
    }

    public static Set<Integer> makeLotto() {
        Set<Integer> lottoSet = new HashSet<>();

        while (true) {
            int num = (int)(Math.random() * 45) + 1; // 1 ~ 45
            lottoSet.add(num);

            if (lottoSet.size() == 6) {
                break;
            }
        }

       
        Set<Integer> treeSet = new TreeSet<>(lottoSet);
        return treeSet;
    }
}
