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
public class DriverDTO {

    private String nic;
    private String fullName;
    private String address;
    private String contact;

    public DriverDTO(String nic, String fullName, String address, String contact) {
        this.nic = nic;
        this.fullName = fullName;
        this.address = address;
        this.contact = contact;
    }
}
