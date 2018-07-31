package dash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
public class RController {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    RestTemplate restTemplate;


    String a = null;
    @GetMapping(value= "/get/backend")
    public String available() {

        List<String> someList = new ArrayList<>();

        List<String> someOtherList = new ArrayList<>();
        someOtherList.add("1");
        someOtherList.add("12");

        SearchRequest searchRequest = new SearchRequest();
        searchRequest.setCommitment(true);
        searchRequest.setCounterparties(someList);
        searchRequest.setStatuesList(someOtherList);

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<SearchRequest> request = new HttpEntity<>(searchRequest);
        ResponseEntity<SearchResponse> response = restTemplate
                .exchange("http://anothserservice/counterparties/response", HttpMethod.POST, request, SearchResponse.class);

//        ResponseEntity response = restTemplate.postForEntity("http://backend-service2/counterparties/response", searchRequest,
//                SearchResponse.class);
        System.out.println("response" + response);
        return "Got Backend Value";
    }
}
