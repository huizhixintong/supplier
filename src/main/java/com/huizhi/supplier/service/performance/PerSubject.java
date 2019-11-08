package com.huizhi.supplier.service.performance;

import com.huizhi.supplier.db.model.TPerSubjectInfo;

import java.util.List;

public interface PerSubject {
    int addSubjectInfo(TPerSubjectInfo info);
    int editSubjectInfo(TPerSubjectInfo info);
    List<TPerSubjectInfo> querySubjectInfo(String code);
}
