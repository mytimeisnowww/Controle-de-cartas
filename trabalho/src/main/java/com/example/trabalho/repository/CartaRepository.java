package com.example.trabalho.repository;

import org.springframework.stereotype.Repository;
import com.example.trabalho.model.Carta;
import java.util.List;

@Repository
public class CartaRepository {
    public List<Carta> gerarCartasAleatorias(int quantidade) {
        // Retorna cartas simuladas
        return List.of(
            new Carta(1, "José Nogueira Leite", "Fundador do Inatel.", 10),
            new Carta(2, "Joana Silva", "Lendária guerreira.", 20)
        );
    }
}