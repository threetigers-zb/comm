package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @author zb
 * @date 2022/2/28 -10:48
 */

@Repository
@Primary
public class AlphaDaoMyBatismpl implements AlphaDao{
    @Override
    public String select() {
        return "MyBatis";
    }
}
