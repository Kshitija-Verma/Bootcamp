package com.HibernatePart2.Part2.Controller;

import com.HibernatePart2.Part2.InheritanceMapping.SingleTable.CardPayST;
import com.HibernatePart2.Part2.InheritanceMapping.SingleTable.CheckPayST;
import com.HibernatePart2.Part2.Repositeries.SingleTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
public class SingleTableController {
    @Autowired
    SingleTableRepository singleTableRepository;

    @PostMapping("/create-check")
    public ResponseEntity<Object> createCheck(@Valid @RequestBody CheckPayST checkPayST){
        CheckPayST checkPayST1 = singleTableRepository.save(checkPayST);
        URI location = ServletUriComponentsBuilder.
                fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(checkPayST1.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
    @PostMapping("/create-credit")
    public ResponseEntity<Object> createCheck(@Valid @RequestBody CardPayST cardPayST){
        CardPayST cardPayST1 = singleTableRepository.save(cardPayST);
        URI location = ServletUriComponentsBuilder.
                fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(cardPayST1.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

}
