package fr.adservio.testhello.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("welcome")
public class Welcome
{
    @GetMapping("/{name}")
    public String hello(@PathVariable(name = "name") String name)
    {
        return "Hello " + name;
    }
}
