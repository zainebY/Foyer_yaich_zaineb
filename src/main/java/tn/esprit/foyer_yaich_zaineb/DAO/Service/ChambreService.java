package tn.esprit.foyer_yaich_zaineb.DAO.Service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_yaich_zaineb.DAO.Repositories.ChambreRepository;
@Service
@AllArgsConstructor
public class ChambreService implements IChambreService {
    ChambreRepository chambreRepository;
}

