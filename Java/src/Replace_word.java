import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
public class Replace_word {
    public static ArrayList<ArrayList<Object>> get_excell(String s) throws IOException {
        ArrayList<Object> arr = new ArrayList<>();
        //ArrayList<Object> hp=new ArrayList<>();
        ArrayList<ArrayList<Object>> arr1 = new ArrayList<>();
        FileInputStream fis = new FileInputStream(s);
//creating workbook instance that refers to .xls file
        XSSFWorkbook wb = new XSSFWorkbook(fis);
//creating a Sheet object to retrieve the object
        XSSFSheet sheet = wb.getSheetAt(0);
//evaluating cell type
        FormulaEvaluator formulaEvaluator = wb.getCreationHelper().createFormulaEvaluator();
        for (Row row : sheet)     //iteration over row using for each loop
        {
            for (Cell cell : row)    //iteration over cell using for each loop
            {
                switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
                    case Cell.CELL_TYPE_NUMERIC:   //field that represents numeric cell type
//getting the value of the cell as a number
                        // System.out.print(cell.getNumericCellValue()+ "\t\t");
                        arr.add(cell.getNumericCellValue());
                        break;
                    case Cell.CELL_TYPE_STRING:    //field that represents string cell type
//getting the value of the cell as a string
                        //System.out.print(cell.getStringCellValue()+ "\t\t");
                        arr.add(cell.getStringCellValue());
                        break;
                }
            }

        }

        for (int i = 1; i <= arr.size() / 3 - 1; i++) {
            ArrayList<Object> hp = new ArrayList<>();
            hp.add(arr.get(i * 3));
            hp.add(arr.get(i * 3 + 1));
            hp.add(arr.get(i * 3 + 2));
            arr1.add(hp);

        }
        return arr1;
    }
    public static void copyContent(File a, File b)
            throws Exception {
        FileInputStream in = new FileInputStream(a);
        BufferedWriter bw =
                new BufferedWriter(new FileWriter(b, true));

        try {

            int n;

            // read() function to read the
            // byte of data
            while ((n = in.read()) != -1) {
                // write() function to write
                // the byte of data
                bw.append((char) n);
            }
        } finally {
            if (in != null) {

                // close() function to close the
                // stream
                in.close();
            }
            // close() function to close
            // the stream
            if (bw != null) {
                bw.close();
            }
        }
        System.out.println("File Copied");
    }
    static void modifyField(String filePath, String oldString, String newString) {
        File fileToBeModified = new File(filePath);
        String oldContent = "";
        BufferedReader reader = null;
        FileWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(fileToBeModified));
            //Reading all the lines of input text file into oldContent
            String line = reader.readLine();
            while (line != null) {
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            //Replacing oldString with newString in the oldContent
            String newContent = oldContent.replaceAll(oldString, newString);
            //Rewriting the input text file with newContent
            writer = new FileWriter(fileToBeModified);
            writer.write(newContent);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Closing the resources
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws Exception {

        for (int i = 800; i <= 1235; i++) {

            copyContent(new File("C:\\demo\\xml1.txt"), new File("C:\\demo\\file3.txt"));
            String s = "C:\\demo\\ecom.xlsx";
            String a= get_excell(s).get(i).get(1).toString();
            // System.out.println(e.get_excell(s).get(1).get(0));
            modifyField("C:\\demo\\file3.txt","WWW.AZPARKING.AZ",a);
            //modifyField("C:\\demo\\file1.txt","<MerchantName>E1020143</MerchantName>",
                   // "<MerchantName>"+a+"</MerchantName>");

            modifyField("C:\\demo\\file3.txt", "E1020143",
                    (String) get_excell(s).get(i).get(0));
            modifyField("C:\\demo\\file3.txt", String.valueOf(7523),
                    get_excell(s).get(i).get(2).toString().substring
                            (0, 4));
        }
        System.out.println("done");
    }
}