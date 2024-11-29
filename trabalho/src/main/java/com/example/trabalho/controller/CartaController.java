package com.example.trabalho.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.trabalho.service.CartaService;


@RestController
public class CartaController {
    private final CartaService cartaService;

    public CartaController(CartaService cartaService) {
        this.cartaService = cartaService;
    }

    @GetMapping("/cartas/aleatorias")
    public String enviarCartasAleatorias(@RequestParam int quantidade) {
        return cartaService.gerarCartasAleatoriasEmJson(quantidade);
    }
}