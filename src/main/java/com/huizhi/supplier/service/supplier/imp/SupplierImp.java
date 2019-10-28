package com.huizhi.supplier.service.supplier.imp;

import com.huizhi.supplier.service.supplier.Supplier;
import org.springframework.stereotype.Service;

@Service("supplier")
public class SupplierImp implements Supplier {
    @Override
    public int querySupplierByName(String name) {
        return 0;
    }
}
