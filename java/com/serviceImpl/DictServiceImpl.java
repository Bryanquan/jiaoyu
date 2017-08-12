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

    public Dict getById(Integer dictId) {
        return dictDao.getById(dictId);
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


    public List<Dict> getwenli() {
        return dictDao.getwenli();
    }


    public List<Dict> getpici() {
        return dictDao.getpici();
    }


    public List<Dict> getsckind() {
        return dictDao.getsckind();
    }


    public List<Dict> getsccategory() {
        return dictDao.getsccategory();
    }


    public List<Dict> getscproperty() {
        return dictDao.getscproperty();
    }


    public List<Dict> getscbelong() {
        return dictDao.getscbelong();
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
