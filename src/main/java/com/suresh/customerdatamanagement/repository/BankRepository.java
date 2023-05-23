package com.suresh.customerdatamanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suresh.customerdatamanagement.entity.BankAccountEntity;

public interface BankRepository extends JpaRepository<BankAccountEntity, Integer>{

}
