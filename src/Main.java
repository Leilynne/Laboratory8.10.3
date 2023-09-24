import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(new InputStreamReader(
                    new FileInputStream("D:\\MyFile1.txt")));
            out = new PrintWriter("D:\\MyFile2.txt");
            String s = null;
            int numberLine = 0;
            while ((s = br.readLine()) != null) {
                out.print(++numberLine + ":" );
                String[] words = s.split(" ");
                int countWords = 0;
                for (String word : words) {
                    if (word.matches("^[ЦцКкНнГгШшЩщЗзХхФфВвПпРрЛлДдЖжЧчСсМмТтБб].*")) {
                        out.print(" " + word);
                        countWords++;
                    }
                }
                out.print(", " + countWords + '\n');
            }
        }
        catch (IOException e) {
            System.out.println("Ошибка"); }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}


