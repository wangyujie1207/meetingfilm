package com.mooc.meetingfilm.common.backend;

import com.mooc.meetingfilm.utils.common.vo.BaseResponseVO;
import org.junit.Test;

public class UtilsTest {
    @Test
    public void test(){
        BaseResponseVO baseResponseVO = new BaseResponseVO();
        System.out.println(baseResponseVO.run("hi"));
    }
}
