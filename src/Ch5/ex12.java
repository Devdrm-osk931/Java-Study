package Ch5;

public class ex12 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"};

        for(int i = 0; i < names.length; i ++) {
            System.out.println("names[" + i + "]: " + names[i]);
        }

        String tmp = names[2];

        System.out.println("tmp: " + tmp);
        names[0] = "Yu";

        for(String str:names){
            System.out.println(str);
        }

        double[] temp = new double[3];
        for(int i = 0; i < temp.length; i ++){
            System.out.println(temp[i]);
        }
    }
}
