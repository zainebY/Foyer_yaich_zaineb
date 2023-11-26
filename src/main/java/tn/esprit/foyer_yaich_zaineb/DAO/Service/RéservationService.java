package tn.esprit.foyer_yaich_zaineb.DAO.Service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_yaich_zaineb.DAO.Repositories.RéservationRepository;
@Service
@AllArgsConstructor
public class RéservationService implements IRéservationService {
    RéservationRepository réservationRepository;
}

