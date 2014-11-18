package tp07.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tp07.core.entity.SlideEntity;

public interface SlideDAO extends JpaRepository<SlideEntity, Long> {

}
