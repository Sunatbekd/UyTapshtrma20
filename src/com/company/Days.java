package com.company;

public enum Days {
    DYISHONBY("Бугун жава сабагы болот"),
    SHEISHENBI("Бугун англис тил сабагы болот"),
    SHARSHENBI("Бугун жава сабагы болот"),
    BEISHENBI("Бугун англис тил сабагы болот"),
    JUMA("Бугун жава сабагы болот"),
    ISHENBI("Бугун выходной!!!"),
    JEKSHENBI("Бугун дааагы выходной!!!");

    public String name;

    Days(String name) {
        this.name = name;
    }

    public static void chooseDay(String day) {
            switch (day) {
                case "дуйшонбу":
                    System.out.println(DYISHONBY);
                    break;
                case "шейшенби":
                    System.out.println(SHEISHENBI);
                    break;
                case "шаршенби":
                    System.out.println(SHARSHENBI);
                    break;
                case "бейшенби":
                    System.out.println(BEISHENBI);
                    break;
                case "жума":
                    System.out.println(JUMA);
                    break;
                case "ишенби":
                    System.out.println(ISHENBI);
                    break;
                case "жекшенби":
                    System.out.println(JEKSHENBI);
                    break;
                default:
                    System.out.println("Кундордун атын туура жаз!!!");
            }
    }
    @Override
    public String toString() {
        return super.toString() + " " +name;
    }
}
