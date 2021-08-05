package com.udaan.covid.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;


@Data
public class AssessmentResult implements Serializable {

        @JsonProperty
        int riskPercentage;

}
