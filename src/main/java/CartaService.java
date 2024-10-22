import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CartaService {

    @Autowired
    private CartaRepository cartaRepository;

    public Limport org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CartaService {

    @Autowired
    private CartaRepository cartaRepository;

    public List<Carta> listarCartas() {
        return cartaRepository.findAll();
    }

    public Optional<Carta> buscarCartaPorId(String id) {
        return cartaRepository.findById(id);
    }

    public Carta salvarCarta(Carta carta) {
        return cartaRepository.save(carta);
    }

    public void deletarCarta(String id) {
        cartaRepository.deleteById(id);
    }
}