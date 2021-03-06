package com.example.demo.repository;

import com.example.demo.model.Client;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends PagingAndSortingRepository<Client,String> {

}
