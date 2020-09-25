package com.kodilla.stream.sand;

import java.math.BigDecimal;

public final class Europe implements SandStorage {
    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuatity = new BigDecimal("12345678901234567890L");
        return sandQuatity;
    }
}