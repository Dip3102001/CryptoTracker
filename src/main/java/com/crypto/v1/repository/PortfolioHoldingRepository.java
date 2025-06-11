package com.crypto.v1.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.crypto.v1.models.PortfolioHolding;

public interface PortfolioHoldingRepository extends JpaRepository<PortfolioHolding,Long>{
    List<PortfolioHolding> findByPortfolioId(Long portfolioId);
    
    @Query("SELECT PH FROM portfolioholding ph where ph.portfolio.id = :portfolioId AND ph.cryptocurrency.symbol = :symbol")
    Optional<PortfolioHolding> findByPortfolioIdAndCryptocurrencySymbol(Long portfolioId, String symbol);
}