package com.hellospring.study;

import com.hellospring.study.repository.MemberRepository;
import com.hellospring.study.repository.MemoryMemberRepository;
import com.hellospring.study.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
