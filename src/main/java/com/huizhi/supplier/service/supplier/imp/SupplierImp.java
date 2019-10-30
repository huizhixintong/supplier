package com.huizhi.supplier.service.supplier.imp;

import com.huizhi.supplier.db.dao.TCpySupplierMapper;
import com.huizhi.supplier.db.model.TCpySupplier;
import com.huizhi.supplier.service.supplier.Supplier;
import org.springframework.stereotype.Service;

@Service("supplier")
public class SupplierImp implements Supplier {

    private TCpySupplierMapper tCpySupplierMapper;

    @Override
    public int querySupplierByName(String name) {
        return 0;
    }

    @Override
    public int querySupplierById(String companyId) {
        return 0;
    }
}
