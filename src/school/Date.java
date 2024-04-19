//Date class=======================


package school;

import java.util.Calendar;

public class Date {
    private int year;
    private int month;
    private int day;
    //default constructor    
    Date() {
        month = 1;
        day = 1;
        year = 2000;
    }
   // passing in a string for the date constructor.    
    Date (String _strDate) {
        setDate(_strDate);
    }
    Date (int _month,int _day,int _year) {
        setDate(_month,_day,_year);
    }
    public void setDate(int _month,int _day,int _year) {
        month = _month;
        day = _day;
        year = _year;        
    }
    
    public void setDate(String _stringDate) {
        String tmpString = _stringDate;
        month = Integer.parseInt((tmpString.substring(0,tmpString.indexOf("/"))));
        tmpString = tmpString.substring(tmpString.indexOf("/")+1);
        day = Integer.parseInt((tmpString.substring(0,tmpString.indexOf("/"))));
        tmpString = tmpString.substring(tmpString.indexOf("/")+1);
        year = Integer.parseInt(tmpString);
        
    }      
    public boolean isOlder(Date _date){
        if (month > _date.month )
              return(false);
        else if (month < _date.month )
              return(true);
            if(year > _date.year)
                  return(false);
            else if(year < _date.year)
                  return(true);
               if (day  > _date.day )
                     return(false);
               else if (day  < _date.day )
                     return(true);
        return(false);
    }
    public int getYear(){
        return (year);
    }
    public int getMonth(){
        return (month);
    }
    public int getDay(){
        return (day);
    }
    public int getYearsOld() {
        int yearsOld;
        Calendar now = Calendar.getInstance();
        int currYear = now.get(Calendar.YEAR);
        int currMonth = now.get(Calendar.MONTH) + 1;
        int currDay = now.get(Calendar.DAY_OF_MONTH);

        yearsOld = currYear - year;
        if (currMonth < month) {
            yearsOld--;
        }
        else if (currMonth == month) {
            if (currDay < day)
                yearsOld--;
        }
        return (yearsOld);        
    }
}

 