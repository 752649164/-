package itheima.service;

import com.github.pagehelper.Page;
import com.itheima.entity.QueryPageBean;
import com.itheima.pojo.Setmeal;

import java.util.List;
import java.util.Map;

public interface SetmealService {
    void add(Setmeal setmeal, Integer[] checkgroupIds);

    Page<Setmeal> findPage(QueryPageBean queryPageBean);

    List<Setmeal> findAll();

    Setmeal findById(Integer id);

    List<Map<String, Object>> findSetmealCount();
}
