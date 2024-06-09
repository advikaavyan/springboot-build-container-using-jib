package com.example;

import com.advikaavyan.examples.testcontainers.Emp;
import com.advikaavyan.examples.testcontainers.LoggerEnum;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;

import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.util.Date;
import java.util.List;

@Testcontainers
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
class EmpControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;


/*

    @Test
    void save1Record() throws Exception {
        List<Emp> emps = getEmps();
        log.info(" {}  Before Save {}  ", LoggerEnum.LOG_PREFIX.getText(), (emps == null ? 0 : emps.size()));
        for (int i = 0; i < 10; i++) {
            Assertions.assertThat(this.restTemplate.postForObject("http://localhost:" + port + "/emps", Emp.builder().name("TEXT_NAME" + new Date()).build(),
                    Emp.class));
        }

        emps = getEmps();
        log.info(" {}  After Save {}  ", LoggerEnum.LOG_PREFIX.getText(), (emps == null ? 0 : emps.size()));
    }
*/


    private List<Emp> getEmps() throws Exception {

        List<Emp> emps = this.restTemplate.getForObject("http://localhost:" + port + "/emps",
                List.class);

        return emps;
    }


}
