package com.ottepel.pepper.repository;

import com.ottepel.pepper.entity.StepEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Alexandr on 19.03.2017.
 */
@Repository
@Transactional
public interface StepEntityRepository extends JpaRepository<StepEntity, Integer> {

}
