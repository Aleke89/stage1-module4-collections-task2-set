package com.epam.mjc.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        List<String> setFirst = new ArrayList<String>(firstSet);
        List<String> setSecond = new ArrayList<String>(secondSet);
        List<String> setThird = new ArrayList<String>(thirdSet);
        Set<String> finalSet = new HashSet<>();
        for(int i = 0;i<firstSet.size();i++){
            if((setSecond.contains(setFirst.get(i)))&&!setThird.contains(setFirst.get(i))){
                finalSet.add(setFirst.get(i));
            }
        }
        if(finalSet.size()==0){
            for(int i = 0;i<thirdSet.size();i++){
                if((!setFirst.contains(setThird.get(i)))&& !setSecond.contains(setThird.get(i))){
                    finalSet.add(setThird.get(i));
                }
            }
        }else{
            for(int i = 0;i<thirdSet.size();i++){
                if((!setFirst.contains(setThird.get(i)))&& !setSecond.contains(setThird.get(i))){
                    finalSet.add(setThird.get(i));
                }
            }
        }
        return finalSet;
    }
}
