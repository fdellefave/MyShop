package it.corsospring.web.controller;

import it.corsospring.web.dao.ClienteDAO;
import it.corsospring.web.dao.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteDAO clienteService;


    @GetMapping("/count")
    public void count(){
        System.out.println(clienteService.count());
    }

    @GetMapping("/add")
    public void add() {
        clienteService.add(new Cliente(0, "Federico",
                "Delle Fave", "DLLFRC97D22H501",
                "federico.delle.fave1997@gmail.com", "3927365188",
                "FedericoBeans", "a51f+5sadf"));
    }

    @GetMapping("/update")
    public void update() {
        clienteService.update(new Cliente(2, "Manuel", "Burani",
                "MNTLASKMDP2M4", "m.burani@gmail.com",
                "216534864", "pikappa97", "56+1+65+6"));
    }

    @GetMapping("/delete")
    public void delete() {
        clienteService.delete(3);
    }
}
