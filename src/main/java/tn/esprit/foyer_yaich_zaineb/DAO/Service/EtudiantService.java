package tn.esprit.foyer_yaich_zaineb.DAO.Service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_yaich_zaineb.DAO.Repositories.EtudiantRepository;
@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService {
    EtudiantRepository etudiantRepository;
}

