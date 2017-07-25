import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

class Amino{
String value,temp,val=""; //val has some empty value from previous time
int inx,iny;
Amino(){

 }
 public void get_value(){
	  String b[][]=new String[][]
    {{"0K" ,  "0N"  ,  "1N" ,  "1K"  },
     {"0I" ,  "1I" ,   "2I" ,  "0M" },
     {"0T" ,   "1T",  "2T"  ,  "3T" },
     {"0R"  ,   "0S",   "1S" ,   "1R"},
     {"0Z"  ,   "0Y",   "1Y",    "1Z"},
     {"0L" ,    "0F",   "1F",    "1L"},
     {"2S" ,    "3S" ,  "4S" ,   "5S"},
     {"2Z" ,    "0C" ,  "1C"  ,  "0W" },
     {"0Q" ,    "0H" ,   "1H" ,    "1Q" },
     {"0P" ,    "1P" ,   "2P" ,   "3P" },
     {"2L" ,    "3L",    "4L" ,   "5L"},
     {"2R" ,    "3R" ,   "4R" ,   "5R"},
     {"0E" ,    "0D" ,   "1D",    "1E"},
     {"0G"  ,   "1G",   "2G"  ,  "3G"},
     {"0V",     "1V",     "2V",    "3V"},
     {"0A" ,   "1A" ,   "2A" ,   "3A"}};
 System.out.println("Enter letter in ATCG form :");
 Scanner scan=new Scanner(System.in);
 value=scan.nextLine();
 String a[] = new String[100];

 String x="",y="",lastElement="";
 a= value.split("(?<=\\G...)");
 
//The regex (?<=\G...) matches an empty string that has the last match (\G) followed by three characters (...) before it ((?<= ))
int n=value.length();
 if(n%3!=0){
 n=n/3+1;
 lastElement=a[a.length-1];
 //if 3 le divide hunna vane last value hamilai chahinxa append huna lai so last element of array is drawn out in if condition
 } else n=n/3;
 for (int i=0; i<n;i++){
//System.out.println("A[I]: "+ a[i]);
 if((a[i].length())==3){
x=a[i].substring(0,2);
y=a[i].substring(2,3);
switch(x){
	 case "AA":
	inx=0;
	break;
	case "AT":
	inx=1;
	break;
	case "AC":
	inx=2;
	break;
	case "AG":
	inx=3;
	break;
	case "TA":
	inx=4;
	break;
	case "TT":
	inx=5;
	break;
	case "TC":
	inx=6;
	break;
	case "TG":
	inx=7;
	break;
	case "CA":
	inx=8;
	break;
	case "CC":
	inx=9;
	break;
	case "CT":
	inx=10;
	break;
	case "CG":
	inx=11;
	break;
	case "GA":
	inx=12;
	break;
	case "GG":
	inx=13;
	break;
	case "GT":
	inx=14;
	break;
	case "GC":
	inx=15;
	break;
	 }
	 switch(y){
	 case "A":
	iny=0;
	break;
	case "T":
	iny=1;
	break;
	case "C":
	iny=2;
	break;
	case "G":
	iny=3;
	break;
	 }
	  temp=String.valueOf(b[inx][iny]);
	   
	   val=val+temp+lastElement;
	    }
 }
System.out.println("val:" +val);

 }

public static void main(String args[]){
Amino obj=new Amino();
obj.get_value();
}
}