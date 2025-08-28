package com.vas.backend.service;
import com.vas.backend.model.ParentalControl;
import com.vas.backend.repository.ParentalControlRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ParentalControlService {
  private final ParentalControlRepository repo;
  public ParentalControlService(ParentalControlRepository repo){ this.repo = repo; }
  public ParentalControl set(ParentalControl p){ return repo.save(p); }
  public List<ParentalControl> findByParent(Long parentId){ return repo.findByParentId(parentId); }
}
