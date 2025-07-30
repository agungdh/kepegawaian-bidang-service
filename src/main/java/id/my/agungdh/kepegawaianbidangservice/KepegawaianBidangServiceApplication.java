package id.my.agungdh.kepegawaianbidangservice;

import id.my.agungdh.kepegawaianbidangservice.entity.Bidang;
import id.my.agungdh.kepegawaianbidangservice.repository.BidangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KepegawaianBidangServiceApplication {
    public static void main(String[] args) {
        // Jalankan Spring, dapatkan context
        ConfigurableApplicationContext ctx = SpringApplication.run(KepegawaianBidangServiceApplication.class, args);

        // Ambil bean repository
        BidangRepository repo = ctx.getBean(BidangRepository.class);

        Bidang bidang = new Bidang();
        bidang.setBidang("tehe");

        repo.save(bidang);
    }

}
