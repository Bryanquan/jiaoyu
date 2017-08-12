package com.dao;

import com.core.page.Pagination;
import com.domain.Dict;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DictDao {

    public Dict getById(Integer dictId);

    public List<Dict> list();

    public List<Dict> paginationEntity(Pagination<Dict> pagination);

    public List<Dict> getwenli();

    public List<Dict> getpici();

    public List<Dict> getsckind();

    public List<Dict> getsccategory();

    public List<Dict> getscproperty();
    
    public List<Dict> getscbelong();

    public Integer getDictAmount();

    public List<Dict> getSchoolBelongTag();

    public void add(Dict dict);

    public void update(Dict dict);

    public void delete(Dict dict);

}
