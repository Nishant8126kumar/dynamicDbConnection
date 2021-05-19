package com.example.DemoPractise.repositories;

import com.example.DemoPractise.model.PurchaseOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class VmartRepository {

    @Autowired
    ObjectMapper objectMapper;

    public String insertData(MongoCollection<Document> mongoCollection, List<Object> payLoad) throws JsonProcessingException {
        List<Document> documentList = new ArrayList<>();
        for (Object object : payLoad) {
            String jsonString = objectMapper.writeValueAsString(object);
            Document doc = Document.parse(jsonString);
            doc.put("_id", UUID.randomUUID().toString());
            documentList.add(doc);
        }
        mongoCollection.insertMany(documentList);
        return "Successfully";
    }
}
