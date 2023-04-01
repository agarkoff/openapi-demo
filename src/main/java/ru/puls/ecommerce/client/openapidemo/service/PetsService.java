package ru.puls.ecommerce.client.openapidemo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.puls.ecommerce.client.openapidemo.controller.PetsApiDelegate;
import ru.puls.ecommerce.client.openapidemo.model.Pet;
import ru.puls.ecommerce.client.openapidemo.util.CustomParameterSupport;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PetsService implements PetsApiDelegate {

    private final CustomParameterSupport customParameterSupport;

    @Override
    public ResponseEntity<List<Pet>> listPets(Integer limit, Pageable pageable) {
        Pet e1 = new Pet();
        e1.setId(customParameterSupport.getCustomParameter().getA());
        e1.setName2("test");
        return ResponseEntity.ok(List.of(e1));
    }
}
