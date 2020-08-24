package com.huazi.async.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {
    //在一个特定的时间执行这个方法- Timer
    //cron表达式, 秒 分 时 日 月 周
    //0 59 9 * * ?每天9点59执行
    //30 0/5 10，18 * * ? 每天10点和18点，没隔五分钟执行一次
    @Scheduled(cron = "0/2 * * * * ?")
    public void hello(){
        System.out.println("Hello....执行");
    }
}