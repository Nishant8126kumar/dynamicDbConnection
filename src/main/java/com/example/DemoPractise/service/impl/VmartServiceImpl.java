package com.example.DemoPractise.service.impl;

import com.example.DemoPractise.exception.InvalidRequest;
import com.example.DemoPractise.model.PurchaseOrder;
import com.example.DemoPractise.model.Vehicle;
import com.example.DemoPractise.repositories.VmartRepository;
import com.example.DemoPractise.service.VmartService;
import com.example.DemoPractise.utils.DButilsMapping;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.*;

@Service
public class VmartServiceImpl implements VmartService {

    @Autowired
    VmartRepository vmartRepository;

    @Autowired
    MongoTemplate mongoTemplate;
    @Autowired
    ObjectMapper objectMapper;


    @Override
    public String createClient(String collection, int insertObjCount, String request) throws JsonProcessingException {
        Map<String, Object> response = new HashMap<>();
        String collectionName;
        try {
            collectionName = DButilsMapping.VMARTDATABASE.valueOf(collection).getDatabaseCollectionName();
        } catch (Exception e) {
            throw new InvalidRequest("Invalid Database CollectionName not found");
        }
        MongoCollection<Document> mongoCollection = provideMongoCollection(collectionName);
        List mapDataList = mapTo(collectionName, insertObjCount, request);
        return vmartRepository.insertData(mongoCollection,mapDataList);
    }

    private MongoCollection<Document> provideMongoCollection(String collectionName) {
        return mongoTemplate.getCollection(collectionName);
    }

    private List<Object> mapTo(String mapType, int objectCount, String payLoad) throws JsonProcessingException {
        List<Object> dataList = new ArrayList<>();
        if (mapType.equalsIgnoreCase("vehicle-manager")) {
            for (int i = 0; i < objectCount; i++) {
                Vehicle vehicle = objectMapper.readValue(payLoad, Vehicle.class);
                dataList.add(vehicle);
            }
        }
        if (mapType.equalsIgnoreCase("purchase-order")) {
            for (int i = 0; i < objectCount; i++) {
                PurchaseOrder purchaseOrder = objectMapper.readValue(payLoad, PurchaseOrder.class);
                dataList.add(purchaseOrder);
            }
        }
        return dataList;
    }
}
