package com.example.trabalho.adapter;

import java.util.List;
import com.example.trabalho.model.Carta;


public interface CartaExporter {
    String exportarCartas(List<Carta> cartas);
}