package com.my.pass.config;

import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.support.JobRegistryBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@EnableBatchProcessing  //Spring Batch 기능을 활성화하고 배치 작업을 설정하기 위한 기본 구성 제공. JobRepository, JobLauncher, JobRegistry, PlatformTransactionManager, JobBuilderFactory, StepBuilderFactory 빈으로 제공
@Configuration
public class BatchConfig {

    //JobRegistry -> context에서 Job을 추적할 때 유용. JobRegistryBeanPostProcessor -> Application Context가 올라가면서 bean 등록 시 자동으로 JobRegistry에 Job을 등록.
    @Bean
    public JobRegistryBeanPostProcessor jobRegistryBeanPostProcessor(JobRegistry jobRegistry) {
        JobRegistryBeanPostProcessor jobRegistryBeanPostProcessor = new JobRegistryBeanPostProcessor();
        jobRegistryBeanPostProcessor.setJobRegistry(jobRegistry);
        return jobRegistryBeanPostProcessor;}

}
