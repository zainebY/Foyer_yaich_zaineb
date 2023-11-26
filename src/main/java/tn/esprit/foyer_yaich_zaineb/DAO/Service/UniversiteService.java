package tn.esprit.foyer_yaich_zaineb.DAO.Service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_yaich_zaineb.DAO.Repositories.UniversiteRepository;
@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService {
    UniversiteRepository universiteRepository;
}

