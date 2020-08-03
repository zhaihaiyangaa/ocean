package com.fh.service;

import com.fh.mapper.ClothingMapper;
import com.fh.model.Clothing;
import com.fh.model.Season;
import com.fh.param.PrductSearchParam;
import com.fh.vo.ClothingVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClothingServiceImpl implements ClothingService {
    @Resource
    private ClothingMapper clothingMapper;
    public long selectCount(PrductSearchParam prductSearchParam) {
        return clothingMapper.selectCount(prductSearchParam);
    }

    public List<Clothing> queryClothing(PrductSearchParam prductSearchParam) {
        return clothingMapper.queryClothing(prductSearchParam);
    }

    public void addClothing(Clothing clothing) {
        clothingMapper.addClothing(clothing);
    }

    public void updateClothing(Clothing clothing) {
        clothingMapper.updateClothing(clothing);
    }

    public List<Season> querySeasonCate() {
        return clothingMapper.querySeasonCate();
    }
}
