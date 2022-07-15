import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> IDS = new HashMap<>();

        IDS.put("TONY", 12345);
        IDS.put("Curtis", 88888);
        IDS.put("Borg", 77777);
        IDS.put("Poan", 6666);

        System.out.println(IDS);
        int counters=0;
                counters=counters+1;
        Iterator iterator =IDS.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry mapEntry = (Map.Entry) iterator.next();
            System.out.println("The key is:"+mapEntry.getKey()+"  Value is:"+mapEntry.getValue()+"  Counters is:"+counters);
          for (Iterator it= IDS.entrySet().iterator(); it.hasNext();){
              Map.Entry map1Entry =(Map.Entry) it.next();
              System.out.println("The key is:"+mapEntry.getKey()+"  Value is:"+mapEntry.getValue());

          }


    }
    /*public static void myMap(){
        Map myMap =new HashMap<>();

        myMap.put("1","Monday");
        myMap.put("2","Tuesday");
        myMap.put("3","Wednesday");

        Iterator iterator =myMap.entrySet().iterator();
        while (iterator.hasNext()){
               Map.Entry mapEntry = (Map.Entry) iterator.next();
               System.out.println("The key is:"+mapEntry.getKey()+"Value is:"+mapEntry.getValue());

        }*/
    }

}
