package server.api.insurance.business;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SellGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sellGroupID")
    private int sellGroupID;
    private String exResult;
    private String name;
    private String representative;
    private String representativePhoneNumber;

}
