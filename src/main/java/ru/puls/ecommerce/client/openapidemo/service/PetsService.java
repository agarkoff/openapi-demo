package ru.puls.ecommerce.client.openapidemo.service;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.puls.ecommerce.client.openapidemo.controller.PetsApiDelegate;
import ru.puls.ecommerce.client.openapidemo.model.Pet;

import java.util.List;

@Service
public class PetsService implements PetsApiDelegate {

    @Override
    public ResponseEntity<List<Pet>> listPets(Integer limit, Pageable pageable) {
        Pet e1 = new Pet();
        e1.setName2("test");
        return ResponseEntity.ok(List.of(e1));
    }
}
