package team.cms.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import team.cms.entity.Account;

@Mapper
@Repository
public interface AccountRepository {

    Account getAccountByName(String name);

}