package com.example.swconsumer;

import com.example.swconsumer.DTO.StarshipDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("starship")
public class StarshipSWAPI {

    @GetMapping("{id}")
    public StarshipDTO getStarshipSWAPI(@PathVariable("id") int id){
        RestTemplate restTemplate = new RestTemplate();

        String url = "https://swapi.dev/api/starships/"+id;

        ResponseEntity<StarshipDTO> response = restTemplate.getForEntity(url, StarshipDTO.class);

        return response.getBody();
    }
}
