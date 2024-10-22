import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cartas")
public class CartaController {

    @Autowired
    private CartaService cartaService;

    // Listar todas as cartas
    @GetMapping
    public List<Carta> listarCartas() {
        return cartaService.listarCartas();
    }

    // Buscar carta por ID
    @GetMapping("/{id}")
    public ResponseEntity<Carta> buscarCartaPorId(@PathVariable String id) {
        Optional<Carta> carta = cartaService.buscarCartaPorId(id);
        if (carta.isPresent()) {
            return ResponseEntity.ok(carta.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Adicionar nova carta
    @PostMapping
    public Carta adicionarCarta(@RequestBody Carta carta) {
        return cartaService.salvarCarta(carta);
    }

    // Atualizar carta existente
    @PutMapping("/{id}")
    public ResponseEntity<Carta> atualizarCarta(@PathVariable String id, @RequestBody Carta cartaAtualizada) {
        Optional<Carta> carta = cartaService.buscarCartaPorId(id);
        if (carta.isPresent()) {
            cartaAtualizada.setId(id); // Mantém o ID da carta original
            Carta cartaSalva = cartaService.salvarCarta(cartaAtualizada);
            return ResponseEntity.ok(cartaSalva);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Deletar carta
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCarta(@PathVariable String id) {
        if (cartaService.buscarCartaPorId(id).isPresent()) {
            cartaService.deletarCarta(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
