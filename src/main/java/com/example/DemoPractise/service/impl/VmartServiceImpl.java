package com.example.DemoPractise.service.impl;

import com.example.DemoPractise.exception.InvalidRequest;
import com.example.DemoPractise.repositories.VmartRepository;
import com.example.DemoPractise.service.VmartService;
import com.example.DemoPractise.utils.DButilsMapping;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class VmartServiceImpl implements VmartService {

    @Autowired
    VmartRepository vmartRepository;

    @Autowired
    MongoTemplate mongoTemplate;


    @Override
    public String createClient(String collection, int insertObjCount,String request) throws JsonProcessingException {
        Map<String, Object> response = new HashMap<>();
        String collectionName;
        try {
            collectionName = DButilsMapping.VMARTDATABASE.valueOf(collection).getDatabaseCollectionName();
        } catch (Exception e) {
            throw new InvalidRequest("Invalid Database CollectionName Request");
        }
        MongoCollection<Document> mongoCollection=provideMongoColletion(collectionName);

        return vmartRepository.insertData(mongoCollection);
    }

    private MongoCollection<Document> provideMongoColletion(String colletionName) {
        return mongoTemplate.getCollection(colletionName);
    }
}
