package com.hackathon.vm.controller;

import com.hackathon.vm.domain.actions.ActionsResult;
import com.hackathon.vm.domain.nodes.NodesResult;
import com.hackathon.vm.service.ReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Michal Dojcar
 */
@Controller
@RequestMapping("/read")
public class ReadingController {

    private ReadingService readingService;

    @Autowired
    public ReadingController(ReadingService readingService) {
        this.readingService = readingService;
    }

    @RequestMapping(value = "actions", method = RequestMethod.GET)
    public @ResponseBody String readActions() {
        ActionsResult actionsResult = readingService.readActions();
        return actionsResult.toString();
    }

    @RequestMapping(value = "nodes", method = RequestMethod.GET)
    public @ResponseBody NodesResult readNodes() {
        return readingService.readNodes();
    }
}