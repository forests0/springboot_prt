package com.bssm.study.study.domain.portfolio.service;

import com.bssm.study.study.database.entity.Member;
import com.bssm.study.study.database.entity.Portfolio;
import com.bssm.study.study.domain.member.service.MemberService;
import com.bssm.study.study.domain.portfolio.controller.rs.CreatePortfolioRq;
import com.bssm.study.study.domain.portfolio.repository.PortfolioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class PortfolioService {

    private final PortfolioRepository portfolioRepository;
    private final MemberService memberService;

    public void createPortfolio(CreatePortfolioRq rq) {
        Member member = memberService.findById(1l);
        Portfolio portfolio = Portfolio.create(rq.getTitle(), member);
        portfolioRepository.save(portfolio);
    }

}