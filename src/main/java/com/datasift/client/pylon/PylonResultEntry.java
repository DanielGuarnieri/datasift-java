package com.datasift.client.pylon;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PylonResultEntry {
    @JsonProperty
    protected String key;
    @JsonProperty
    protected int interactions;
    @JsonProperty("unique_authors")
    protected int uniqueAuthors;
    @JsonProperty("child")
    protected PylonResultAnalysis childAnalysisResults;

    public String getKey() { return this.key; }

    public int getInteractions() { return this.interactions; }

    public int getUniqueAuthors() { return this.uniqueAuthors; }

    public PylonResultAnalysis getChildAnalysisResults() { return this.childAnalysisResults; }
}
