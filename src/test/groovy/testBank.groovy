import com.bank.domain.Bank
import com.bank.GroovaaApplication
import com.bank.domain.repository.BankRepository
import com.bank.service.BankService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationConfiguration
import spock.lang.Specification


@SpringApplicationConfiguration(classes = GroovaaApplication)

class testBank extends Specification {
    @Autowired
    private BankRepository bankRepository;
    @Autowired
    private BankService bankService

    private static final Logger log = LoggerFactory.getLogger(GroovaaApplication.class);


    def "testBankServiceCreate"() {
        bankService.create("db");
        expect:
        bankRepository.exists(1)
        log.info("                                     ")
        log.info("=====================================")
        log.info("Created one bank with the BankService")
        log.info(bankRepository.findByName("db").toString())
        log.info("=====================================")
        log.info("                                     ")


    }

    def "testBankServiceRead"() {
        bankService.read(bankRepository.findByName("db").first().sortCode)
        bankService.read("db")
        expect:
        bankRepository.exists(1)
        log.info("                                     ")
        log.info("=====================================")
        log.info("Read one bank with the BankService")
        log.info(bankRepository.findByName("db").toString())
        log.info("=====================================")
        log.info("                                     ")


    }
}
