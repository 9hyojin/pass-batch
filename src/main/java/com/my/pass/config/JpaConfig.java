package com.my.pass.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing  // entity의 생성일시(created_at)와 수정일시(modified_at)를 자동화
@Configuration
public class JpaConfig {

}
