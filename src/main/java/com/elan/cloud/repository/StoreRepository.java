package com.elan.cloud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.elan.cloud.model.Store;

/**
 * Repository of Store
 * @author hiren.patel
 *
 */

@Repository
public interface StoreRepository extends JpaRepository<Store, Long>{
	
	
	//List of all stores
	@Query("SELECT DISTINCT s.storeName FROM Store s")
    public List<Store> findAllStore();
	
	//Store details with the list of toys available in the store
	@Query("SELECT s FROM Store s WHERE LOWER(s.storeName) = LOWER(:storeName)")
    public List<Store> findByStoreName(@Param("storeName") String storeName);
}
