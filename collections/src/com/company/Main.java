package com.company;

import java.util.*;
import java.util.function.Predicate;

public class Main  {

    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<Integer>();
        stk.push(4);
        stk.push(9);
        System.out.println(stk.peek());
        Queue<Integer> que=new PriorityQueue<>();
        que.add(0);
        que.add(9);
        System.out.println(stk.peek());
        List<String> names = Arrays.asList(
                "Geek", "GeeksQuiz", "g1", "QA", "Geek2");
        Predicate<String>p1=(s)->s.startsWith("G");
        for (String st : names) {
            // call the test method
            if (p1.test(st))
                System.out.println(st);
        }


        List<Ets>e=new ArrayList<>();
        //Ets e1=new Ets(8,"gg");
        e.add(new Ets(1,"Koo"));
        e.add(new Ets(2,"Vooema"));
        System.out.println(e.get(1).getName());
        printable p=(a)->a*a*a;
        System.out.println(p.jj(3));
        Iterator<Ets>es=e.iterator();
        while (es.hasNext()){
            System.out.println(es.next().getName());
        }

    }
    /* static void printint(printable p){
        p.jj(6);
    }*/
}
