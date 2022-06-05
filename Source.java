import java.util.*;
public class Source{
    //Method to print distinct values
    public static void printValues(Map<Integer,String> map){
        //Write your code here
        Set<String> h = new HashSet<String>();
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            String temp = entry.getValue();
            if (h.contains(temp)) {
                map.remove(entry);
            } else {
                h.add(entry.getValue());
            }
        }
    }

    public static void main(String[] x){
        Map<Integer,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.nextInt();
            value = sc.next();
            map.put(key,value);
        }
        printValues(map);
    }
}
