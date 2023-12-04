package zerobase.tabling.persist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.tabling.persist.entity.StoreEntity;

@Repository
public interface StoreRepository extends JpaRepository<StoreEntity, Long> {
}
