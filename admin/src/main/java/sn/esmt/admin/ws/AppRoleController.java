package sn.esmt.admin.ws;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.admin.dao.AppRoleRepository;
import sn.esmt.admin.entities.AppRoleEntity;

import java.util.List;

@RestController
@RequestMapping(value = "/admin")
@AllArgsConstructor
public class AppRoleController {
    private AppRoleRepository appRoleRepository;
    //Fonction qui insere dans la Base de Donee

    @PostMapping(path = "/save")//POST REQUEST
    public AppRoleEntity save(@RequestBody AppRoleEntity appRoleEntity){
        return appRoleRepository.save(appRoleEntity);
    }

    //Fonction qui retourne la liste des admin
    @GetMapping(path = "/all")
    public List<AppRoleEntity> getAll(){
        return appRoleRepository.findAll();
    }

    //Creation et test des EndPoints
    @GetMapping(path = "/findByName")//GET REQUEST
    public AppRoleEntity findName(@RequestParam String name){
        return appRoleRepository.findByName(name);
    }

    @GetMapping(path = "/findById")//GET REQUEST
    public AppRoleEntity findById(@RequestParam int id){
        return appRoleRepository.findById(id);
    }
}




