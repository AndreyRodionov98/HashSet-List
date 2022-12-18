import java.util.*;

public class MapTest {
    private static final Map<String ,Integer>strMap=new HashMap<>();
    public static void main(String[]args){
        test1();
        test2();
        //test3();

    }
    private static void test1(){
        addNumberToMap("строка",1);
        addNumberToMap("строка",2);
        addNumberToMap("строка 2",3);
        addNumberToMap("строка 2",4);
        for (Map.Entry<String,Integer>stringIntegerEntry:strMap.entrySet()){
            System.out.println(stringIntegerEntry.getKey()+":"+stringIntegerEntry.getValue());
        }

    }
    public static void addNumberToMap(String s,Integer i ){
        if (strMap.containsKey(s)&&strMap.containsKey(i)){
            throw new RuntimeException(strMap+" ключ уже есть и значение совпадает");
        }
    }
    private static void test2(){
        Map<String, List<Integer>>listMap=new HashMap<>();
        listMap.put("string1",List.of(11,12,13));
        listMap.put("string2",List.of(100,110,120));
        listMap.put("string3",List.of(220,120,230));
        listMap.put("string4",List.of(140,145,120));
        listMap.put("string5",List.of(110,125,154));
        Map<String,Integer>listMap1=new HashMap<>();
        for (Map.Entry<String,List<Integer>>stringListEntry:listMap.entrySet()){
            listMap1.put(stringListEntry.getKey(), sumElements(stringListEntry.getValue()));
            System.out.println((stringListEntry.getKey()+":"+sumElements(stringListEntry.getValue())));
        }
    }
    public static  Integer sumElements(List<Integer>list){
        Integer sum=0;
        for (Integer element:list){
            sum+=element;
        }
        return sum;
    }
    public static void test3(){
        Map<Integer,String>someNumbers=new LinkedHashMap<>();
        someNumbers.put(1,"one");
        someNumbers.put(2,"two");
        someNumbers.put(3,"three");
        someNumbers.put(4,"four");
        someNumbers.put(5,"five");
        for (Map.Entry<Integer,String>integerStringEntry: someNumbers.entrySet()){
            System.out.println(integerStringEntry.getKey()+":"+integerStringEntry.getValue());
        }
    }
}
