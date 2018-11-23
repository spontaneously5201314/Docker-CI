package com.cmcm.config;

import io.shardingjdbc.core.api.algorithm.sharding.PreciseShardingValue;
import io.shardingjdbc.core.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

/**
 * @author Spontaneously
 * @time 2018-08-24 下午5:54
 */
public class DemoDatabaseShardingAlgorithm implements PreciseShardingAlgorithm {

    @Override
    public String doSharding(Collection availableTargetNames, PreciseShardingValue shardingValue) {
        for (Object each : availableTargetNames) {
            String availableTargetName = (String) each;
            if (availableTargetName.endsWith(Long.parseLong(shardingValue.getValue().toString()) % 2+"")) {
                return availableTargetName;
            }
        }
        throw new IllegalArgumentException();
    }
}
