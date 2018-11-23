package com.cmcm.config;

import io.shardingjdbc.core.api.algorithm.sharding.PreciseShardingValue;
import io.shardingjdbc.core.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

/**
 * @author Spontaneously
 * @time 2018-08-24 下午6:23
 */
public class DemoTableShardingAlgorithm implements PreciseShardingAlgorithm<Long> {
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
        for (Object each : collection) {
            String availableTargetName = (String) each;
            if (availableTargetName.endsWith(Long.parseLong(preciseShardingValue.getValue().toString()) % 2 + "")) {
                return availableTargetName;
            }
        }
        throw new IllegalArgumentException();
    }
}
