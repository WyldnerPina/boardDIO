package com.wild.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

import com.wild.dto.CardDetailsDTO;
import com.wild.persistence.dao.CardDAO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CardQueryService {

    private final Connection connection;

    public Optional<CardDetailsDTO> findById(final Long id) throws SQLException {
        var dao = new CardDAO(connection);
        return dao.findById(id);
    }

}
