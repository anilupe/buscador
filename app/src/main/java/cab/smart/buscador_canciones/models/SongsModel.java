
package cab.smart.buscador_canciones.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class SongsModel {

    private Integer resultCount;
    private List<Result> results = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SongsModel() {
    }

    /**
     * 
     * @param resultCount
     * @param results
     */
    public SongsModel(Integer resultCount, List<Result> results) {
        super();
        this.resultCount = resultCount;
        this.results = results;
    }

    public Integer getResultCount() {
        return resultCount;
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    public SongsModel withResultCount(Integer resultCount) {
        this.resultCount = resultCount;
        return this;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public SongsModel withResults(List<Result> results) {
        this.results = results;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public SongsModel withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
