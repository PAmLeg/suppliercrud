package com.example.service;

import com.example.model.Supplier;
import java.util.List;

public interface SupplierService {

    List<Supplier> getAllSuppliers();

    Supplier getSupplierById(Long id);

    void saveOrUpdateSupplier(Supplier supplier);

    void deleteSupplier(Long id);

}
