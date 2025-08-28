package com.vas.backend.repository;
import com.vas.backend.model.ParentalControl;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ParentalControlRepository extends JpaRepository<ParentalControl,Long> {
    List<ParentalControl> findByParentId(Long parentId);
}
