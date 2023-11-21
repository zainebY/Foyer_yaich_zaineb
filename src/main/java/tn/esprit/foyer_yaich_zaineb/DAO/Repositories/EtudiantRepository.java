package tn.esprit.foyer_yaich_zaineb.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer_yaich_zaineb.DAO.Entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
