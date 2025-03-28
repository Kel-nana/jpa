package com.example.demo.policies;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "sys_tbl_policies",
        uniqueConstraints = {
                @UniqueConstraint(name = "pol_unique_constrain", columnNames = "pol_id")
        }
)

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Policies {

    @Id
    @SequenceGenerator(
            name = "pol_sequence",
            sequenceName = "pol_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "pol_sequence"
    )

    @Column(name = "pol_id", updatable = false)
    private Long pol_id;
    @Column(name = "pol_auth_date", nullable = false)
    private LocalDateTime pol_auth_date;
    @Column(name = "pol_cover_to", nullable = false)
    private LocalDateTime pol_cover_to;
    @Column(name = "pol_cover_from", nullable = false)
    private LocalDateTime  pol_cover_from;
    @Column(name = "pol_client_id", nullable = false)
    private Long pol_client_id;
    @Column(name = "pol_business_type", nullable = false)
    private String pol_business_type;
    @Column(name = "pol_ref_no", nullable = false)
    private String pol_ref_no;
    private String pol_insurer_no;
    @Column(name = "pol_auth_status", nullable = false)
    private String pol_auth_status;

    public Policies(LocalDateTime pol_auth_date, LocalDateTime pol_cover_to, LocalDateTime pol_cover_from,
                    Long pol_client_id, String pol_business_type, String pol_ref_no,
                    String pol_insurer_no, String pol_auth_status) {
        this.pol_auth_date = pol_auth_date;
        this.pol_cover_to = pol_cover_to;
        this.pol_cover_from = pol_cover_from;
        this.pol_client_id = pol_client_id;
        this.pol_business_type = pol_business_type;
        this.pol_ref_no = pol_ref_no;
        this.pol_insurer_no = pol_insurer_no;
        this.pol_auth_status = pol_auth_status;
    }

}
