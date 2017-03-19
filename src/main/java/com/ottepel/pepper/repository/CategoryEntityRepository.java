package com.ottepel.pepper.repository;

import com.ottepel.pepper.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Alexandr on 19.03.2017.
 */
@Repository
@Transactional
public interface CategoryEntityRepository extends JpaRepository<CategoryEntity, Integer> {

}
