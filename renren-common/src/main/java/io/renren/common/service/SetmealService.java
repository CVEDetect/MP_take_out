package io.renren.common.service;

import io.renren.common.dto.SetmealDTO;
import io.renren.common.service.CrudService;

import io.renren.common.entity.SetmealEntity;

import java.util.List;

/**
 * 套餐
 *
 * @author David 321740709@qq.com
 * @since 1.0.0 2022-08-17
 */
public interface SetmealService extends CrudService<SetmealEntity, SetmealDTO> {

    /**
     * 修改套餐回显信息
     * @param id
     * @return
     */
    SetmealDTO getByWithDish(Long id);

    /**
     * 通过分类ID查找套餐信息，回显在前端页面
     * @param setmealDTO
     * @return
     */
    List<SetmealEntity> findSetmealByCategoryId(SetmealDTO setmealDTO);

    /**
     * 修改套餐状态
     * @param ids
     */
    void updateStatus(Long[] ids);

    /**
     * 添加套餐
     * @param dto
     */
    void saveWithDishes(SetmealDTO dto);

    /**
     * 修改套餐
     * @param dto
     */
    void updateWithDishes(SetmealDTO dto);

    /**
     * 删除套餐
     *
     * @param aLong
     */
    @Override
    void delete(Long[] aLong);
}