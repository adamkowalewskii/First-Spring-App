package com.firstSpring.AppSpring.modules;

import com.firstSpring.AppSpring.AppSpringApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleApp implements CommandLineRunner {

    private static Logger LOG = (Logger) LoggerFactory
            .getLogger(AppSpringApplication.class);

    @Autowired
    Printer printer;

    @Override
    public void run(String... args) {
        LOG.info("EXECUTING : command line runner");
        printer.print();
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.next();

        LOG.info(tmp);

    }
}
