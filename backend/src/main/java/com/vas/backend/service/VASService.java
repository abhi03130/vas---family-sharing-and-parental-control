package com.vas.backend.service;
import com.vas.backend.model.VASSubscription;
import com.vas.backend.repository.VASRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VASService {
  private final VASRepository repo;
  public VASService(VASRepository repo){ this.repo = repo; }
  public VASSubscription save(VASSubscription v){ return repo.save(v); }
  public List<VASSubscription> getSharedWith(Long userId){ return repo.findBySharedWithId(userId); }
}
