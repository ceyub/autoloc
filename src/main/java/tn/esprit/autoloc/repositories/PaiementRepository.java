package tn.esprit.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.entities.Equipement;

public interface PaiementRepository extends JpaRepository<Equipement, Long> {
}
