package com.dao;

import com.core.page.Pagination;
import com.domain.Dict;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DictDao {

    public Dict findOne(Integer id);

    public List<Dict> findAll();

    public List<Dict> paginationEntity(Pagination<Dict> pagination);

    public List<Dict> getWenli();

    public List<Dict> getPici();

    public List<Dict> getSckind();

    public List<Dict> getSccategory();

    public List<Dict> getScproperty();
    
    public List<Dict> getScbelong();

    public Integer getDictAmount();

    public List<Dict> getSchoolBelongTag();

    public void add(Dict dict);

    public void update(Dict dict);

    public void delete(Dict dict);

}
