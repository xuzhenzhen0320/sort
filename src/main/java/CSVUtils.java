import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CSVUtils {
    public static final int COLUMN_NUM = 4;

    //????csv??????????????
    public static String[][] getCsvDataNew(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
        String line = "";
        ArrayList<String[]> lineList = new ArrayList<String[]>();
        // Read a single line from the file until there are no more lines to read
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line, ","); // ????????
            String[] currCol = new String[COLUMN_NUM]; // Each currCol has 9 fields, so we need room for the 8 tokens.
            for (int i = 0; i < COLUMN_NUM; i++) { // For each token in the line that we've read:
                //?????????????????
                if (st.hasMoreTokens()) {
                    currCol[i] = st.nextToken();
                }

            }
            lineList.add(currCol);
        }

        String[][] str = new String[lineList.size()][9];
        for (int i = 0; i < lineList.size(); i++) {
            for (int j = 0; j < 9; j++) {
                str[i][j] = lineList.get(i)[j];
                //System.out.println(str[i][x]);
            }
        }

        br.close();

        return str;
    }
}
