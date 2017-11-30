package com.serviceImpl;
import com.core.page.Pagination;
import com.dao.DictDao;
import com.domain.Dict;
import com.service.DictService;
import com.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author bryan quan
 */
@Service
public class DictServiceImpl implements DictService{

    @Autowired
    private DictDao dictDao;

    public Dict findOne(Integer id) {
        return dictDao.findOne(id);
    }


    public List<Dict> list() {
        return dictDao.list();
    }


    public Pagination<Dict> pagination(Pagination<Dict> pagination) {
        Integer DictAmount=dictDao.getDictAmount();
        pagination.setTotalItemsCount(DictAmount);
        List<Dict> items=dictDao.paginationEntity(pagination);
        pagination.setItems(items);
        return pagination;
    }


    public List<Dict> getWenli() {
        return dictDao.getWenli();
    }


    public List<Dict> getPici() {
        return dictDao.getPici();
    }


    public List<Dict> getSckind() {
        return dictDao.getSckind();
    }


    public List<Dict> getSccategory() {
        return dictDao.getSccategory();
    }


    public List<Dict> getScproperty() {
        return dictDao.getScproperty();
    }


    public List<Dict> getScbelong() {
        return dictDao.getScbelong();
    }


    public Integer getDictAmount() {
        return dictDao.getDictAmount();
    }

    /**
     *  check whetherthe primary key and the associated key are null
     */

    public void add(Dict dict) {
           if (CommonUtil.isNull(dict.getDictId()) || CommonUtil.isNull(dict.getDictMapId())) {
               throw new UnsupportedOperationException("cannot assign dictId or dictMapId null");
           }
           dictDao.add(dict);
    }


    public void update(Dict dict) {
          if (CommonUtil.isNull(dict.getDictId())) {
              throw new UnsupportedOperationException("Connot update Dict without dictId");
          }
          dictDao.update(dict);
    }


    public void delete(Dict dict) {
        if (CommonUtil.isNull(dict.getDictId())) {
            throw new UnsupportedOperationException("Connot delete Dict without dictId");
        }
         dictDao.delete(dict);
    }

    public List<Dict> getSchoolBelongTag() {
        return dictDao.getSchoolBelongTag();
    }
}
