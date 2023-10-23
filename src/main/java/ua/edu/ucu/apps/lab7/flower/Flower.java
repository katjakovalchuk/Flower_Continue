package ua.edu.ucu.apps.lab7.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Flower {
    private FlowerColor color;
    private double price;
    private double sepalLength;

    // private FlowerType flowerType;

    public Flower(Flower flower) {
        this.sepalLength = flower.sepalLength;
        this.price = flower.price;
        this.color = flower.color;

        // this.flowerType = flower.flowerType;
    }

    public String getColor() {
        return this.color.toString();
    }

    public Flower() {
    }
}
