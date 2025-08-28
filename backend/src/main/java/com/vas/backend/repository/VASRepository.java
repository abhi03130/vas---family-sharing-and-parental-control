package com.vas.backend.repository;
import com.vas.backend.model.VASSubscription;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface VASRepository extends JpaRepository<VASSubscription,Long> {
    List<VASSubscription> findByOwnerId(Long ownerId);
    List<VASSubscription> findBySharedWithId(Long sharedWithId);
}
