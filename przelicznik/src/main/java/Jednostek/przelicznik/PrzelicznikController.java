package Jednostek.przelicznik;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrzelicznikController {

    @GetMapping("/ZmienKGnaLB")
    public String ZmienKGnaLB(@RequestParam double KG) {
        double LB = Przelicznik.ZmienKGnaLB(KG);
        return KG + " Kilogramow to " + LB + " Funtow.";
    }

    @GetMapping("/ZmienLBnaKG")
    public String ZmienLBnaKG(@RequestParam double LB) {
        double KG = Przelicznik.ZmienLBnaKG(LB);
        return LB + " Funtow to " + KG + " Kilo.";
    }
}