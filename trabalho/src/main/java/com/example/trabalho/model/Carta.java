package com.example.trabalho.model;

public class Carta {
    private int id;
    private String nome;
    private String narrativa;
    private int poder;
    private int uso;

    // Construtor, getters e setters
    public Carta(int id, String nome, String narrativa, int poder) {
        this.id = id;
        this.nome = nome;
        this.narrativa = narrativa;
        this.poder = poder;
        this.uso = 0; // Inicializa com 0 usos
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getNarrativa() { return narrativa; }
    public int getPoder() { return poder; }
    public int getUso() { return uso; }
    public void incrementarUso() { this.uso++; }
}