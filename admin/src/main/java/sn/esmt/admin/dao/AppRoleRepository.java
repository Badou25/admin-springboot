package sn.esmt.admin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.esmt.admin.entities.AppRoleEntity;

import java.util.List;

public interface AppRoleRepository extends JpaRepository<AppRoleEntity,Integer> {
    AppRoleEntity findById(int id);
    AppRoleEntity findByName(String name);
}
