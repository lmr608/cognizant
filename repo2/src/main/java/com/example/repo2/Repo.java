package com.example.repo2;

import java.io.Serializable;

import org.springframework.data.repository.Repository;

public interface Repo<T, ID extends Serializable>
extends Repository<T, ID> {
}
