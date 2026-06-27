package Modules;

import java.util.*;

public class module3 {

    public void main (String[] args){

        //         Map Methods
        // put(K, V) - Inserts the association of a key K and a value V into the map. If the key is already present, the new value replaces the old value.
        // putAll() - Inserts all the entries from the specified map to this map.
        // putifAbsent(K, V) - Inserts the association if the key K is not already associated with the value V.
        // get(K) - Returns the value associated with the specified key K. If the key is not found, it returns null.
        // getOrDefault(K, defaultValue) - Returns the value associated with the specified key K. If the key is not found, it returns the defaultValue.
        // containsKey(K) - Checks if the specified key K is present in the map or not.
        // containsValue(V) - Checks if the specified value V is present in the map or not.
        // replace(K, V) - Replace the value of the key K with the new specified value V.
        // replace(K, oldValue, newValue) - Replaces the values of the key K with the new values newValue only if the key K is associated with the value oldValue.
        // remove(K) - Removes the entry from the map that has key K associated with value V.
        // keyset() - Returns a set of all the keys present in a map.
        // values() - Returns a set of all the values present in a map.
        // entrySet() - Returns a set of all the key/value mapping present in a map.

        Map<String , String> mapping = new HashMap<>(); 

        mapping.put("usa" , "United States");
        mapping.put("pk" , "Pakistan");
        mapping.put("in" , "India");
        mapping.put("jp" , "Japan");

        System.out.println(mapping);

        Map<String , String> m = new  HashMap<>();

        m.put("br" , "Brazil");
        m.put("en" , "England");

        System.out.println(m);

        mapping.putAll(m);
        System.out.println(mapping);

        mapping.putIfAbsent("pk" , "Pakistan"); //Does nothin bcz it already exist

        System.out.println(mapping.get("pk"));

        System.out.println(mapping.getOrDefault("uk" , "Not Present"));

        System.out.println(mapping.containsKey("jp"));

        System.out.println(mapping.containsValue("China"));

        mapping.replace("in" , "Indonesia" );
        System.out.println(mapping);

        mapping.replace("usa" , "United States" , "United States of America");
        System.out.println(mapping);

        mapping.remove("in");
        System.out.println(mapping);

        //KeySet implements set
        Set<String> keySet = mapping.keySet();
        System.out.println(keySet);

        //Values implements Collections
        Collection<String> values = mapping.values();
        System.out.println(values);
        
        Set<Map.Entry<String , String>> entrySet = mapping.entrySet();

        for(Map.Entry<String , String> entry : entrySet){
            System.out.println(entry);
        }

        //Everything remain same for other way of implementation
        //LinkedHashMap
        //TreeMap
        //It's just the arrangemnt at which these keep the maps


        List<Integer> integer = new ArrayList<>();
        integer.add(5);
        integer.add(40);
        integer.add(58);
        integer.add(49);

        Collections.sort(integer);
        System.out.println(integer);//Bcz for buildIn data types we dont need ComparatorOrComparable they are already defined

        List<Student> students = new ArrayList<>();

        students.add(new Student(20 , "Mudasir" , 50));
        students.add(new Student(19 , "AbuBakar" , 54));
        students.add(new Student(20 , "Hubesh" , 56));

        // Collections.sort(students);
        // System.out.println(students);


        // Collections.sort(students, new Comparator<Student>() {
        //         @Override
        //         public int compare(Student o1, Student o2) {
        //         return o1.weight - o2.weight;
        //         }
        //         });

        Collections.sort(students , (o1 , o2) -> o1.weight - o2.weight);


        int[] arr = {3,5,7,1,2,4,6};
        Arrays.sort(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }

    }

}

class Student implements Comparable<Student>{
    int age;
    String name;
    int weight;
    public Student(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + ", weight=" + weight + "]";
    }

    @Override
    public int compareTo(Student o) {
        if(this.age == o.age ){
            return this.name.compareTo(o.name);
        }
        return this.age - o.age;    
    
    }


}