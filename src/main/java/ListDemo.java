import java.util.*;

public class ListDemo {
    public static List<Human> sameLastName(List<Human> humans, Human tHuman){
        if(humans.isEmpty()){
            throw new IllegalArgumentException("The list is empty");
        }

        List<Human> finish = new ArrayList<>();
        String lastName = tHuman.getLastName();
        for (Human h: humans){
            if (h.getLastName().equals(lastName)){
                finish.add(h);
            }
        }

        return finish;
    }

    public static List<Human> excludeHuman(List<Human> humans, Human target){
        if(humans.isEmpty()){
            throw new IllegalArgumentException("The list is empty");
        }

        List<Human> finish = new ArrayList<>();
        //if(!humans.contains(target)){
        //    throw new IllegalArgumentException("The list does not contain an element to delete");
        //    return finish;
        //}

        for (Human h: humans){
            if (!h.equals(target)){
                finish.add(h);
            }
        }

        return finish;
    }

    public static List<Set<Integer>> intersectionList(List<Set<Integer>> list, Set<Integer> set) {
        ArrayList<Set<Integer>> finish = new ArrayList<>();
        for (Set<Integer> tempSet : list) {
            boolean checkJoin = false;
            for (Integer tempInt : tempSet) {
                checkJoin = set.contains(tempInt);
                if (checkJoin) {
                    break;
                }
            }
            if (!checkJoin) {
                finish.add(tempSet);
            }
        }
        return finish;
    }

    public static Set<Human> maxAge(List<Human> humanz){
        Set<Human> finish = new HashSet<>();

        int max = 0;
        for (Human hu : humanz){
            if(hu.getAge() > max){
                max = hu.getAge();
            }
        }

        for (Human hu : humanz){
            if(hu.getAge() == max){
                finish.add(hu);
            }
        }

        return finish;
    }

    public static Set<Human> idSet(Map<Integer, Human> humans, Set<Integer> ids){
        Set<Human> finish = new HashSet<>();

        for(Map.Entry<Integer, Human> entry: humans.entrySet()){
            if(ids.contains(entry.getKey())){
                finish.add(entry.getValue());
            }
        }

        return finish;
    }

    public static ArrayList<Integer> adultList(Map<Integer, Human> humans){
        ArrayList<Integer> finish = new ArrayList<>();

        for(Map.Entry<Integer, Human> entry: humans.entrySet()){
            if (entry.getValue().getAge() >= 18){
                finish.add(entry.getKey());
            }
        }

        return finish;
    }

    public static Map<Integer, Integer> ageMap(Map<Integer, Human> humans){
        Map<Integer, Integer> finish = new HashMap<>();

        for(Map.Entry<Integer, Human> entry: humans.entrySet()){
            finish.put(entry.getKey(), entry.getValue().getAge());
        }

        return finish;
    }

    public static Map<Integer, List<Human>> ageToHumansMap(Set<Human> humans){
        Map<Integer, List<Human>> finish = new HashMap<>();

        for (Human chel : humans) {
            if (!finish.containsKey(chel.getAge())) {
                finish.put(chel.getAge(), new ArrayList<Human>());
            }
            finish.get(chel.getAge()).add(chel);
        }

        return finish;
    }
}

