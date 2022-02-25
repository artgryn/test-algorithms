package com.artgr.telia.algorithm.service;

import org.springframework.stereotype.Service;

@Service
public class BalancedStringAlgorithmLogicService {

    public boolean isStringBalanced(String value) {

        while (value.contains("()") || value.contains("[]") || value.contains("{}")) {
            value = value.replaceAll("\\(\\)", "")
                    .replaceAll("\\[\\]", "")
                    .replaceAll("\\{\\}", "");
        }
        return (value.length() == 0);
    }
}
