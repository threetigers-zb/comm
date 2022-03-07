package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author zb
 * @date 2022/2/28 -10:43
 */

@Repository("alphaHibernate")
public class AlphaDaoHibernatelmpl implements  AlphaDao {

    @Override
    public String select() {
        return "Hibernate";
    }
}
