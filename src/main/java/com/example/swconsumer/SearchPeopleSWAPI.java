package com.example.swconsumer;

import com.example.swconsumer.DTO.PeopleDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("people")
public class SearchPeopleSWAPI {

    @GetMapping("{id}")
    public PeopleDTO searchPeopleSW(@PathVariable("id") int id){
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://swapi.dev/api/people/"+id;

        ResponseEntity<PeopleDTO> resp = restTemplate.getForEntity(url, PeopleDTO.class);
        return resp.getBody();
    }
}
