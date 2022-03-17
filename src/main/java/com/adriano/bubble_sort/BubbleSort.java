package com.adriano.bubble_sort;


import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    public List<Integer> sortList(List<Integer> list) {

        if (list == null)
            return Arrays.asList();

        for (int i = 0; i <= list.size()-1; i++) {
            for (int j = 0; j <= list.size()-1; j++) {

                if (j > i  && list.get(i) > list.get(j)) {
                    Integer menor = list.get(j);
                    Integer maior = list.get(i);

                    list.set(i, menor);
                    list.set(j, maior);
                }
            }
        }
         return list;
    }

}