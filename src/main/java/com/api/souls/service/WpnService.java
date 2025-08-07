package com.api.souls.service;

import com.api.souls.entity.Weapon;
import com.api.souls.repository.WpnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WpnService {
    @Autowired
    private WpnRepository WpnRepo;

    //-------------------------GET-----------------------------
    public List<Weapon> listarAllWeapon() {
        return WpnRepo.findAll();
    }

    public Weapon getWeaponById(Integer id) {
        return WpnRepo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Arma no encontrada"));
    }

    public Weapon getWeaponByName(String name) {
        Weapon weapon = WpnRepo.findByName(name);
        if (weapon == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Arma no encontrada");
        }

        return weapon;

    }

    public List<Weapon> getWeaponByGame(String game) {
        List<Weapon> weapons = WpnRepo.findByGame(game);
        if (weapons == null || weapons.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Arma no encontrada");
        }

        return weapons;
    }

    //----------------------POST-------------------------
    public Weapon addWeapon(Weapon arma) {
        return WpnRepo.save(arma);
    }

    //----------------------DELETE-------------------------
    public void deleteWeaponById(Integer id) {
        if (WpnRepo.existsById(id)) {
            WpnRepo.deleteById(id);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Arma no encontrada");
        }
    }

    public void deleteWeaponByName(String name) {
        Weapon weapon = WpnRepo.findByName(name);

        if (weapon != null) {
            WpnRepo.delete(weapon);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Arma no encontrada");
        }
    }

    //---------------------PUT--------------------
    public Weapon updateWeapon(Integer id, Weapon newWeapon) {

        Weapon existingWeapon = WpnRepo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Arma no encontrada"));
        existingWeapon.setName(newWeapon.getName());
        existingWeapon.setDescription(newWeapon.getDescription());
        existingWeapon.setGame(newWeapon.getGame());
        existingWeapon.setImageURL(newWeapon.getImageURL());
        return WpnRepo.save(existingWeapon);


    }

}
