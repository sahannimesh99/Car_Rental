package lk.bolton.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Sahan Nimesha on 2022 - Sep
 * In IntelliJ IDEA
 */

@NoArgsConstructor
@Getter
@Setter
@ToString
public class CarDTO {

    private String regNo;
    private String brand;
    private String type;
    private int passengerCount;
    private String color;
    private String transmissionType;
    private String fuelType;
    private double waiverAmount;
    private double dailyRate;
    private double monthlyRate;
    private double extraKmPrice;
    private double dailyFreeKm;
    private double monthlyFreeKm;
    private double drivenKm;
    private String states;

    public CarDTO(String regNo, String brand, String type, int passengerCount, String color, String transmissionType, String fuelType, double waiverAmount, double dailyRate, double monthlyRate, double extraKmPrice, double dailyFreeKm, double monthlyFreeKm, double drivenKm, String states) {
        this.regNo = regNo;
        this.brand = brand;
        this.type = type;
        this.passengerCount = passengerCount;
        this.color = color;
        this.transmissionType = transmissionType;
        this.fuelType = fuelType;
        this.waiverAmount = waiverAmount;
        this.dailyRate = dailyRate;
        this.monthlyRate = monthlyRate;
        this.extraKmPrice = extraKmPrice;
        this.dailyFreeKm = dailyFreeKm;
        this.monthlyFreeKm = monthlyFreeKm;
        this.drivenKm = drivenKm;
        this.states = states;
    }
}
