package Shows;

import java.util.GregorianCalendar;


public class Viewing {
    private GregorianCalendar date;
    private Show show;
    
    public Viewing (GregorianCalendar date, Show show){
        this.date=date;
        this.show=show;
    }
    public Viewing (int year, int month, int day, Show show){
        this.date=new GregorianCalendar(year, month, day);
        this.show=show;
    }
    public GregorianCalendar getDate(){
        return date;
  }

    public void setDate(int year, int month, int day) {
        date.set(GregorianCalendar.YEAR,year);
        date.set(GregorianCalendar.MONTH,month);
        date.set(GregorianCalendar.DATE,day);
    }
  
    public Show getShow(){
    return show;
  }
  
   public void setShow(Show show) {
       this.show=show;
    }
   
   
    @Override
  public String toString(){
    return ("\nThe viewing date:" + date.get(GregorianCalendar.DATE) 
                + "/" + date.get(GregorianCalendar.MONTH) + "/" 
                + date.get(GregorianCalendar.YEAR)+ "\nShow: " + this.show);
    
}
   
  void rate(){
      //to be implemented later
  }
}
    

