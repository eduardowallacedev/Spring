package br.com.fiap.cervejaria.controller;

import br.com.fiap.cervejaria.dto.CervejaDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import static br.com.fiap.cervejaria.dto.Tipo.PILSEN;

@RestController
public class CervejaController {

    private List<CervejaDTO> cervejaDTOList;

    public CervejaController(){
        cervejaDTOList = new ArrayList<>();

       cervejaDTOList.add(new CervejaDTO(1,"Ambev",4.5,PILSEN,BigDecimal.valueOf(8.50),ZonedDateTime.now().minusYears(3)));
       cervejaDTOList.add(new CervejaDTO(2,"Colorado",6.5,PILSEN,BigDecimal.valueOf(12.9),ZonedDateTime.now().minusYears(3)));

    }

    @GetMapping
    public List<CervejaDTO> getAll() {
        return cervejaDTOList;
    }

}
