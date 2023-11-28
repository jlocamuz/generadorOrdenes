package com.mycompany.myapp.domain;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class OrdenTestSamples {

    private static final Random random = new Random();
    private static final AtomicLong longCount = new AtomicLong(random.nextInt() + (2 * Integer.MAX_VALUE));
    private static final AtomicInteger intCount = new AtomicInteger(random.nextInt() + (2 * Short.MAX_VALUE));

    public static Orden getOrdenSample1() {
        return new Orden()
            .id(1L)
            .cliente(1L)
            .accionId(1L)
            .accion("accion1")
            .operacion("operacion1")
            .cantidad(1)
            .modo("modo1")
            .operacionObservaciones("operacionObservaciones1");
    }

    public static Orden getOrdenSample2() {
        return new Orden()
            .id(2L)
            .cliente(2L)
            .accionId(2L)
            .accion("accion2")
            .operacion("operacion2")
            .cantidad(2)
            .modo("modo2")
            .operacionObservaciones("operacionObservaciones2");
    }

    public static Orden getOrdenRandomSampleGenerator() {
        return new Orden()
            .id(longCount.incrementAndGet())
            .cliente(longCount.incrementAndGet())
            .accionId(longCount.incrementAndGet())
            .accion(UUID.randomUUID().toString())
            .operacion(UUID.randomUUID().toString())
            .cantidad(intCount.incrementAndGet())
            .modo(UUID.randomUUID().toString())
            .operacionObservaciones(UUID.randomUUID().toString());
    }
}