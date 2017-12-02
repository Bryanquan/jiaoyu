package com.dao;

import com.core.page.Pagination;
import com.domain.DictMap;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DictMapDao {

    public DictMap findOne(Integer dictMapId);

    public List<DictMap> list();

    public List<DictMap> paginationEntity(Pagination<DictMap> pagination);

    public void add(DictMap dictMap);

    public void delete(DictMap dictMap);

    public void update(DictMap dictMap);

}
