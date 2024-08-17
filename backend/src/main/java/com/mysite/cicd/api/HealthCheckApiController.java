package com.mysite.cicd.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.mysite.cicd.api
 * fileName       : HealthCheckApiController
 * author         : Yeong-Huns
 * date           : 2024-08-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-18        Yeong-Huns       최초 생성
 */
@RestController
public class HealthCheckApiController {
    @GetMapping("/health-check")
    public String healthCheck() {
        return "up";
    }
}
