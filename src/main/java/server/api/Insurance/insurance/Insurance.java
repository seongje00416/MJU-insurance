package server.api.insurance.insurance;

import jakarta.persistence.*;
import lombok.*;
import server.api.insurance.contract.Contract;
import server.api.insurance.marketingPlanning.CampaignProgram;
import server.api.insurance.userPersona.UserPersona;
import server.api.insurance.userPersona.UserPersonaDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "insuranceID")
    private int insuranceID;
    private String insuranceName;
    private String planReport;
    private InsuranceState insuranceState;
    private InsuranceType insuranceType;
    private String salesTarget; // 보험 판매 대상
    private String canRegistTarget; // 보험 가입 가능 대상
    private int payment; // 보험료
    private String guarantee; // 보장 내용
    private int estimatedDevelopment; // 개발 예상 비용
    private float estimatedProfitRate; // 예상 손익률
    private int riskDegree; // 위험도
    private LocalDate salesStartDate; // 판매 시작일
    private LocalDate salesEndDate; // 판매 종료일
    private int goalPeopleNumber; // 예상 목표 인원
    private String salesMethod; // 판매 방식

    private float rate; // 보험요율
    private int duration;	// 기간
    private int resultAnalysis;	// 결과 분석
    private int rewardAmount;	// 보상 금액
    private int salesPerformance;	// 판매 실적

    @OneToMany(mappedBy = "insurance") //FK가 없는 쪽에 mappedBy 사용을 추천
    private List<Contract> contracts = new ArrayList<>();
    @OneToMany(mappedBy = "insurance") //FK가 없는 쪽에 mappedBy 사용을 추천
    private List<UserPersona> userPersonas = new ArrayList<>();
    @OneToMany(mappedBy = "insurance") //FK가 없는 쪽에 mappedBy 사용을 추천
    private List<CampaignProgram> campaignPrograms = new ArrayList<>();
}
