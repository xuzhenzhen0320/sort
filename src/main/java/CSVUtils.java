import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CSVUtils {
    public static final int COLUMN_NUM = 4;
    //??CSV??????????
    public static String[][] getCsvData(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
        String line = "";
        ArrayList<String[]> lineList = new ArrayList<String[]>();
        // Read a single line from the file until there are no more lines to read
        while((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line, ","); // ????????
            String[] currCol = new String[COLUMN_NUM];
            for(int i = 1; i < COLUMN_NUM; i++) {
                //?????????????????
                if(st.hasMoreTokens()){
                    currCol[i]  = st.nextToken();
                }

            }
            lineList.add(currCol);
        }

        String[][] str = new String[lineList.size()][4];
        for(int i = 0; i < lineList.size(); i++) {
            for(int j = 0; j < 4; j++) {
                str[i][j] = lineList.get(i)[j];
                //System.out.println(str[i][x]);
            }
        }

        br.close();

        return str;
    }
}
