package com.service;

import com.core.page.Pagination;
import com.domain.Dict;

import java.util.List;

public interface DictService {
    public Dict getById(Integer dictId);

    public List<Dict> list();

    public Pagination<Dict> pagination(Pagination<Dict> pagination);

    //获取文理科分类
    public List<Dict> getwenli();

    //获取批次分类
    public List<Dict> getpici();

    //获取办学类型分类
    public List<Dict> getsckind();

    //获取院校性质类别分类
    public List<Dict> getsccategory();

    //获取院校性质类别分类
    public List<Dict> getscproperty();

    //获取院校隶属类别分类
    public List<Dict> getscbelong();

    public List<Dict> getSchoolBelongTag();

    public Integer getDictAmount();

    public void add(Dict dict);

    public void update(Dict dict);

    public void delete(Dict dict);

}
