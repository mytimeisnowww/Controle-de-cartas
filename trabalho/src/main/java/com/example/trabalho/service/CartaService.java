package com.example.trabalho.service;

import org.springframework.stereotype.Service;
import com.example.trabalho.adapter.CartaExporter;
import com.example.trabalho.model.Carta;
import com.example.trabalho.repository.CartaRepository;
import java.util.List;

@Service
public class CartaService {
    private final CartaRepository cartaRepository;
    private final CartaExporter cartaExporter;

    public CartaService(CartaRepository cartaRepository, CartaExporter cartaExporter) {
        this.cartaRepository = cartaRepository;
        this.cartaExporter = cartaExporter;
    }

    public String gerarCartasAleatoriasEmJson(int quantidade) {
        List<Carta> cartasAleatorias = cartaRepository.gerarCartasAleatorias(quantidade);
        return cartaExporter.exportarCartas(cartasAleatorias);
    }
}
