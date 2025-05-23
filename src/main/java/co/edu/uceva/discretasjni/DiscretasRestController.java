package co.edu.uceva.discretasjni;

import discretasjni.lib.JavaDiscretas;
import org.springframework.web.bind.annotation.*;


import java.util.Map;

@RestController
@RequestMapping("/api/discretas")
public class DiscretasRestController {

    private final JavaDiscretas service = new JavaDiscretas();

    @PostMapping("/union")
    public int[] union(@RequestBody Map<String,int[]> payload) {
        return service.union(payload.get("a"), payload.get("b"));
    }

    @PostMapping("/intersection")
    public int[] intersection(@RequestBody Map<String,int[]> payload) {
        return service.intersection(payload.get("a"), payload.get("b"));
    }

    @PostMapping("/difference")
    public int[] difference(@RequestBody Map<String,int[]> payload) {
        return service.difference(payload.get("a"), payload.get("b"));
    }

    @PostMapping("/symdiff")
    public int[] symmetricDifference(@RequestBody Map<String,int[]> payload) {
        return service.symmetricDifference(payload.get("a"), payload.get("b"));
    }

    @PostMapping("/complement")
    public int[] complement(@RequestBody Map<String,int[]> payload) {
        return service.complement(payload.get("universal"), payload.get("a"));
    }
}
