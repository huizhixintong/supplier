package com.huizhi.supplier.service.performance;

import com.huizhi.supplier.db.model.TPerSubjectDetailInfo;

import java.util.List;

public interface PerSubjectTitleDetail {
    int addTitleDetail(TPerSubjectDetailInfo info);
    int editTitleDetail(TPerSubjectDetailInfo info);
    List<TPerSubjectDetailInfo> queryTitleDetail(String code);
}
