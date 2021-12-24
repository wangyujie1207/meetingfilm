package com.mooc.meetingfilm.backendcommon.backend;

import com.mooc.meetingfilm.backendutils.common.vo.BaseResponseVO;
import org.junit.Test;

public class UtilsTest {
    @Test
    public void test(){
        BaseResponseVO baseResponseVO = new BaseResponseVO();
        System.out.println(baseResponseVO.run("hi"));
    }
}
