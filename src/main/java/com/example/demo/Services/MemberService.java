package com.example.demo.Services;

import com.example.demo.Repositories.MemberRepository;
import com.example.demo.webdomain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return (List<Member>) memberRepository.findAll();
    }

    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }

    public Long totalMembers() {
        Long totalMembers = memberRepository.count();
        return totalMembers;
    }

    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }

}
