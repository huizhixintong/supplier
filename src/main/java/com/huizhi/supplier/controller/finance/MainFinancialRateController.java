package com.huizhi.supplier.controller.finance;

import com.huizhi.supplier.constant.Constants;
import com.huizhi.supplier.db.model.TCpyAssetsLiabilities;
import com.huizhi.supplier.db.model.TCpyCashFlow;
import com.huizhi.supplier.db.model.TCpyMainFinancialRate;
import com.huizhi.supplier.db.model.TCpyProfitLoss;
import com.huizhi.supplier.service.finance.MainFinancialRateService;
import com.huizhi.supplier.service.supplier.company.assetsliabilities.AssetsLiabilitiesService;
import com.huizhi.supplier.service.supplier.company.cashflow.CashFlowService;
import com.huizhi.supplier.service.supplier.company.profitloss.ProfitLossService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Title: MainFinancialRateController
 * @Description:
 * @Auther: gulipeng
 * @Version: 1.0
 * @create 2019/10/25 0025 13:46
 */

@Slf4j
@RestController
@RequestMapping("/finance/mainFinancialRate")
public class MainFinancialRateController {

    @Autowired
    private MainFinancialRateService mainFinancialRateService;

    @Autowired
    private AssetsLiabilitiesService assetsLiabilitiesService;

    @Autowired
    private ProfitLossService profitLossService;

    @Autowired
    private CashFlowService cashFlowService;


//    @RequestMapping(value = "save")
//    public boolean save(TCpyMainFinancialRate mainFinancialRate) {
//
//        String year = mainFinancialRate.getYear();
//        String companyId = mainFinancialRate.getCompanyId();
//        String id = mainFinancialRate.getId();
//        TCpyMainFinancialRate findByYear = mainFinancialRateService.findByCompanyIdAndYear(companyId,year);
//        if(findByYear == null){
//
//            TCpyMainFinancialRate mainFinancialRate2 = FinancialRatios(mainFinancialRate,year,companyId);
//            mainFinancialRate2.setDataResource(Constants.HANDMADE);
//            mainFinancialRateService.save(mainFinancialRate2);
//
//        }
//        return true;
//    }
//
//
//    public TCpyMainFinancialRate FinancialRatios(TCpyMainFinancialRate mainFinancialRate, String year, String companyId){
//        Integer parseInt = Integer.parseInt(year)-1;
//        String year2 = String.valueOf(parseInt);
//        //根据年份和companyId查询三个表
//        //当前选择年份的数据
//        //资产负债表
//        TCpyAssetsLiabilities assetsLiabilities = assetsLiabilitiesService.findByCompanyIdAndYear(companyId,year);
//        if(assetsLiabilities == null){
//            assetsLiabilities = new TCpyAssetsLiabilities();
//        }
//        //利润表
//        TCpyProfitLoss profitLoss = profitLossService.findByCompanyIdAndYear(year, companyId);
//        if(profitLoss == null){
//            profitLoss = new TCpyProfitLoss();
//        }
//        //现金流量表
//        TCpyCashFlow cashFlow = cashFlowService.findByCompanyIdAndYear(companyId,year);
//        if(cashFlow == null){
//            cashFlow = new TCpyCashFlow();
//        }
//
//        //当前选择年份前一年的数据
//        //资产负债表
//        TCpyAssetsLiabilities assetsLiabilities2 = assetsLiabilitiesService.findByCompanyIdAndYear(year2, companyId);
//        if(assetsLiabilities2 == null){
//            assetsLiabilities2 = new TCpyAssetsLiabilities();
//        }
//        //利润表
//        TCpyProfitLoss profitLoss2 = profitLossService.findByCompanyIdAndYear(year2, companyId);
//        if(profitLoss2 == null){
//            profitLoss2 = new TCpyProfitLoss();
//        }
//        //现金流量表
//        TCpyCashFlow cashFlow2 = cashFlowService.findByCompanyIdAndYear(year2, companyId);
//        if(cashFlow2 == null){
//            cashFlow2 = new TCpyCashFlow();
//        }
//
//        //资产负债率（%）=（负债总额/资产总额）x100%
//        Double otherNonCurrentAssetsTotalAssets = assetsLiabilities.getOtherNonCurrentAssetsTotalAssets().doubleValue();
//
//        Double otherNonCurrentLiabilitiesTotalLiabilities = assetsLiabilities.getOtherNonCurrentLiabilitiesTotalLiabilities().doubleValue();
//        if(otherNonCurrentAssetsTotalAssets != null && otherNonCurrentLiabilitiesTotalLiabilities != null){
//            if (otherNonCurrentLiabilitiesTotalLiabilities != 0) {
//                BigDecimal ratioLiabilities = new BigDecimal((otherNonCurrentAssetsTotalAssets/otherNonCurrentLiabilitiesTotalLiabilities)*100);
//                mainFinancialRate.setRatioLiabilities(ratioLiabilities);
//            }else {
//                mainFinancialRate.setRatioLiabilities(new BigDecimal(0.0));
//            }
//        }
//
//        //速动比率（%）=(流动资产-存货-预付账款- 一年内到期的非流动资产-其他流动资产)/流动负债x100%
//        Double currentAssets = assetsLiabilities.getCurrentAssets().doubleValue();
//        Double inventory = assetsLiabilities.getInventory().doubleValue();
//        Double advanceCharge = assetsLiabilities.getAdvanceCharge().doubleValue();
//        Double oneYearAssets = assetsLiabilities.getOneYearAssets().doubleValue();
//        Double otherCurrentAssets = assetsLiabilities.getOtherCurrentAssets().doubleValue();
//        Double currentLiabilities = assetsLiabilities.getCurrentLiabilities().doubleValue();
//        if (currentAssets != null && inventory != null && advanceCharge != null && oneYearAssets != null && otherCurrentAssets != null && currentLiabilities != null) {
//            if(currentLiabilities != 0){
//                BigDecimal quickRatio =  new BigDecimal((currentAssets - inventory - advanceCharge - oneYearAssets - otherCurrentAssets)/currentLiabilities*100);
//                mainFinancialRate.setQuickRatio(quickRatio);
//            }else {
//                mainFinancialRate.setQuickRatio(new BigDecimal(0.0));
//            }
//        }
//
//        //利息保障倍数（倍）=（净利润+利息费用+所得税费用)/利息费用
//        Double netProfit = profitLoss.getNetProfit().doubleValue();
//        Double capitalCharges = profitLoss.getCapitalCharges().doubleValue();
//        Double taxFees = profitLoss.getTaxFees().doubleValue();
//        if (netProfit != null && capitalCharges != null && taxFees != null) {
//            if (capitalCharges != 0) {
//                BigDecimal interestGuaranteeTimes = new BigDecimal((netProfit - capitalCharges - taxFees)/capitalCharges);
//                mainFinancialRate.setInterestGuaranteeTimes(interestGuaranteeTimes);
//            }else {
//                mainFinancialRate.setInterestGuaranteeTimes(new BigDecimal(0.0));
//            }
//        }
//
//        //现金流动负债比（%）= 经营性现金净流入/流动负债平均余额x100%
//        Double operatingCash = cashFlow.getOperatingCash().doubleValue();
//        Double currentLiabilities2 = assetsLiabilities.getCurrentLiabilities().doubleValue();
//        Double currentLiabilities3 = assetsLiabilities2.getCurrentLiabilities().doubleValue();
//        if (operatingCash != null && currentLiabilities2 != null && currentLiabilities3 != null) {
//            if (currentLiabilities2 != currentLiabilities3) {
//                BigDecimal cashFlowDebtRatio = new BigDecimal(operatingCash/(currentLiabilities2 - currentLiabilities3)*100);
//                mainFinancialRate.setCashFlowDebtRatio(cashFlowDebtRatio);
//            }else {
//                mainFinancialRate.setCashFlowDebtRatio(new BigDecimal(0.0));
//            }
//
//        }
//
//        //总资产周转率（%）= 营业收入/[(期初总资产余额+期末总资产余额)/2]
//        Double operatingIncome = profitLoss.getOperatingIncome().doubleValue();
//        Double otherNonCurrentLiabilitiesTotalLiabilities2 = assetsLiabilities2.getOtherNonCurrentLiabilitiesTotalLiabilities().doubleValue();
//        if (operatingIncome != null && otherNonCurrentLiabilitiesTotalLiabilities != null && otherNonCurrentLiabilitiesTotalLiabilities2 != null) {
//            if (otherNonCurrentLiabilitiesTotalLiabilities != 0 || otherNonCurrentLiabilitiesTotalLiabilities2 != 0) {
//                BigDecimal totalTurnoverAssets = new BigDecimal(operatingIncome/((otherNonCurrentLiabilitiesTotalLiabilities + otherNonCurrentLiabilitiesTotalLiabilities2)/2)*100);
//                mainFinancialRate.setTotalTurnoverAssets(totalTurnoverAssets);
//            }else {
//                mainFinancialRate.setTotalTurnoverAssets(new BigDecimal(0.0));
//            }
//        }
//
//        //应收账款周转率（%）=主营业务收入/[(期初应收账款余额+期末应收账款余额)/2＋(期初应收票据余额＋期末应收票据余额)/2]
//        Double receivableNotesAccounts = assetsLiabilities.getReceivableNotesAccounts().doubleValue();
//        Double receivableNotesAccounts2 = assetsLiabilities2.getReceivableNotesAccounts().doubleValue();
//        if (operatingIncome != null && receivableNotesAccounts != null && receivableNotesAccounts2 != null) {
//            if (receivableNotesAccounts != 0 || receivableNotesAccounts2 != 0) {
//                BigDecimal receivableTurnover = new BigDecimal(operatingIncome/((receivableNotesAccounts + receivableNotesAccounts2)/2)*100);
//                mainFinancialRate.setReceivableTurnover(receivableTurnover);
//            }else {
//                mainFinancialRate.setReceivableTurnover(new BigDecimal(0.0));
//            }
//        }
//
//        //存货周转率（次）=主营业务成本/[(期初存货+期末存货)/2]
//        Double operatingCost = profitLoss.getOperatingCost().doubleValue();
//        Double inventory2 = assetsLiabilities2.getInventory().doubleValue();
//        if (operatingCost != null && inventory2 != null && inventory != null) {
//            if (inventory2 != 0 || inventory != 0) {
//                Double inventoryTurnover = operatingCost/((inventory + inventory2)/2)*100;
//                mainFinancialRate.setInventoryTurnover(new BigDecimal(inventoryTurnover));
//            }else {
//                mainFinancialRate.setInventoryTurnover(new BigDecimal(0.0));
//            }
//        }
//
//        //成本费用利润率（%）= 利润总额/（主营业务成本+销售费用+管理费用+财务费用）x100%
//        Double totalProfit = profitLoss.getTotalProfit().doubleValue();
//        Double salesCosts = profitLoss.getSalesCosts().doubleValue();
//        Double managementCosts = profitLoss.getManagementCosts().doubleValue();
//        Double financialCosts = profitLoss.getFinancialCosts().doubleValue();
//        if (totalProfit != null && operatingCost != null && salesCosts != null && managementCosts != null && financialCosts != null) {
//            if (operatingCost != 0 || salesCosts != 0 || managementCosts != 0 || financialCosts != 0) {
//                Double costProfileRatio = totalProfit/(operatingCost + salesCosts + managementCosts + financialCosts)*100;
//                mainFinancialRate.setCostProfileRatio(new BigDecimal(costProfileRatio));
//            }else {
//                mainFinancialRate.setCostProfileRatio(new BigDecimal(0.0));
//            }
//        }
//
//        //净资产收益率（%）=净利润/[(期初净资产余额+期末净资产余额)/2]x100%
//        if (netProfit != null && otherNonCurrentLiabilitiesTotalLiabilities != null && otherNonCurrentLiabilitiesTotalLiabilities2 != null) {
//            if(otherNonCurrentLiabilitiesTotalLiabilities != 0 || otherNonCurrentLiabilitiesTotalLiabilities2 != 0){
//                Double netAssetsProfitRatio = netProfit/((otherNonCurrentLiabilitiesTotalLiabilities + otherNonCurrentLiabilitiesTotalLiabilities2)/2)*100;
//                mainFinancialRate.setNetAssetsProfitRatio(new BigDecimal(netAssetsProfitRatio));
//            }else {
//                mainFinancialRate.setNetAssetsProfitRatio(new BigDecimal(0.0));
//            }
//        }
//
//        //总资产报酬率（%）=(利润总额＋利息支出)/[(期初总资产余额+期末总资产余额)/2]x100%
//        if (totalProfit != null && capitalCharges != null && otherNonCurrentLiabilitiesTotalLiabilities != null && otherNonCurrentLiabilitiesTotalLiabilities2 != null) {
//            if(otherNonCurrentLiabilitiesTotalLiabilities != 0 || otherNonCurrentLiabilitiesTotalLiabilities2 != 0){
//                Double totalAssetReturnRatio = (totalProfit + capitalCharges)/((otherNonCurrentLiabilitiesTotalLiabilities + otherNonCurrentLiabilitiesTotalLiabilities2)/2)*100;
//                mainFinancialRate.setTotalAssetReturnRatio(new BigDecimal(totalAssetReturnRatio));
//            }else {
//                mainFinancialRate.setTotalAssetReturnRatio(new BigDecimal(0.0));
//            }
//        }
//
//
//        //主营业务增长率（%）=(年末营业收入-去年年末营业收入)/去年年末营业收入x100%
//        Double operatingIncome2 = profitLoss2.getOperatingIncome().doubleValue();
//        if(operatingIncome != null && operatingIncome2 != null){
//            if (operatingIncome2 != 0) {
//                Double mainCampBusinessIncreaseRatio = (operatingIncome - operatingIncome2)/operatingIncome2 * 100;
//                mainFinancialRate.setMainCampBusinessIncreaseRatio(new BigDecimal(mainCampBusinessIncreaseRatio));
//            }else {
//                mainFinancialRate.setMainCampBusinessIncreaseRatio(new BigDecimal(0.0));
//            }
//        }
//
//        //营业利润增长率（%）=[(年末营业利润-去年年末营业利润)/去年年末营业利润]x100%
//
//        Double operatingProfit = profitLoss.getOperatingProfit().doubleValue();
//        Double operatingProfit2 = profitLoss2.getOperatingProfit().doubleValue();
//        if (operatingProfit != null && operatingProfit2 != null) {
//            if (operatingProfit2 != 0) {
//                Double operatingProfitIncreaseRatio = (operatingProfit - operatingProfit2)/operatingProfit2 * 100;
//                mainFinancialRate.setOperatingProfitIncreaseRatio(new BigDecimal(operatingProfitIncreaseRatio));
//            }else {
//                mainFinancialRate.setOperatingProfitIncreaseRatio(new BigDecimal(0.0));
//            }
//        }
//
//        //资本保值增值率（%）=期末所有者权益÷期初所有者权益x100%
//        Double ownersEquity = assetsLiabilities.getOwnersEquity().doubleValue();
//        Double ownersEquity2 = assetsLiabilities2.getOwnersEquity().doubleValue();
//        if (ownersEquity != null && ownersEquity2 != null) {
//            if(ownersEquity2 != 0){
//                Double capitalMaintainValueIncreaseRatio = ownersEquity/ownersEquity2 * 100;
//                mainFinancialRate.setCapitalMaintainValueIncreaseRatio(new BigDecimal(capitalMaintainValueIncreaseRatio));
//            }else {
//                mainFinancialRate.setCapitalMaintainValueIncreaseRatio(new BigDecimal(0.0));
//            }
//        }
//
//        //总资产增长率(%) = (年末资产总额-年初资产总额）/年初资产总额x100%
//        if (otherNonCurrentLiabilitiesTotalLiabilities != null && otherNonCurrentLiabilitiesTotalLiabilities2 != null) {
//            if (otherNonCurrentLiabilitiesTotalLiabilities2 != 0) {
//                BigDecimal growthRateOfTotalAssets = new BigDecimal((otherNonCurrentLiabilitiesTotalLiabilities - otherNonCurrentLiabilitiesTotalLiabilities2)/otherNonCurrentLiabilitiesTotalLiabilities2 * 100);
//                mainFinancialRate.setGrowthRateOfTotalAssets(growthRateOfTotalAssets);
//            }else {
//                mainFinancialRate.setGrowthRateOfTotalAssets(new BigDecimal(0.0));
//            }
//        }
//
//        //流动比率 = 流动资产合计/流动负债合计*100%
//        Double otherTotalCurrentAssets = assetsLiabilities.getOtherTotalCurrentAssets().doubleValue();
//        Double totalCurrentLiabilities = assetsLiabilities.getTotalCurrentLiabilities().doubleValue();
//        if (otherTotalCurrentAssets != null && totalCurrentLiabilities != null) {
//            if (totalCurrentLiabilities != 0) {
//                BigDecimal flowRatio = new BigDecimal(otherTotalCurrentAssets/totalCurrentLiabilities * 100);
//                mainFinancialRate.setFlowRatio(flowRatio);
//            }else {
//                mainFinancialRate.setFlowRatio(new BigDecimal(0.0));
//            }
//        }
//
//        //现金流动负债比率 = 年经营现金净流量/年末流动负债*100%
//        Double cashInflows = cashFlow.getCashInflows().doubleValue();
//        if (cashInflows != null && currentLiabilities != null) {
//            if(currentLiabilities != 0){
//                BigDecimal cashFlowLiabilityRatio = new BigDecimal(cashInflows/currentLiabilities * 100);
//                mainFinancialRate.setCashFlowLiabilityRatio(cashFlowLiabilityRatio);
//            }else {
//                mainFinancialRate.setCashFlowLiabilityRatio(new BigDecimal(0.0));
//            }
//        }
//
//        //已获利息保障倍数=(净利润+利息费用+所得税费用)/利息费用
//        if (netProfit != null && capitalCharges != null && taxFees != null) {
//            if (capitalCharges != 0) {
//                BigDecimal obtainInterestGuaranteeTimes = new BigDecimal((netProfit + capitalCharges + taxFees)/capitalCharges * 100);
//                mainFinancialRate.setObtainInterestGuaranteeTimes(obtainInterestGuaranteeTimes);
//            }else {
//                mainFinancialRate.setObtainInterestGuaranteeTimes(new BigDecimal(0.0));
//            }
//        }
//
//        //主营业务利润率 = 营业利润/利润总额  ×100%
//        if (operatingProfit != null && totalProfit != null ){
//            if (totalProfit != 0) {
//                BigDecimal mainCampBusinessProfitRatio = new BigDecimal(operatingProfit/totalProfit * 100);
//                mainFinancialRate.setMainCampBusinessProfitRatio(mainCampBusinessProfitRatio);
//            }else {
//                mainFinancialRate.setMainCampBusinessProfitRatio(new BigDecimal(0.0));
//            }
//        }
//
//        //投资收益率（%）= 投资收益/投资总额
//        BigDecimal investmentReturnRatio = new BigDecimal(0.0);
//        mainFinancialRate.setInvestmentReturnRatio(investmentReturnRatio);
//        //或有负债比率=（或有负债/股东权益总额）×100%
//        BigDecimal haveLiabilityRatio = new BigDecimal(0.0);
//        mainFinancialRate.setHaveLiabilityRatio(haveLiabilityRatio);
//        //带息负债比率=（需要支付利息的负债/负债总额）×100%
//        BigDecimal interestLiabilityRatio = new BigDecimal(0.0);
//        mainFinancialRate.setInterestLiabilityRatio(interestLiabilityRatio);
//
//        return mainFinancialRate;
//    }
//
//    @RequestMapping(value = "get")
//    public TCpyMainFinancialRate getMainFinancialRateByCompanyIdAndYear(String companyId,String year){
//
//        return mainFinancialRateService.findByCompanyIdAndYear(companyId,year);
//    }

}
