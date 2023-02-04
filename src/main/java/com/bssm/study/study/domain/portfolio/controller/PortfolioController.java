package com.bssm.study.study.domain.portfolio.controller;

import com.bssm.study.study.domain.path.ApiPath;
import com.bssm.study.study.domain.portfolio.controller.rs.CreatePortfolioRq;
import com.bssm.study.study.domain.portfolio.service.PortfolioService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PortfolioController {

    private final PortfolioService portfolioService;

    @PostMapping(ApiPath.PORTFOLIO)
    public void createPortfolio(@Validated @RequestBody CreatePortfolioRq rq){
        portfolioService.createPortfolio(rq);
    }

}