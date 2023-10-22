package server.api.insurance.contractManagement;

import lombok.*;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContractManagementPolicyDto {
    private int policyID;
    private String content;
    private String name;

    public static ContractManagementPolicyDto of( ContractManagementPolicy contractManagementPolicy ){
        return ContractManagementPolicyDto.builder()
                .policyID( contractManagementPolicy.getPolicyID() )
                .content( contractManagementPolicy.getContent() )
                .name( contractManagementPolicy.getName() )
                .build();
    }
}
