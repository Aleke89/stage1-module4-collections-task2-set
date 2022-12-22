package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator{
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        SortedSet<Integer> set = new TreeSet<>();
        for(int i = 0;i< sourceList.size();i++){
            set.add((int)Math.pow(sourceList.get(i),2));
        }
        return set.subSet(lowerBound,upperBound);
    }
}
