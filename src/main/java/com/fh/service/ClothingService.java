package com.fh.service;

import com.fh.model.Clothing;
import com.fh.model.Season;
import com.fh.param.PrductSearchParam;
import com.fh.vo.ClothingVo;

import java.util.List;

public interface ClothingService {
    long selectCount(PrductSearchParam prductSearchParam);

    List<Clothing> queryClothing(PrductSearchParam prductSearchParam);

    void addClothing(Clothing clothing);

    void updateClothing(Clothing clothing);

    List<Season> querySeasonCate();
}
