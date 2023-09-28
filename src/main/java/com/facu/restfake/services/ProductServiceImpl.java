package com.facu.restfake.services;


import com.facu.restfake.entities.Product;
import com.facu.restfake.repositories.BaseRepository;
import com.facu.restfake.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl  extends BaseServiceImpl<Product, Long> implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;


    public ProductServiceImpl(BaseRepository<Product, Long> baseRepository, ProductoRepository productoRepository) {
        super(baseRepository);
        this.productoRepository= productoRepository;

            }

}
