package com.api.souls.controller;

import com.api.souls.entity.Weapon;
import com.api.souls.service.WpnService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weapons")
public class WeaponController {

    @Autowired
    private WpnService serviceW;

    //----------------GET----------------
    @GetMapping
    public ResponseEntity<List<Weapon>> getAllWeapons(){
        List<Weapon> armas= serviceW.listarAllWeapon();
        if(armas.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return ResponseEntity.ok(armas);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Weapon> getWeaponById(@PathVariable Integer id){
        Weapon arma = serviceW.getWeaponById(id);
        if (arma==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(arma);
    }
    @GetMapping("/name/{name}")
    public ResponseEntity<Weapon> getWeaponById(@PathVariable String name){
        Weapon arma = serviceW.getWeaponByName(name);
        if (arma==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(arma);
    }
    @GetMapping("/game/{game}")
    public ResponseEntity<List<Weapon>> getWeaponsByGame(@PathVariable String game){
        List<Weapon> armas= serviceW.getWeaponByGame(game);
        if(armas.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return ResponseEntity.ok(armas);
    }

    //-----------------POST-------------------
    @PostMapping("/add")
    public ResponseEntity<Weapon> addWeapon(@RequestBody Weapon newWeapon){
        Weapon created = serviceW.addWeapon(newWeapon);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    //----------------DELETE-------------------
    @DeleteMapping("del/id/{id}")
    public ResponseEntity<Void> deleteWeaponById(@PathVariable Integer id){
        serviceW.deleteWeaponById(id);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("del/name/{name}")
    public ResponseEntity<Void> deleteWeaponByName(@PathVariable String name){
        serviceW.deleteWeaponByName(name);
        return ResponseEntity.noContent().build();
    }

    //------------PUT---------------
    @PutMapping("update/{id}")
    public ResponseEntity<Weapon> UpdateWeapon (@PathVariable Integer id, @RequestBody Weapon weapon){
        Weapon updated = serviceW.updateWeapon(id, weapon);
        return ResponseEntity.ok(updated);
    }




}
