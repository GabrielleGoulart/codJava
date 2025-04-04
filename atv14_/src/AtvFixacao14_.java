import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class AtvFixacao14_ {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Digite o caminho do arquivo CSV: ");
     String inputFilePath = sc.nextLine();
     Path sourcePath = Paths.get(inputFilePath);
     Path outputDir = sourcePath.getParent().resolve("out");
     Path outputFilePath = outputDir.resolve("summary.csv");

     try {
      if (!Files.exists(outputDir)) Files.createDirectories(outputDir);
            
     try (BufferedReader br = new BufferedReader(new FileReader(sourcePath.toFile()))) {
     String line;
     while ((line = br.readLine()) != null) {
     String[] fields = line.split(",");
     if (fields.length == 3) {
     String name = fields[0].trim();

     try {
     double price = Double.parseDouble(fields[1].trim().replace(',', '.'));
     int qty = Integer.parseInt(fields[2].trim());
     double total = price * qty;

     try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath.toFile(), true))) {
     bw.write(name + "," + String.format("%.2f", total).replace(',', '.'));
     bw.newLine();


     } catch (IOException e) {
     System.err.println("Erro ao escrever: " + e.getMessage());
      }

     } catch (NumberFormatException e) {
     System.err.println("Erro de formato numérico na linha: " + line);
      }

     } else {
     System.err.println("Linha inválida (esperados 3 campos): " + line);
      }
       }
     System.out.println("Arquivo gerado em: " + outputFilePath.toAbsolutePath());

     } catch (FileNotFoundException e) {
      System.err.println("Arquivo não encontrado: " + sourcePath.toAbsolutePath());

     } catch (IOException e) {
     System.err.println("Erro ao ler o arquivo: " + e.getMessage());
       }

     } catch (IOException e) {
     System.err.println("Erro ao criar o diretório: " + e.getMessage());

     sc.close();
      }
        }
         }
