package com.example.DemoPractise.repositories;

import com.example.DemoPractise.model.PurchaseOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class VmartRepository {

    @Autowired
    ObjectMapper objectMapper;

    public String insertData(MongoCollection mongoCollection) throws JsonProcessingException {
        PurchaseOrder clientDalmia = new PurchaseOrder();
        String jsonString = objectMapper.writeValueAsString(clientDalmia);
        Document document = Document.parse(jsonString);
        document.put("_id", UUID.randomUUID().toString());
        mongoCollection.insertOne(document);
        return "Successfully";
    }
}
