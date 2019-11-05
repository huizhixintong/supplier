package com.huizhi.supplier.service.performance;

import com.huizhi.supplier.db.model.TPerSubjectInfo;

public interface PerSubject {
    int addSubjectInfo(TPerSubjectInfo info);
    int editSubjectInfo(TPerSubjectInfo info);
    TPerSubjectInfo querySubjectInfo(String code);
}
