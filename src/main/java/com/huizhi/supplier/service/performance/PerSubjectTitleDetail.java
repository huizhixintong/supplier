package com.huizhi.supplier.service.performance;

import com.huizhi.supplier.db.model.TPerSubjectDetailInfo;

public interface PerSubjectTitleDetail {
    int addTitleDetail(TPerSubjectDetailInfo info);
    int editTitleDetail(TPerSubjectDetailInfo info);
    int queryTitleDetail(String code);
}
