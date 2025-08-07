package com.api.souls.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Weapon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String game;
    @NotNull
    private String description;
    private String imageURL;

    public Weapon() {
    }

    public Weapon( String name, String game, String description, String imgRute) {
        this.name = name;
        this.game = game;
        this.description = description;
        this.imageURL = imgRute;
    }

    public Weapon(int id, String name, String game, String description,String imgRute) {
        this.id = id;
        this.name = name;
        this.game = game;
        this.description = description;
        this.imageURL = imgRute;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public @NotNull String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    public @NotNull String getGame() {
        return game;
    }

    public void setGame(@NotNull String game) {
        this.game = game;
    }

    public @NotNull String getDescription() {
        return description;
    }

    public void setDescription(@NotNull String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
