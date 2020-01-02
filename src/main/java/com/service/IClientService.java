package com.service;

import com.domain.Client;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface IClientService {

    //查询所有client
    public List<Client> findAll();

    void deleteClient(String clientName);

    void saveClient(Client client);

    List<Client> findClientByName(String clientName);

    int findTotalClient();

    Client findById(Integer clientId);

}
