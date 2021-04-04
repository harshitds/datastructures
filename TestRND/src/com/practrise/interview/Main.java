package com.practrise.interview;

import java.util.ArrayList;

//In the given Java example, we are sorting a stream of integers in natural order and printing into the standard output.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
 
public class Main 
{
    public static void main(String[] args) 
    {
    	List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
    	Main.naturalSort(list);
    	Main.naturalSortReverse(list);
    }
    
    public static void naturalSort(List<Integer> l)
    {
    	
    	 
        List<Integer> sortedList = l.stream()
                    .sorted()
                    .collect(Collectors.toList());
 
        System.out.println(sortedList);
    }
    
    public static void naturalSortReverse(List l)
    {
    	List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
    	 
        List<Integer> sortedList = list.stream()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());
 
        System.out.println(sortedList);
    }
}