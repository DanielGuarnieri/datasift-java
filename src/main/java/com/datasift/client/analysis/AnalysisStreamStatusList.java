package com.datasift.client.analysis;

import com.datasift.client.BaseDataSiftResult;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class AnalysisStreamStatusList extends BaseDataSiftResult {
    @JsonProperty
    protected final List<AnalysisStreamStatus> data = new ArrayList<AnalysisStreamStatus>();
    private final int count;

    public AnalysisStreamStatusList() {
        count = 0;
    }

    @JsonCreator
    public AnalysisStreamStatusList(@JsonProperty("data") List<AnalysisStreamStatus> data, @JsonProperty("count") int count) {
        if (data != null) {
            this.data.addAll(data);
        }
        this.count = count;
    }

    public List<AnalysisStreamStatus> getData() { return this.data; }
}