package tn.esprit.foyer_yaich_zaineb.DAO.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_yaich_zaineb.DAO.Repositories.BlocRepository;
@Service //Définir que c'est un bean Spring:ya3mel les instances wahdou
//pour injecter un bean dans un autre bean
//->constructeur
//->Setter
//@->@Autowirred
// ->@Project
@AllArgsConstructor //Pour injecter un bean spring dans un autre bean
public class BlocService implements IBlocService{
    BlocRepository blocRepository;
}
