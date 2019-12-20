package com.cimc.car.domain;

import java.math.BigDecimal;
import lombok.Data;

/**
@author chenz
@create 2019-12-20 14:39
*/
@Data
public class QrtzSimpropTriggers {
    private String schedName;

    private String triggerName;

    private String triggerGroup;

    private String strProp1;

    private String strProp2;

    private String strProp3;

    private Integer intProp1;

    private Integer intProp2;

    private Long longProp1;

    private Long longProp2;

    private BigDecimal decProp1;

    private BigDecimal decProp2;

    private String boolProp1;

    private String boolProp2;
}