package com.greenfoxacademy.frontend.services;

import com.greenfoxacademy.frontend.models.Log;
import com.greenfoxacademy.frontend.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {

    private LogRepository logRepository;

    @Autowired
    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public void save(Log log) {
        logRepository.save(log);
    }

    public List<Log> listLogs() {
        return (List<Log>) logRepository.findAll();
    }


}
