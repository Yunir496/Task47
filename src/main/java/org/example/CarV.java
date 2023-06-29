package org.example;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CarV {
    private String brand;
    private String color;
    @Override
    public String toString() {
        return "CarV [brand=" + brand + ", color=" + color + "]";
    }
}
