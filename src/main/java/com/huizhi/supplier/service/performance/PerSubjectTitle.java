package com.huizhi.supplier.service.performance;

import com.huizhi.supplier.db.model.TPerSubjectTitleInfo;

public interface PerSubjectTitle {

    int addSubjectTitle(TPerSubjectTitleInfo info);
    int editSubjectTitle(TPerSubjectTitleInfo info);
    int querySubjectTitle(String code);

}
