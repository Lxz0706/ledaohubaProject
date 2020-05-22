package com.ledao.project.system.judicial.service;

import java.util.List;

import com.ledao.project.system.judicial.domain.Judicial;
import com.ledao.project.system.judicial.mapper.JudicialMapper;
import com.ledao.project.system.judicial.service.IJudicialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ledao.common.support.Convert;

/**
 * 司法 服务层实现
 *
 * @author lxz
 * @date 2020-05-21
 */
@Service
public class JudicialServiceImpl implements IJudicialService {
    @Autowired
    private JudicialMapper judicialMapper;

    /**
     * 查询司法信息
     *
     * @param id 司法ID
     * @return 司法信息
     */
    @Override
    public Judicial selectJudicialById(Integer id) {
        return judicialMapper.selectJudicialById(id);
    }

    /**
     * 查询司法列表
     *
     * @param judicial 司法信息
     * @return 司法集合
     */
    @Override
    public List<Judicial> selectJudicialList(Judicial judicial) {
        return judicialMapper.selectJudicialList(judicial);
    }

    /**
     * 新增司法
     *
     * @param judicial 司法信息
     * @return 结果
     */
    @Override
    public int insertJudicial(Judicial judicial) {
        return judicialMapper.insertJudicial(judicial);
    }

    /**
     * 修改司法
     *
     * @param judicial 司法信息
     * @return 结果
     */
    @Override
    public int updateJudicial(Judicial judicial) {
        return judicialMapper.updateJudicial(judicial);
    }

    /**
     * 删除司法对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJudicialByIds(String ids) {
        return judicialMapper.deleteJudicialByIds(Convert.toStrArray(ids));
    }

}
