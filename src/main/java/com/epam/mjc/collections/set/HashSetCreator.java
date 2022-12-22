package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0;i<sourceList.size();i++){
            if(sourceList.get(i)%2==0){
                hashSet.add(sourceList.get(i));
                int numberEven = sourceList.get(i);
                for(int d = numberEven;d%2==0;d/=2){
                    hashSet.add(d);
                    if(d==2){
                        hashSet.add(1);
                    }
                }
            }else{
                hashSet.add(sourceList.get(i));
                hashSet.add(sourceList.get(i)*2);
            }
        }
        return hashSet;
    }
}
