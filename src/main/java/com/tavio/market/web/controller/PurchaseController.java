package com.tavio.market.web.controller;

import com.tavio.market.domain.Purchase;
import com.tavio.market.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/all-purchase")
    public List<Purchase> getAll(){
        return purchaseService.getAll();
    }

    @GetMapping("/client-purchase/{id}")
    public Optional<List<Purchase>> getByClient(@PathVariable("id") String clientId){
        return purchaseService.getByClient(clientId);
    }
    @PostMapping("/new-purchase")
    public Purchase save(@RequestBody Purchase purchase){
        return purchaseService.save(purchase);
    }

}
