package com.crypto.v1.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.ColumnTransformer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cryptocurriencies")
public class Cryptocurrency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true, nullable=false)
    private String symbol;

    @Column(precision=20, scale=8)
    private BigDecimal currentPrice;

    @Column(precision=20, scale=8)
    private BigDecimal priceChange24h;

    @Column(precision=20, scale=8)
    private BigDecimal percentChange24h;

    @Column(precision=20, scale = 8)
    private BigDecimal marketCap;

    @Column(precision=20, scale = 8)
    private BigDecimal volume24h;
    
    private LocalDateTime lastUpdated;

    public Cryptocurrency(){}

    public Long getId() {
        return id;
    }

    public String getSymbol() {
        return symbol;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public BigDecimal getPriceChange24h() {
        return priceChange24h;
    }

    public BigDecimal getPercentChange24h() {
        return percentChange24h;
    }

    public BigDecimal getMarketCap() {
        return marketCap;
    }

    public BigDecimal getVolume24h() {
        return volume24h;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setPriceChange24h(BigDecimal priceChange24h) {
        this.priceChange24h = priceChange24h;
    }

    public void setPercentChange24h(BigDecimal percentChange24h) {
        this.percentChange24h = percentChange24h;
    }

    public void setMarketCap(BigDecimal marketCap) {
        this.marketCap = marketCap;
    }

    public void setVolume24h(BigDecimal volume24h) {
        this.volume24h = volume24h;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
