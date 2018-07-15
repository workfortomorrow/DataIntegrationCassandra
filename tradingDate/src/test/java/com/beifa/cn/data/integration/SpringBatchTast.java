package com.beifa.cn.data.integration;

import org.junit.Before;
import org.junit.Test;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试 spring batch框架方式集成交易数据
 * @Author: duhongjiang
 * @Date: Created in 2018/7/11
 */
public class SpringBatchTast {

    ApplicationContext context;

    @Before
    public void setup() throws Exception {
        String[] springConfig = {"applicationContext.xml"};
        context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }

    @Test
    public void functionalTest() throws Exception {
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("integrationTradingDate");

        try {

            JobExecution execution = jobLauncher.run(job, new JobParameters());
            System.out.println("Exit Status : " + execution.getStatus());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
