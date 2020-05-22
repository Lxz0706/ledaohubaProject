package com.ledao.project.system.judicial.mapper;


import com.ledao.project.system.judicial.domain.Judicial;

import java.util.List;

/**
 * 司法 数据层
 *
 * @author lxz
 * @date 2020-05-21
 */
public interface JudicialMapper {
    /**
     * 查询司法信息
     *
     * @param id 司法ID
     * @return 司法信息
     */
    public Judicial selectJudicialById(Integer id);

    /**
     * 查询司法列表
     *
     * @param judicial 司法信息
     * @return 司法集合
     */
    public List<Judicial> selectJudicialList(Judicial judicial);

    /**
     * 新增司法
     *
     * @param judicial 司法信息
     * @return 结果
     */
    public int insertJudicial(Judicial judicial);

    /**
     * 修改司法
     *
     * @param judicial 司法信息
     * @return 结果
     */
    public int updateJudicial(Judicial judicial);

    /**
     * 删除司法
     *
     * @param id 司法ID
     * @return 结果
     */
    public int deleteJudicialById(Integer id);

    /**
     * 批量删除司法
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJudicialByIds(String[] ids);

}