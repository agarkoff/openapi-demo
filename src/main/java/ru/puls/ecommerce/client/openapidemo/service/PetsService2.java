package ru.puls.ecommerce.client.openapidemo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.puls.ecommerce.client.openapidemo.controller.Pets2ApiDelegate;
import ru.puls.ecommerce.client.openapidemo.model.Pet;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PetsService2 implements Pets2ApiDelegate {

    private final PetsService petsService;

    @Override
    public ResponseEntity<List<Pet>> listPets(Integer limit, Pageable pageable) {
        return petsService.listPets(limit, pageable);
    }
}
