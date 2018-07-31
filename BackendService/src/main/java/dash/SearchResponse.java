package dash;

import java.util.List;

/**
 * Created by Dash on 7/31/2018.
 */
public class SearchResponse {
    private String someValue1;
    private String someValue2;
    private List<SearchModels> models;

    public String getSomeValue1() {
        return someValue1;
    }

    public void setSomeValue1(String someValue1) {
        this.someValue1 = someValue1;
    }

    public String getSomeValue2() {
        return someValue2;
    }

    public void setSomeValue2(String someValue2) {
        this.someValue2 = someValue2;
    }

    public List<SearchModels> getModels() {
        return models;
    }

    public void setModels(List<SearchModels> models) {
        this.models = models;
    }
}
