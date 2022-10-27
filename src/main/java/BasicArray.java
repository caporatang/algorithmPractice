import java.util.*;

public class BasicArray {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1.get(0));

        list1.set(0, 5);
        System.out.println(list1.get(0));
        System.out.println(list1.size());

        Integer[][] dataList = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("2차원배열" + dataList[0][1]);

        Integer[][][] data3Array = {
                {
                    {1, 2, 3},
                    {4, 5, 6}
                },
                {
                    {7,8,9},
                    {10,11,12}
                }
        };
        System.out.println("3차원배열" + data3Array[0][1][1]);
        System.out.println("3차원배열" + data3Array[1][1][2]);

        System.out.println("3차원배열" + data3Array[1][0][1]);
        System.out.println("3차원배열" + data3Array[1][1][0]);
        System.out.println("3차원배열" + data3Array[0][0][1]);


        String dataset[] = {
                "Braund, Mr. Owen Harris",
                "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
                "Heikkinen, Miss. Laina",
                "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
                "Allen, Mr. William Henry",
                "Moran, Mr. James",
                "McCarthy, Mr. Timothy J",
                "Palsson, Master. Gosta Leonard",
                "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
                "Nasser, Mrs. Nicholas (Adele Achem)",
                "Sandstrom, Miss. Marguerite Rut",
                "Bonnell, Miss. Elizabeth",
                "Saundercock, Mr. William Henry",
                "Andersson, Mr. Anders Johan",
                "Vestrom, Miss. Hulda Amanda Adolfina",
                "Hewlett, Mrs. (Mary D Kingcome) ",
                "Rice, Master. Eugene",
                "Williams, Mr. Charles Eugene",
                "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
                "Masselmani, Mrs. Fatima",
                "Fynney, Mr. Joseph J",
                "Beesley, Mr. Lawrence",
                "McGowan, Miss. Anna",
                "Sloper, Mr. William Thompson",
                "Palsson, Miss. Torborg Danira",
                "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
                "Emir, Mr. Farred Chehab",
                "Fortune, Mr. Charles Alexander",
                "Dwyer, Miss. Ellen",
                "Todoroff, Mr. Lalio"
        };
        Integer count = 0;
        for(Integer item=0; item < dataset.length; item++) {
          if(dataset[item].indexOf("M") >= 0) {
              count++;
          }
        }
        System.out.println(count);
    }
}