package nabil.dockerplayground;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ahmed Nabil
 */
@RestController
@RequestMapping("/")
public class Controller {
    private final PlayerRepository playerRepository;

    public Controller(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
    @GetMapping()
    public List<Player> findAllPlayers() {
        return playerRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Void> addNewPlayer(@RequestBody Player player) {
        playerRepository.save(player);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
