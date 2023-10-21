package com.smit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smit.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
