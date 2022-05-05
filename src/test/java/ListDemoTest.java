import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;

public class ListDemoTest {
    Human Jake = new Human("Jake", "Json", "Humanoidov", 17);
    Human Cake = new Human("Cake", "Json", "Humanoidov", 18);
    Human Take = new Human("Take", "Mson", "Alienov", 19);
    Student Lake = new Student("Lake", "Mson", "Sidorov", 19, "FMIT");

    @Test
    public void sameLastNameTest(){
        List<Human> humans = new ArrayList<>();
        humans.add(Jake);
        humans.add(Cake);
        humans.add(Take);

        List<Human> obrazec = new ArrayList<>();
        obrazec.add(Jake);
        obrazec.add(Cake);

        List<Human> hs = ListDemo.sameLastName(humans, Jake);

        assertTrue(obrazec.equals(hs));
    }

    @Test
    public void excludeHumanTest(){
        List<Human> humans = new ArrayList<>();
        humans.add(Jake);
        humans.add(Cake);
        humans.add(Take);

        List<Human> obrazec = new ArrayList<>();
        obrazec.add(Jake);
        obrazec.add(Cake);


        List<Human> hs = ListDemo.excludeHuman(humans, Take);
        //humans.remove(Jake);

        //assertTrue(hs.equals(humans));

        assertTrue(obrazec.equals(hs));
    }

    @Test
    public void intersectionListTest(){
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(4);

        List<Set<Integer>> listActual = new ArrayList<>();

        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);

        HashSet<Integer> setB = new HashSet<>();
        setB.add(1);
        setB.add(3);

        HashSet<Integer> setC = new HashSet<>();
        setC.add(3);
        setC.add(4);
        setC.add(5);
        setC.add(6);
        setC.add(7);
        setC.add(8);
        setC.add(9);
        setC.add(10);

        listActual.add(setA);
        listActual.add(setB);
        listActual.add(setC);

        List<Set<Integer>> listExpected = new ArrayList<>();
        listExpected.add(setB);

        assertEquals(listExpected, ListDemo.intersectionList(listActual, set));
    }

    @Test
    public void maxAgeTest() {
        List<Human> humans = new ArrayList<>(new ArrayList<Human>(Arrays.asList(Jake, Cake, Take, Lake)));

        Set<Human> obrazec = new HashSet<>(new ArrayList<Human>(Arrays.asList(Take, Lake)));

        Set<Human> hs = ListDemo.maxAge(humans);

        assertEquals(hs, obrazec);
    }

    @Test
    public void idSetTest() {
        //List<Human> humans = new ArrayList<>(new ArrayList<Human>(Arrays.asList(Jake, Cake, Take, Lake)));

        Set<Integer> ids = new HashSet<>(new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12)));

        Map<Integer, Human> humanses = new HashMap<>();
        humanses.put(1, Jake);
        humanses.put(2, Cake);
        humanses.put(3, Take);
        humanses.put(4, Lake);

        Set<Human> obrazec = new HashSet<>(new ArrayList<Human>(Arrays.asList(Cake, Lake)));

        Set<Human> hs = ListDemo.idSet(humanses, ids);

        assertEquals(hs, obrazec);
    }

    @Test
    public void adultListTest() {
        ArrayList<Integer> ids = new ArrayList<>(new ArrayList<Integer>(Arrays.asList(2, 3, 4)));

        Map<Integer, Human> humanses = new HashMap<>();
        humanses.put(1, Jake);
        humanses.put(2, Cake);
        humanses.put(3, Take);
        humanses.put(4, Lake);

        ArrayList<Integer> hs = ListDemo.adultList(humanses);

        assertEquals(hs, ids);
    }

    @Test
    public void ageMapTest() {
        Map<Integer, Human> humanses = new HashMap<>();
        humanses.put(1, Jake);
        humanses.put(2, Cake);
        humanses.put(3, Take);
        humanses.put(4, Lake);

        Map<Integer, Integer> ages = new HashMap<>();
        ages.put(1, 17);
        ages.put(2, 18);
        ages.put(3, 19);
        ages.put(4, 19);

        Map<Integer, Integer> hs = ListDemo.ageMap(humanses);

        assertEquals(hs, ages);
    }

    @Test
    public void ageToHumansMapTest(){
        Set<Human> humanses = new HashSet<>(new ArrayList<Human>(Arrays.asList(Jake, Cake, Take, Lake)));

        Map<Integer, ArrayList<Human>> obrazec = new HashMap<>();
        obrazec.put(17, new ArrayList<Human>(new ArrayList<Human>(List.of(Jake))));
        obrazec.put(18, new ArrayList<Human>(new ArrayList<Human>(List.of(Cake))));
        obrazec.put(19, new ArrayList<Human>(new ArrayList<Human>(Arrays.asList(Lake, Take))));

        Map<Integer, List<Human>> hs = ListDemo.ageToHumansMap(humanses);

        assertEquals(hs, obrazec);
    }
}