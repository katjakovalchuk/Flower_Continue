package ua.edu.ucu.apps.lab7.flower;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowerService {
    private FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
        // return List.of(new Flower(FlowerColor.RED, 45, 0.8));
    }

    public void addFlower(Flower flower) {
        flowerRepository.save(flower);
    }
}
