package co.edu.uceva.discretasjni;

import discretasjni.lib.JavaDiscretas;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/conjuntos")
public class DiscretasRestController {
    JavaDiscretas lib = new JavaDiscretas();

    @PostMapping("/union")
    public List<Integer> union(@RequestBody OperacionDTO dto) {
        return Arrays.stream(lib.union(dto.getA(), dto.getB())).boxed().toList();
    }

    @PostMapping("/interseccion")
    public List<Integer> interseccion(@RequestBody OperacionDTO dto) {
        return Arrays.stream(lib.interseccion(dto.getA(), dto.getB())).boxed().toList();
    }

    @PostMapping("/diferencia")
    public List<Integer> diferencia(@RequestBody OperacionDTO dto) {
        return Arrays.stream(lib.diferencia(dto.getA(), dto.getB())).boxed().toList();
    }

    @PostMapping("/diferencia-simetrica")
    public List<Integer> diferenciaSimetrica(@RequestBody OperacionDTO dto) {
        return Arrays.stream(lib.diferenciaSimetrica(dto.getA(), dto.getB())).boxed().toList();
    }

    @PostMapping("/complemento")
    public List<Integer> complemento(@RequestBody OperacionDTO dto) {
        return Arrays.stream(lib.complemento(dto.getA(), dto.getB())).boxed().toList();
    }
}
