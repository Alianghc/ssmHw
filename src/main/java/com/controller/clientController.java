package com.controller;

import com.domain.Client;
import com.service.IClientService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/client",produces = {"application/json;charset=UTF-8"})
public class clientController {

    @Autowired
    private IClientService iClientService;

    @RequestMapping("/findAll")
    public String findAll(){
        HttpSession session   =   ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        //调用service方法
        System.out.println("test clientFindall");
        List<Client> clients = iClientService.findAll();
        session.setAttribute("allClients",clients);
        return null;
    }

    @RequestMapping(value="/delete",method = RequestMethod.POST)
    @ResponseBody
    public void delete(@RequestBody String s) throws IOException {
       iClientService.deleteClient(s);
    }

    @RequestMapping(value="/save",method = RequestMethod.POST)
    @ResponseBody
    public void save(@RequestBody String s) throws IOException {
       String [] clients = s.split("\"");
        Client client = new Client();
        client.setName(clients[3]);
        client.setBirth(clients[19]);
        client.setEmail(clients[11]);
        client.setPhone(clients[15]);
        client.setSex(clients[7]);
        iClientService.saveClient(client);
    }





//@Param
}
