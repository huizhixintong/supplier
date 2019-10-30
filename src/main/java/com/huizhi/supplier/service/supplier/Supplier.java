package com.huizhi.supplier.service.supplier;

import com.huizhi.supplier.db.model.TCpySupplier;

public interface Supplier {

    int querySupplierByName(String name);

    int querySupplierById(String companyId);
}
