package dash;

import java.util.List;

/**
 * Created by Dash on 7/31/2018.
 */
public class SearchRequest {
    public List<String> counterparties;
    public List<String> statuesList;
    public Boolean commitment;

    public List<String> getCounterparties() {
        return counterparties;
    }

    public void setCounterparties(List<String> counterparties) {
        this.counterparties = counterparties;
    }

    public List<String> getStatuesList() {
        return statuesList;
    }

    public void setStatuesList(List<String> statuesList) {
        this.statuesList = statuesList;
    }

    public Boolean getCommitment() {
        return commitment;
    }

    public void setCommitment(Boolean commitment) {
        this.commitment = commitment;
    }
}
