package study.design.pattern.service.impl;

import study.design.pattern.service.ToyService;

public class ToyServiceImpl implements ToyService {
    @Override
    public void toPlay(String toy) {
        System.out.println("Playing with " + toy);
    }
}
