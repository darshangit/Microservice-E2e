package dash;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
public class RController {

    String a = null;
    @RequestMapping(value= "/get/backend")
    public String available() {

        a.equals("s");

        return "Got Backend Value";
    }

    @PostMapping(value = "/counterparties/response")
    public SearchResponse getResponse(@RequestBody SearchRequest searchRequest){

        System.out.println("SearchRequest"+ searchRequest);
        SearchResponse searchResponse = new SearchResponse();
        List<SearchModels> searchModelsList = new ArrayList<>();

        for(int i = 0;i< 3; i++){
            SearchModels model = new SearchModels();
            model.setName("asd");
            model.setAge(i);
            searchModelsList.add(model);
        }

        searchResponse.setModels(searchModelsList);
        searchResponse.setSomeValue1("TEst");
        searchResponse.setSomeValue2("SomeOther Val");

        return searchResponse;
    }
}
