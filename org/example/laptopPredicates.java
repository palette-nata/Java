package org.example;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class laptopPredicates 
{
    public static Predicate<laptop> isRamHigherThan(int n) {
        return p -> p.RAM > n; 
    }

    public static Predicate<laptop> isRamLessThan(int n) {
        return p -> p.RAM < n; 
    }
    
    public static Predicate<laptop> isHDDHigherThan(int n) {
        return p -> p.HDD > n; 
    }

    public static Predicate<laptop> isHDDLessThan(int n) {
        return p -> p.HDD < n; 
    }

    public static Predicate<laptop> isOsEqualsTo(String os) {
        return p -> p.OS.equals(os);
    }

    public static Predicate<laptop> isColorEqualsTo(String color) {
        return p -> p.Color.equals(color);
    }

    public static List<laptop> filteredLaptops(List<laptop> laptops, 
                                                Predicate<laptop> predicate) {
        return laptops.stream()
              .filter( predicate )
              .collect(Collectors.toList());
    }
}   
