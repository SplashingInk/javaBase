package com.xtl.base;

import java.util.Scanner;

/**
 * @author 31925
 * Java的分支结构
 */
public class BranchStructure {
    public static void main(String[] args) {
        double size=2000*Math.random();
        int target=1024;
        if(size<target){
            System.out.println("斗罗大陆");
        }else {
            System.out.println("斗破苍穹");
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您的得分等级：");
        char grade = scanner.next().charAt(0);
        switch(grade)
        {
            case 'A' :
                System.out.println("优秀");break;
            case 'B' :
            case 'C' :
                System.out.println("良好");break;
            case 'D' :
                System.out.println("及格");break;
            case 'F' :
                System.out.println("你需要继续努力");break;
            default :
                System.out.println("无效等级");break;
        }
        System.out.println("你的等级是 " + grade);
    }
}
