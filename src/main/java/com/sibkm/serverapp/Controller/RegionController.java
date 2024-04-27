package com.sibkm.serverapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sibkm.serverapp.Entity.Region;
import com.sibkm.serverapp.Service.ServiceImpl.RegionService;

@RestController
@RequestMapping("/region")
public class RegionController {
    @Autowired
    private RegionService regionService;

    // @GetMapping("/id")
    // public List<Region> Halo() {
    //     return regionService.getAll();
    // }

}
