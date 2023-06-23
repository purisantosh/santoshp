package com.java.week4;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

class Student {
    String FirstName,LastName;
    double GPA;
    public Student(String FirstName,String LastName,double GPA)
    {
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.GPA=GPA;
    }
    public String toString()
    {
        return "Student{" +
                "FirstName='"+FirstName+'\''+
                ",LastName='"+LastName+'\''+
                ",GPA="+GPA+
                '}';

    }

}
class HashMapIterator
{
    public static void main(String[] args)
    {
        HashMap<String,Student> map=new HashMap<>();
        map.put("Santosh",new Student("Santos","K",3.6));
        map.put("Sai",new Student("Sai","Nath",3.8));
        map.put("pavan",new Student("pavan","G",3.8));

        for(Map.Entry<String, Student> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("----");
        map.entrySet().forEach(entry->System.out.println(entry.getKey()+" : "+entry.getValue()));
        System.out.println("---");
        Iterator<String> itr=map.keySet().iterator();
        while (itr.hasNext())
        {
            String key=itr.next();
            System.out.println(key+" :"+map.get(key));
        }
    }
}
