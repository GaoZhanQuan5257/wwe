package com.muyu.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.muyu.entity.DoubleColorBall;
import com.muyu.service.DoubleColorBallService;
import com.muyu.util.MapSortUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 七小鱼 2020年06月13日14:30
 */
@Controller
@RequestMapping("doubleColorBall")
public class DoubleColorBallController {
    @Autowired
    private DoubleColorBallService doubleColorBallService;

    private static Map<Integer, Integer> redBallGroupBetween0And9 = new ConcurrentHashMap<>();
    private static Map<Integer, Integer> redBallGroupBetween10And19 = new ConcurrentHashMap<>();
    private static Map<Integer, Integer> redBallGroupThan20 = new ConcurrentHashMap<>();
    private static Map<Integer, Integer> blueBallGroup = new ConcurrentHashMap<>();

    @RequestMapping("queryAll")
    public List<DoubleColorBall> queryAll() {
        List<DoubleColorBall> doubleColorBalls = doubleColorBallService.queryAll();

        System.out.println(JSONUtils.toJSONString(doubleColorBalls));
        return doubleColorBalls;
    }

    @RequestMapping("saveOrUpdate")
    public ModelAndView saveOrUpdate(@RequestBody  DoubleColorBall doubleColorBall) {
        doubleColorBallService.saveOrUpdate(doubleColorBall);

        ModelAndView model = new ModelAndView("user");

        return model;
    }

    @RequestMapping("recommend")
    public String recommend() {

        List<DoubleColorBall> doubleColorBalls = doubleColorBallService.queryAll();

        for (DoubleColorBall e : doubleColorBalls) {
            putReadBall(e.getRedBallOne());
            putReadBall(e.getRedBallTow());
            putReadBall(e.getRedBallThree());
            putReadBall(e.getRedBallFour());
            putReadBall(e.getRedBallFive());
            putReadBall(e.getRedBallSix());
            putBlueBall(e.getBlueBall());
        }

        redBallGroupBetween0And9 = MapSortUtil.sortByValueDesc(redBallGroupBetween0And9);
        redBallGroupBetween10And19 = MapSortUtil.sortByValueDesc(redBallGroupBetween10And19);
        redBallGroupThan20 = MapSortUtil.sortByValueDesc(redBallGroupThan20);
        blueBallGroup = MapSortUtil.sortByValueDesc(blueBallGroup);

        List<Integer> readBall0 = MapSortUtil.getKeyOrNull(redBallGroupBetween0And9,1);
        List<Integer> readBall10 = MapSortUtil.getKeyOrNull(redBallGroupBetween10And19,2);
        List<Integer> readBall19 = MapSortUtil.getKeyOrNull(redBallGroupThan20,3);
        List<Integer> blueBall = MapSortUtil.getKeyOrNull(blueBallGroup,1);


        return readBall0.get(0) + "\t" + readBall10.get(0)  + "\t" + readBall10.get(1)  + "\t" + readBall19.get(0)  + "\t" + readBall19.get(1)  + "\t" + readBall19.get(2)  + "\t\n" + blueBall.get(0);
    }

    private void putReadBall(Integer readBall){
        if (readBall < 10) {
            redBallGroupBetween0And9.put(readBall, redBallGroupBetween0And9.get(readBall) == null ? 0 : redBallGroupBetween0And9.get(readBall)+1);
        }
        if (10 <= readBall  && readBall < 20) {
            redBallGroupBetween10And19.put(readBall, redBallGroupBetween10And19.get(readBall) == null ? 0 : redBallGroupBetween10And19.get(readBall )+ 1);
        }
        if (20 <= readBall) {
            redBallGroupThan20.put(readBall, redBallGroupThan20.get(readBall) == null ? 0 : redBallGroupThan20.get(readBall) + 1);
        }
    }
    private void putBlueBall(Integer blueBall){
        if (blueBall < 10) {
            blueBallGroup.put(blueBall, blueBallGroup.get(blueBall) == null ? 0 : blueBallGroup.get(blueBall )+ 1);
        }
    }

}
