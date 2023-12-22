package com.poja.bigSum.endpoint.rest.controller.health;

import com.poja.bigSum.PojaGenerated;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@PojaGenerated
@RestController
@AllArgsConstructor
public class BigSumController {
    @GetMapping("/big-sum")
    public String calculateBigSum(@RequestParam("a") String a, @RequestParam("b") String b) {
        try {
            BigInteger bigA = new BigInteger(a);
            BigInteger bigB = new BigInteger(b);
            BigInteger sum = bigA.add(bigB);
            return sum.toString();
        } catch (NumberFormatException e) {
            return "The parameters are not valid numbers.";
        }
    }
}
