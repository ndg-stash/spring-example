package ru.gb.spring.example.service;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;
import ru.gb.spring.example.component.Buyer;

/**
 * Аннотация @Service это синоним @Component. Для контекста обе эти аннотации имеют один и тот же эффект
 */
@Service
public class BuyerFactory {

    /**
     * Аннотация @Lookup говорит Spring, что данный метод должен возвращать экземпляр класса Buyer из контекста,
     * не зависимо от того, что написано в теле метода.
     * Обращаться к этому методу можно только из-вне класса BuyerFactory
     */
    @Lookup
    public Buyer createBuyer() {
        return null;
    }
}
