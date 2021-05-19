package com.example.DemoPractise.controller;

import com.example.DemoPractise.service.VmartService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vmart")
public class VmartController {

    @Autowired
    VmartService vmartService;

    @GetMapping(value = "/create/{collectionname}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createClient(@RequestParam("insertObjCount") int insertObjCount, @PathVariable("collectionname") String collectionname,@RequestBody String request) throws JsonProcessingException {
        return ResponseEntity.ok(vmartService.createClient(collectionname, insertObjCount,request));
    }
}
