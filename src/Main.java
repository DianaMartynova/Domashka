import java.util.*;

public class Main {
    public static void main(String[] args)  {

        Set <Integer> set = new HashSet<>();
        set.add(40);
        set.add(10);
        set.add(23);
        set.add(33);
        System.out.println(convert(set));
    }
    public static Map<String,Long> convert(Set<Integer> set){
        List<Integer> list = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (Integer i:set){
            list.add(i);  //кладем значения сета в лист
        }
        for (int j=0;j<list.size();j++){ //разделяем значения по четным и нечетным
           if(list.get(j)% 2==0){
               even.add(list.get(j));
           }else{
               odd.add(list.get(j));
           }
        }
        Map<String,Long> map = new HashMap<>(); //создаем мапу
        for (int g = 0; g <even.size();g++) { // кладем значение из листа в мапу изменяя тип
            map.put(Integer.toString(even.get(g)), (long) odd.get(g));
        }
        return map;

    }


}


