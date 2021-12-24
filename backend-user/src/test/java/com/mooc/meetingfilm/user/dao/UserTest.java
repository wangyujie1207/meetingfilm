package com.mooc.meetingfilm.user.dao;

import com.mooc.meetingfilm.user.BackendUserApplicationTests;
import com.mooc.meetingfilm.user.dao.entity.MoocBackendUserT;
import com.mooc.meetingfilm.user.dao.mapper.MoocBackendUserTMapper;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class UserTest extends BackendUserApplicationTests {
    @Resource
    private MoocBackendUserTMapper backendUserTMapper;

    @Test
    public void add(){
        System.out.println(backendUserTMapper);
        MoocBackendUserT userT = new MoocBackendUserT();
        userT.setUserName("admin");
        userT.setUserPwd("123456");
        userT.setUserPhone("1100000000");
        this.backendUserTMapper.insert(userT);
    }

    @Test
    public void select(){
        final List<MoocBackendUserT> moocBackendUserTS = this.backendUserTMapper.selectList(null);
        moocBackendUserTS.forEach(System.out::println);
    }

    @Test
    public void update(){
        MoocBackendUserT moocBackendUserT = new MoocBackendUserT();
        moocBackendUserT.setUuid(2);
        moocBackendUserT.setUserName("admin");
        moocBackendUserT.setUserPwd("adminwang");
        moocBackendUserT.setUserPhone("110");
        this.backendUserTMapper.updateById(moocBackendUserT);

    }

    @Test
    public void del(){}
}
