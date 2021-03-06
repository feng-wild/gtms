package com.xyafu.gtms.dao;

import com.xyafu.gtms.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CategoryMapper {
    /**
     * 修改类别
     */
    boolean updateCategory(String oldcname,String newcname);
    /**
     * 根据类别内容删除类别
     */
    boolean deleteCategory(String cname);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated
     */
    int insert(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated
     */
    int insertSelective(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated
     */
    Category selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Category record);

    /**
     * 查找所有category
     */
    List selectCategory();
}