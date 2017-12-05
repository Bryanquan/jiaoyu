package com.serviceImpl;

import com.core.page.Pagination;
import com.dao.FrontControlDao;
import com.domain.FrontControl;
import com.service.FrontControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


    public List<FrontControl> findAll() {
        return controlDao.findAll();
    }


    public List<FrontControl> findByPageSize(Integer startNum, Integer pageSize) {
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


    public List<FrontControl> findById() {
        return controlDao.findById();
    }


    public List<FrontControl> findByPid() {
        return controlDao.findByPid();
    }


    public FrontControl findByTitle(String title) {
        return controlDao.findByTitle(title);
    }
}
