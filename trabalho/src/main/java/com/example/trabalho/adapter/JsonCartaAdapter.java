package com.example.trabalho.adapter;

import com.example.trabalho.model.Carta;
import com.google.gson.Gson;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class JsonCartaAdapter implements CartaExporter {
    private final Gson gson = new Gson();

    @Override
    public String exportarCartas(List<Carta> cartas) {
        return gson.toJson(cartas);
    }
}