package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Car {
    private String brand;
    private String color;
    @Override
    public String toString() {
        return "Car [brand=" + brand + ", color=" + color + "]";
    }
}
