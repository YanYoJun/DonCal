package com.plbear.doncal.model.normal.data;

public class Data {
    public static final int FLAG_NUM = 1;
    public static final int FLAG_OPERATOR = 2;

    public static final int OPERATOR_C = 1;
    public static final int OPERATOR_DIV = 2;
    public static final int OPERATOR_MUL = 3;
    public static final int OPERATOR_DEL = 4;
    public static final int OPERATOR_PLUS = 5;
    public static final int OPERATOR_PER = 6;
    public static final int OPERATOR_POINT = 7;
    public static final int OPERATOR_DELETE_CHAR = 8;

    private String name;
    private int num;
    private int flag; //1 数字 2 运算符

    private Data() {
    }

    public static Data getData(int flag, int num) {
        Data data = new Data();
        data.flag = flag;
        if (data.flag == FLAG_NUM) {
            data.num = num;
            data.name = num + "";
        } else if (data.flag == FLAG_OPERATOR) {
            data.num = num;
            switch (data.num) {
                case OPERATOR_C:
                    break;
                case OPERATOR_DIV:
                    data.name = "/";
                    break;
                case OPERATOR_MUL:
                    data.name = "*";
                    break;
                case OPERATOR_PER:
                    data.name = "%";
                    break;
                case OPERATOR_PLUS:
                    data.name = "+";
                    break;
                case OPERATOR_DEL:
                    data.name = "-";
                    break;
                default:
                    return null;
            }
        }
        return data;
    }

    public Data addNum(int c) {
        if (flag == FLAG_OPERATOR) {
            return this;
        }
        if (this.num == 0) {
            this.name = c + "";
            this.num = c;
            return this;
        }

        this.num = this.num * 10 + c;
        this.name = this.num + "";
        return this;
    }

    public Data deleteNum(int c) {
        if (flag == FLAG_OPERATOR) {
            return this;
        }
        this.num = this.num / 10;
        this.name = this.num + "";
        return this;
    }

}
