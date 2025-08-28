package com.vas.backend.controller;
import com.vas.backend.model.VASSubscription;
import com.vas.backend.service.VASService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/vas")
@CrossOrigin(origins="http://localhost:3000")
public class VASController {
  private final VASService svc;
  public VASController(VASService svc){ this.svc=svc; }

  @PostMapping("/share")
  public ResponseEntity<VASSubscription> share(@RequestBody VASSubscription v){ return ResponseEntity.ok(svc.save(v)); }

  @GetMapping("/shared/{userId}")
  public ResponseEntity<List<VASSubscription>> shared(@PathVariable Long userId){ return ResponseEntity.ok(svc.getSharedWith(userId)); }
}
