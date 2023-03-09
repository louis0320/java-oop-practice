package com.java.oop.service;

import com.java.oop.logic.JavaSort;
import com.java.oop.logic.Sort;

import java.util.List;

public class SortService {

    private final Sort<String> sort;

    // 생성자 주입으로 결합도 낮추기
    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체: " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
