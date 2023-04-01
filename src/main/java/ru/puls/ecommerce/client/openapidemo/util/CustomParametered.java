package ru.puls.ecommerce.client.openapidemo.util;

import ru.puls.ecommerce.client.openapidemo.model.CustomParameter;

public interface CustomParametered {

    default CustomParameter getCustomParameter() {
        // здесь может быть получение данных из статических методов, например, из классов RequestContextHolder и SecurityContextHolder
        return new CustomParameter(2);
    }
}
