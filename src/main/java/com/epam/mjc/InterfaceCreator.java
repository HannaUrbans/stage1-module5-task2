package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {

        return sourceList -> {
            List resultList = new ArrayList<>();
            for (Integer elem:sourceList)
            {Integer resultElem=elem/divider;
            resultList.add(resultElem);
        }
        return resultList;
    };
}
}