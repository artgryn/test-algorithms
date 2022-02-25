package com.artgr.telia.algorithm.controller;

import com.artgr.telia.algorithm.data.Input;
import com.artgr.telia.algorithm.service.ArrayDuplicatesAlgorithmLogicService;
import com.artgr.telia.algorithm.service.BalancedStringAlgorithmLogicService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class IndexController {

    @NonNull
    private ArrayDuplicatesAlgorithmLogicService arrayDuplicatesAlgorithmLogicService;

    @NonNull
    private BalancedStringAlgorithmLogicService balancedStringAlgorithmLogicService;


    @PostMapping("/duplicates")
    public int getFirstDuplicate(@RequestBody final Input input) {

        return arrayDuplicatesAlgorithmLogicService.getFirstDuplicate(input.getDuplicatesCheck());
    }

    @PostMapping("/balanced")
    public boolean isStringBalanced(@RequestBody final Input input) {

        return balancedStringAlgorithmLogicService.isStringBalanced(input.getStringForBalanceCheck());
    }

}
