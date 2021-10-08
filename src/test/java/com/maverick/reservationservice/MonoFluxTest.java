package com.maverick.reservationservice;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public class MonoFluxTest {

    @Test
    public void testMono(){
        Mono<String> stringMono = Mono.just("MonoData1");
    }
}
