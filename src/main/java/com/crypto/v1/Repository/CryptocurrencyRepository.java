package com.crypto.v1.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.crypto.v1.models.Cryptocurrency;

@Repository
public interface CryptocurrencyRepository extends JpaRepository<Cryptocurrency, Long>{
    Optional<Cryptocurrency> findBySymbol(String symbol);

    @Query("SELECT C FROM Cryptocurrencies C ORDER BY C.merketCap DESC")
    List<Cryptocurrency> findAllOrderByMarketCapDesc();

    @Query("SELECT c FROM CryptoCurrencies C WHERE C.marketCap IN :symbols")
    List<Cryptocurrency> findBySymbolIn(List<String> symbols);
}

