package com.template;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {

        return a + b;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {

        return number % 2 == 0;
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        if (input == null) {
            return 0;
        }
        return input.length();
    }

    // 6. Reverse a String
    public String reverse(String input) {
        if (input == null) {
            return "";
        }
        return new StringBuilder(input).reverse().toString();
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    // 11. Sum of Elements in a List
    public int sumList(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    // 12. Find the Largest Element in a List
    public int findMax(List<Integer> list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException("list is empty");
        }
        int max = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 13. Filter Even Numbers from a List
    public List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer> evens = new ArrayList<>();
        for (int num : list) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }
        return evens;
    }

    // 14. Concatenate Two Lists
    public List<String> concatenateLists(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }

    // 15. Check if List Contains Element
    public boolean listContains(List<String> list, String element) {
        for  (String item : list) {
            if  (item.equals(element)) {
                return true;
            }
        }
        return false;
    }

    // 16. Convert Strings to Uppercase
    public List<String> toUpperCase(List<String> list) {
        List<String> lista_mayus = new ArrayList<>();
        for (String item : list) {
            String item_mayus = item.toUpperCase();
            lista_mayus.add(item_mayus);
        }
        return lista_mayus;
    }

    // 17. Remove Duplicates from a List
    public List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    // 18. Convert List to Set for Unique Elements
    public Set<Integer> listToSet(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return new HashSet<>(set);
    }

    // 19. Check if Map Contains Key
    public boolean mapContainsKey(Map<String, String> map, String key) {
        return map.containsKey(key);
    }

    // 20. Check if Map Contains Value
    public boolean mapContainsValue(Map<String, String> map, String value) {
        return map.containsValue(value);
    }

    // 21. Iterate Over a Map
    public List<String> iterateMap(Map<String, String> map) {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            list.add(entry.getKey() + " -> " + entry.getValue());
        }
        return list;
    }
}
