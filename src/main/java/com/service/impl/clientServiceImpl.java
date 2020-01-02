package com.service.impl;

import com.dao.IClientDao;
import com.domain.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.service.IClientService;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import java.util.List;


@Service("clientService")
public class clientServiceImpl implements IClientService {

    @Autowired
    private IClientDao iClient;

    public List<Client> findAll() {
        return iClient.findAll();
    }

    @Override
    public void deleteClient(String clientName) {
        iClient.deleteClient(clientName);
    }

    @Override
    public void saveClient(Client client) {
        iClient.saveClient(client);
    }

    @Override
    public List<Client> findClientByName(String clientName) {
        return null;
    }

    @Override
    public int findTotalClient() {
        return 0;
    }

    @Override
    public Client findById(Integer clientId) {
        return null;
    }
}
