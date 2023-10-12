package nabil.dockerplayground;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ahmed Nabil
 */
public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
