package tn.esprit.foyer_yaich_zaineb.DAO.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "reservation")
public class Réservation {
    @Id
    @Column(name = "identifiant")
    private String idReservation;

    @Column(name = "annee Universitaire")
    private LocalDate anneeUniversitaire;

    private boolean estValide;
}
