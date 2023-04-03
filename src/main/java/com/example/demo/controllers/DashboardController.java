package com.example.demo.controllers;

import com.example.demo.Repositories.MemberRepository;
import com.example.demo.Services.MemberService;
import com.example.demo.webdomain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DashboardController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberRepository memberRepository;
    @GetMapping("/home")
    public String adminDashBoard(Model model) {
        Long countMembers = memberService.totalMembers();
        model.addAttribute("countMembers", countMembers);
        return "adminDashboard";
    }

    @GetMapping("/registerMember")
    public String newMember(Model model) {
        Member member = new Member();
        model.addAttribute("member", member);
        return "registerMember";
    }

    @GetMapping("/allMembers")
    public String allMembers(Model model) {
        List<Member> members = memberService.getAllMembers();
        model.addAttribute("members", members);
        return "libraryMembers";
    }

    @PostMapping("/saveMember")
    public String SaveMember(Member member) {
        memberService.saveMember(member);
        return "redirect:/allMembers";
    }

    @GetMapping("/deleteMember/{id}")
    public String deleteMember(@PathVariable(name="id") Long id) {
        memberService.deleteMember(id);
        return "redirect:/allMembers";
    }

    @GetMapping("/editMember/{id}")
    public String editMember(@PathVariable(name="id") Long id, Model model) {
        model.addAttribute("member", memberRepository.findById(id).get());
        return "updateMember";
    }

//    @GetMapping("/registerBook")
//    public String registerBook() {
//        return"registerBook";
//    }
}
