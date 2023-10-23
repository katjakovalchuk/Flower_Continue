package ua.edu.ucu.apps.lab7.flower;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flowers/")
public class FlowerController {

    @GetMapping("7")
    public List<Flower> getFlowers() {
        return List.of(new Flower(FlowerColor.RED, 13, 0.6));
    }

    // public final FlowerService flowerService;

    // @Autowired
    // public FlowerController(FlowerService flowerService) {
    // this.flowerService = flowerService;
    // }

    // @PostMapping("add")
    // public void addFlower(@RequestBody Flower flower) {
    // flowerService.addFlower(flower);
}
