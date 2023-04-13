package com.elan.cloud.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elan.cloud.model.Store;
import com.elan.cloud.repository.StoreRepository;

/**
 * This class is Rest Store Controller.
 * @author hiren.patel
 *
 */

@RestController
@RequestMapping("/v1")
public class StoreController {
	private static final Logger logger = Logger.getLogger(StoreController.class);
	
	@Autowired
	private StoreRepository storeRepository;

	//List of All stores
	@GetMapping("/stores")
	public List<Store> getAllStores() {
		List<Store> storeList = storeRepository.findAllStore();
		logger.info("No of Stores :: "+storeList.size());
		return storeList;
	}

	//Store details with the list of Coffee available in the store
	@GetMapping("/stores/{storeName}")
	public List<Store> getStoreDetailsByStoreName(@PathVariable(value = "storeName") String storeName) {
		List<Store> storeList = storeRepository.findByStoreName(storeName);
		logger.info("No of coffees in "+storeName+" :: "+storeList.size());
		
		return storeList;
	}

}
