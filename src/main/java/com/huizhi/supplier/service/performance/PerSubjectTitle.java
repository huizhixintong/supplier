package com.huizhi.supplier.service.performance;

import com.huizhi.supplier.db.model.TPerSubjectTitleInfo;

import java.util.List;

public interface PerSubjectTitle {

    int addSubjectTitle(TPerSubjectTitleInfo info);
    int editSubjectTitle(TPerSubjectTitleInfo info);
    List<TPerSubjectTitleInfo> querySubjectTitle(String code);
    List<TPerSubjectTitleInfo> queryAllSubjectTitle();

}
