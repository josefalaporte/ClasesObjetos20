public class Date {
    private int day;
    private int month;
    private int year;

    public Date(){
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public boolean validateDay(){
        if (month == 2){
            if (esBisiesto()){
                return day >= 1 && day <= 29;
            }else{
                return day >= 1 && day <= 28;
            }
        }else if(month == 4 || month == 6 || month == 9 || month == 11){
            return day >= 1 && day <= 30;
        }else {
            return day >= 1 && day <= 31;
        }
    }
    public boolean validateMonth(){
        return month >= 1 && month <= 12;
    }

    public boolean esBisiesto() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public String printDateDDMMYYYY() {
        return String.format("%02d-%02d-%04d", day, month, year);
    }

    public String printDateText() {
        String[] months = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return day + " de " + months[month - 1] + " de " + year;
    }

    public static void main(String[] args) {
        Date date = new Date(23, 9, 2023);
        System.out.println(date.printDateDDMMYYYY());  // Imprime "23-09-2023"
        System.out.println(date.printDateText());  // Imprime "23 de septiembre de 2023"
    }
}
