package cn.com.scitc.webapp3.dao;

import cn.com.scitc.webapp3.model.Login;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao extends CrudRepository<Login, Integer> {
}
