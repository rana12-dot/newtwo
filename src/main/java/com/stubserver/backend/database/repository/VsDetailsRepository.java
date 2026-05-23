package com.stubserver.backend.database.repository;

import com.stubserver.backend.database.entity.VsDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VsDetailsRepository extends JpaRepository<VsDetails, String> {

    Optional<VsDetails> findByVsname(String vsname);
}
