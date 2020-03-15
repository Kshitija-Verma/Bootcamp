package com.HibernatePart2.Part2.Controller;


import com.HibernatePart2.Part2.InheritanceMapping.TablePerClass.CardPayTC;
import com.HibernatePart2.Part2.InheritanceMapping.TablePerClass.CheckPayTC;
import com.HibernatePart2.Part2.Repositeries.TablePerClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
@RestController
public class TablePerClassController {
    @Autowired
    TablePerClassRepository tablePerClassRepository;

    @PostMapping("/pertable-check")
    public ResponseEntity<Object> createCheckTC(@Valid @RequestBody CheckPayTC checkPayTC){
        CheckPayTC checkPayTC1 = tablePerClassRepository.save(checkPayTC);
        URI location = ServletUriComponentsBuilder.
                fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(checkPayTC1.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
    @PostMapping("/pertable-card")
    public ResponseEntity<Object> createCheckTC(@Valid @RequestBody CardPayTC cardPayTC){
        CardPayTC cardPayTC1 = tablePerClassRepository.save(cardPayTC);
        URI location = ServletUriComponentsBuilder.
                fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(cardPayTC1.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}
