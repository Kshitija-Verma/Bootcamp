package com.HibernatePart2.Part2.Controller;

import com.HibernatePart2.Part2.InheritanceMapping.JoinedColumn.CardPayJC;
import com.HibernatePart2.Part2.InheritanceMapping.JoinedColumn.CheckPayJC;
import com.HibernatePart2.Part2.InheritanceMapping.TablePerClass.CardPayTC;
import com.HibernatePart2.Part2.InheritanceMapping.TablePerClass.CheckPayTC;
import com.HibernatePart2.Part2.Repositeries.JoinedColumnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
public class JoinedColumnController {
    @Autowired
    JoinedColumnRepository joinedColumnRepository;

    @PostMapping("/join-check")
    public ResponseEntity<Object> createCheckTC(@Valid @RequestBody CheckPayJC checkPayJC){
        CheckPayJC checkPayJC1 = joinedColumnRepository.save(checkPayJC);
        URI location = ServletUriComponentsBuilder.
                fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(checkPayJC1.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
    @PostMapping("/join-card")
    public ResponseEntity<Object> createCheckTC(@Valid @RequestBody CardPayJC cardPayJC){
        CardPayJC cardPayJC1 = joinedColumnRepository.save(cardPayJC);
        URI location = ServletUriComponentsBuilder.
                fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(cardPayJC1.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}
