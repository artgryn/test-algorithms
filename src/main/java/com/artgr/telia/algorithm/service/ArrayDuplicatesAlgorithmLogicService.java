package com.artgr.telia.algorithm.service;

import lombok.val;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class ArrayDuplicatesAlgorithmLogicService {

    public int getFirstDuplicate(final List<Integer> values) {

        val collector = new HashSet<Integer>();
        for(int i=0; i<values.size(); i++){

            if(!collector.add(values.get(i))) {
                return values.get(i);
            }
        }
        return -1;
    }
}
