package cn.edu.useitdirectly.Service.Impl;

import cn.edu.useitdirectly.Dao.testDao;
import cn.edu.useitdirectly.Service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class testServiceImpl implements testService {
    @Autowired
    testDao testDao;


    @Override
    public int getcount() {
        return testDao.getcount();
    }
}
