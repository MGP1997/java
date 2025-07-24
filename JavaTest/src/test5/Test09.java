package test5;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Orange {
    private String country;
    private int price;

    public Orange(String country, int price) {
        this.country = country;
        this.price = price;
    }

    public void show() {
        System.out.println("Orange [country=" + country + ", price=" + price + "]");
    }
}

public class Test09 {
    public static void main(String[] args) {
        List<Orange> list1 = new ArrayList<>();
        list1.add(new Orange("파주", 3000));
        list1.add(new Orange("수원", 3000));

        List<Orange> list2 = new ArrayList<>();
        list2.add(new Orange("청주", 3000));
        list2.add(new Orange("충주", 3000));

        List<Orange> list3 = new ArrayList<>();
        list3.add(new Orange("밀양", 3000));
        list3.add(new Orange("함안", 3000));

        Map<String, List<Orange>> map = new HashMap<>();

        map.put("수원", list1);
        map.put("충주", list2);
        map.put("밀양", list3);
        
        // 전체 출력
        for (String key : map.keySet()) {
            System.out.println("지역 : " + key);
            List<Orange> list = map.get(key);
            for (Orange orange : list) {
                orange.show();
            }
            System.out.println();
        }
    }
}