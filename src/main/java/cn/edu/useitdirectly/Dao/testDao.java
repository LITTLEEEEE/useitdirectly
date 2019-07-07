package cn.edu.useitdirectly.Dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface testDao {
    @Select("select count(*) from test")
    int getcount ();
}
