package com.example.DemoPractise.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface VmartService {
    String createClient(String collection, int insertObjCount, String request) throws JsonProcessingException;
}
