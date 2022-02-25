package com.artgr.telia.algorithm.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class Input {

    private String stringForBalanceCheck;
    private List<Integer> duplicatesCheck;
}
