package com.huizhi.supplier.service.performance;

import com.huizhi.supplier.db.model.TPerSubjectDetailInfo;
import com.huizhi.supplier.db.model.TPerSubjectInfo;
import com.huizhi.supplier.db.model.TPerSubjectTitleInfo;

import java.util.List;

public interface Subject {

    int addSubject(TPerSubjectInfo info);
    int editSubject(TPerSubjectInfo info);
    List<TPerSubjectInfo> querySubject(String code);

    int addTitle(TPerSubjectTitleInfo info);
    int editTitle(TPerSubjectTitleInfo info);
    List<TPerSubjectTitleInfo> queryTitle(String code);

    int addContent(TPerSubjectDetailInfo info);
    int editContent(TPerSubjectDetailInfo info);
    List<TPerSubjectDetailInfo> queryDetail(String titleCode);
}
