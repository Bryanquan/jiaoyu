package com.serviceImpl;

import com.core.page.Pagination;
import com.dao.FrontControlDao;
import com.domain.FrontControl;
import com.service.FrontControlService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrontControlServiceImpl implements FrontControlService {

    @Autowired
    private FrontControlDao controlDao;


    public FrontControl findOne(Integer id) {
        return controlDao.findOne(id);
    }


    public FrontControl findByPid(Integer pid) {
        return controlDao.findByPid(pid);
    }


    public List<FrontControl> list() {
        return controlDao.list();
    }


    public List<FrontControl> listByPageSize(Integer startNum, Integer pageSize) {
        return controlDao.listByPageSize(startNum, pageSize);
    }


    public Pagination<FrontControl> pagination(Pagination<FrontControl> pagination) {
        Integer amount = controlDao.getFrontControlAmount();
        pagination.setTotalItemsCount(amount);
        List<FrontControl> items = controlDao.paginationEntity(pagination);
        pagination.setItems(items);
        return pagination;
    }


    public void add(FrontControl frontControl) {
        controlDao.add(frontControl);
    }


    public void delete(FrontControl frontControl) {
        controlDao.delete(frontControl);
    }


    public void update(FrontControl frontControl) {
        controlDao.update(frontControl);
    }


    public List<FrontControl> listById() {
        return controlDao.listById();
    }


    public List<FrontControl> listByPid() {
        return controlDao.listByPid();
    }


    public FrontControl findByTitle(String title) {
        return controlDao.findByTitle(title);
    }
}
