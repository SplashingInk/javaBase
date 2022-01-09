package com.xtl.base;

/**
 * @author 31925
 * Java数组
 */
public class JavaArray {
    public static void main(String[] args) {
        int[] bite=new int[]{12,23,520,53};
        System.out.println("使用加强for循环遍历");
        for(int i:bite){
            System.out.println(i);
        }

        String[] animations=new String[5];
        animations[0]="凡人修仙传";
        animations[1]="灵笼";
        animations[2]="斗破苍穹";
        animations[3]="斗罗大陆";
        animations[4]="一人之下";
        System.out.println("使用普通for循环遍历");
        for(int i=0;i<animations.length;i++){
            System.out.println(animations[i]);
        }

        char[] factors=new char[]{'a','b','c','d','d'};
        char[] newFactors=new char[factors.length];
        System.arraycopy(factors, 0, newFactors, 0, factors.length);
        printArray(newFactors);

        float[] boys=new float[]{20.2f,30.6f,23.5f,65.4f};
        System.out.println("反转前的数组结果为：");
        for(float ele:boys){
            System.out.print(ele+"\t");
        }
        System.out.println();
        float[] result=reverse(boys);
        System.out.println("反转后的数组结果是：");
        for(float ele:result){
            System.out.print(ele+"\t");
        }
        System.out.println();

        String[][] matrix=new String[2][];
        matrix[0]=new String[2];
        matrix[1]=new String[3];
        matrix[0][0]="斗破苍穹";
        matrix[0][1]="斗罗大陆";
        matrix[1][0]="灵笼";
        matrix[1][1]="狐妖小红娘";
        matrix[1][2]="妖精种植手册";
        printMatrix(matrix);

    }

    /**
    * Java数组作为函数的参数
    */
    private static void printArray(char[] chars){
        for(char ch:chars){
            System.out.println(ch);
        }
    }

    /**
     *Java数组作为函数的返回值
     */
    private static float[] reverse(float[] girls){
        float[] result=new float[girls.length];
        for(int i=0,j=girls.length-1;i<girls.length;i++,j--){
            result[i]=girls[j];
        }
        return result;
    }

    /**
     * 打印二维数组
     */
    private static void printMatrix(String[][] matrix){
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + "\t");
            }
            System.out.println();
        }
    }

}
