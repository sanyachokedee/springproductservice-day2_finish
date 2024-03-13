package com.csthai.productservice.respository

import com.csthai.productservice.models.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Int> {}