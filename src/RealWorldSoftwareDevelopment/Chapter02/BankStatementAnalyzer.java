package RealWorldSoftwareDevelopment.Chapter02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;

public class BankStatementAnalyzer {
    private static final String RESOURCES = "src/RealWorldSoftwareDevelopment/resources";
    private static final BankStatementCSVParser bankStatementParser = new BankStatementCSVParser();

    public void analyze(final String fileName, final BankStatementParser bankStatementParser) throws IOException {
        final Path path = Paths.get(RESOURCES + fileName);
        final List<String> lines = Files.readAllLines(path);

        final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFrom(lines);

        final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);

        final List<BankTransaction> transactions
                = bankStatementProcessor.findTransactions(bankTransaction ->
                            bankTransaction.getDate().getMonth() == Month.FEBRUARY
                            && bankTransaction.getAmount() >= 1_000);

        collectSummary(bankStatementProcessor);
    }

    class BankTransactionsIsInFebruaryAndExpecsive implements BankTransactionFilter {

        @Override
        public boolean test(final BankTransaction bankTransaction) {
            return bankTransaction.getDate().getMonth() == Month.FEBRUARY
                    && bankTransaction.getAmount() >= 1_000;
        }
    }

    public static void collectSummary(final BankStatementProcessor bankStatementProcessor) {
        System.out.println("The total for all transactions is " + bankStatementProcessor.calculateTotalAmount());
        System.out.println("The total for all transactions in January is " + bankStatementProcessor.calculateTotalInMonth(Month.JANUARY));
        System.out.println("The total for all transactions is " + bankStatementProcessor.calculateTotalForCategory("Salary"));
    }
}
