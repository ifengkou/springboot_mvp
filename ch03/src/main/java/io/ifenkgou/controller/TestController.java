package io.ifenkgou.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * . <br />
 *
 * @author shenlongguang<https://github.com/ifengkou>
 * @date: 2019/6/4
 */
@RestController
public class TestController {
    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/log")
    public String testLog() {
        logger.debug("=====测试日志 Debug 级别打印====");
        logger.info("======测试日志 Info 级别打印=====");
        logger.error("=====测试日志 Error 级别打印====");
        logger.warn("======测试日志 Warn 级别打印=====");

        // 可以使用占位符打印出一些参数信息
        String str1 = "ifengkou.github.io";
        String str2 = "cnblogs.com/sloong";
        logger.info("======申龙光的个人博客：{}；申龙光的 cnblogs 博客：{}", str1, str2);

        return "success";
    }
}
