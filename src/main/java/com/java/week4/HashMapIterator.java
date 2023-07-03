package com.java.week4;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

class Student1 {
    String FirstName,LastName;
    double GPA;
    public Student1(String FirstName,String LastName,double GPA)
    {
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.GPA=GPA;
    }
    public String toString()
    {
        return "Student1{" +
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
        HashMap<String,Student1> map=new HashMap<>();
        map.put("Santosh",new Student1("Santos","K",3.6));
        map.put("Sai",new Student1("Sai","Nath",3.8));
        map.put("pavan",new Student1("pavan","G",3.8));

        for(Map.Entry<String, Student1> entry: map.entrySet())
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
