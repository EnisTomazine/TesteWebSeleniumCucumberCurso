package utils;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Logs {
    static String dataHora = new SimpleDateFormat("yyyy-MM-dd HH-mm").format(Calendar.getInstance().getTime());

    // Criar o arquivo de log
    public void iniciarLogCSV(String dataHora) throws IOException {
        String[] cabecalho = {"data e hora", "caso de teste", "mensagem"};
        this.dataHora = dataHora;
        Path path = Paths.get("target/logs/log - " + dataHora + ".csv");
        if(path.toFile().isFile()){
            System.out.println("Arquivo já existe");
        }else{
            Writer escritor = Files.newBufferedWriter(Paths.get("target/logs/log - " + dataHora + ".csv"));
            CSVWriter escritorCSV = new CSVWriter(escritor);

            escritorCSV.writeNext(cabecalho);

            escritorCSV.flush();
            escritor.close();
        }

    }
    // Grava linha no log
    public void registrarCSV(String casoDeTeste, String mensagem) throws IOException {
        String dataHoraLog = new SimpleDateFormat("[yyyy/MM/dd HH:mm:ss.SSS]").format(Calendar.getInstance().getTime());

        String[] linha = new String[]{dataHoraLog,casoDeTeste,mensagem};

        FileWriter escritor = new FileWriter("target/logs/log - " + dataHora  + ".csv",true);

        CSVWriter escritorCSV = new CSVWriter(escritor);

        escritorCSV.writeNext(linha);

        escritorCSV.flush();
        escritor.close();
    }
}
