package Heretak.heretak;

import Heretak.heretak.repository.MemberRepository;
import Heretak.heretak.repository.MemoryMemberRepository;
import Heretak.heretak.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
