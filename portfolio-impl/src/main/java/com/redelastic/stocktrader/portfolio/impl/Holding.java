package com.redelastic.stocktrader.portfolio.impl;

import lombok.Value;


@Value
class Holding {
    String symbol;

    int shareCount;
}
