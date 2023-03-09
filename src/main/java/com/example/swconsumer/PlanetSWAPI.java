package com.example.swconsumer;

import com.example.swconsumer.DTO.PlanetDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("planet")
public class PlanetSWAPI {
    @GetMapping("{id}")
    public PlanetDTO getPlanetSWAPI(@PathVariable("id") int id){
        RestTemplate restTemplate = new RestTemplate();

        String url = "https://swapi.dev/api/planets/"+id;

        ResponseEntity<PlanetDTO> response = restTemplate.getForEntity(url, PlanetDTO.class);

        return response.getBody();
    }
}
