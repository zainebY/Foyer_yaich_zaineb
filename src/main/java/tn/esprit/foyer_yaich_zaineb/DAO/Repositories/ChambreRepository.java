package tn.esprit.foyer_yaich_zaineb.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer_yaich_zaineb.DAO.Entities.Bloc;
import tn.esprit.foyer_yaich_zaineb.DAO.Entities.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
