package com.service;

import com.core.page.Pagination;
import com.domain.Dict;

import java.util.List;

public interface DictService {
    public Dict findOne(Integer id);

    public List<Dict> findAll();

    public Pagination<Dict> pagination(Pagination<Dict> pagination);

    //获取文理科分类
    public List<Dict> getWenli();

    //获取批次分类
    public List<Dict> getPici();

    //获取办学类型分类
    public List<Dict> getSckind();

    //获取院校性质类别分类
    public List<Dict> getSccategory();

    //获取院校性质类别分类
    public List<Dict> getScproperty();

    //获取院校隶属类别分类
    public List<Dict> getScbelong();

    public List<Dict> getSchoolBelongTag();

    public Integer getDictAmount();

    public void add(Dict dict);

    public void update(Dict dict);

    public void delete(Dict dict);

}
