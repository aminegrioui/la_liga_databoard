package com.springbootproject.laliga.LaLigaProject.controller;

import com.springbootproject.laliga.LaLigaProject.model.Match;
import com.springbootproject.laliga.LaLigaProject.model.Team;
import com.springbootproject.laliga.LaLigaProject.service.ServiceTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {

    @Autowired
    private ServiceTeam serviceTeam;

    @GetMapping("/team/{teamName}")

    public Team findByName(@PathVariable String teamName){
        Team team=serviceTeam.findByTeamName(teamName);

        return  team;

    }

}