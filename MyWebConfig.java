package com.example.erp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//설정정보를 등록하고 싶은 경우는 일반클래스를 생성해서 @Configuration라고 정의하면 스프링내부에서 설정파일로 인식
//WebMvcConfigurer는 웹에 관련된 설정을 재정의할 수 있도록 제공되는 웹과 관련된 설정정보가 정의되어 있는 클래스
//해당 클래스가 가지고 있는 메소드를 재정의하며 설정정보를 등록한다
@Configuration
public class MyWebConfig implements WebMvcConfigurer {
    //정적리소스의 경로를 설정

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //특정path로 요청하면 실제 파일이 저장된 위치를 연결해서 리소스를 가져올 수 있도록 처리
        registry.addResourceHandler("/download/**") //   /downlad로 하는 모든 요청에 대해서
                .addResourceLocations("file:///c:/backend23/upload/"); //실제위치
    }
}
