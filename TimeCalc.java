public class TimeCalc {
    public static void main(String[] args) {
        int hour = Integer.parseInt(""+args[0].charAt(0)+args[0].charAt(1));
        int minutes = Integer.parseInt(""+args[0].charAt(3)+args[0].charAt(4));
        int addM = Integer.parseInt(""+args[1]);
        int totalM = hour*60 + minutes + addM;
        int newH = totalM/60%24;
        int newM = totalM % 60;
        String time = "";
        if( newH < 10 ){
            time = "0" + newH;
        }
        else{
            time = "" + newH;
        }
        if( newM < 10 ){
           System.out.println( time + ":0" + newM );
        }
        else{
            System.out.println( time + ":" + newM );
        }



    }


}
