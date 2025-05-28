package com.restapiwithspringboot.rest_demo.repository;

import com.restapiwithspringboot.rest_demo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
}
