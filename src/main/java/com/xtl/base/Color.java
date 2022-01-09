package com.xtl.base;

/**
 * @author 31925
 */

public enum Color {
    /**
     * 红色
     */
    RED{
        @Override
        public String getColor(){
            return "红色";
        }
    },
    /**
     * 绿色
     */
    GREEN{
        @Override
        public String getColor(){
            return "绿色";
        }
    },
    /**
     * 蓝色
     */
    BLUE{
        @Override
        public String getColor(){
            return "蓝色";
        }
    };

    /**
     * 获取颜色
     * @return 颜色
     */
    public abstract String getColor();
}
