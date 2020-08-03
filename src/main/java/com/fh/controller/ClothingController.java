package com.fh.controller;

import com.fh.model.Clothing;
import com.fh.model.Season;
import com.fh.model.ServletResponse;
import com.fh.param.PrductSearchParam;
import com.fh.service.ClothingService;
import com.fh.vo.ClothingVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("clothing")
@CrossOrigin
public class ClothingController {
    @Autowired
    private ClothingService clothingService;
    @RequestMapping("queryClothing")
    public ServletResponse queryClothing(PrductSearchParam prductSearchParam){
        long totalCount=clothingService.selectCount(prductSearchParam);
        List<Clothing> list=clothingService.queryClothing(prductSearchParam);
        Map<String,Object> map=new HashMap();
        map.put("totalCount",totalCount);
        map.put("list",list);
        return ServletResponse.success(map);
    }
    @RequestMapping("addClothing")
    public ServletResponse addClothing(Clothing clothing){
        clothingService.addClothing(clothing);
        return  ServletResponse.success(clothing);
    }

    @RequestMapping("updateClothing")
    public ServletResponse updateClothing(Clothing clothing){
        clothingService.updateClothing(clothing);
        return  ServletResponse.success(clothing);
    }
    @RequestMapping("querySeasonCate")
    public ServletResponse querySeasonCate( ){

     List<Season>  list=clothingService.querySeasonCate();
        return  ServletResponse.success(list);
    }
}
