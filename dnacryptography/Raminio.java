import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

class Raminio{
String value,temp="",val="",flast="", slast="",output; //val has some empty value from previous time
int inx,iny;
Raminio(){

 }
 public void get_value(){
	  String b[][]=new String[][]
    {{"GCA","TGT","GAT","GAA","GGA","CAT","ATA","AAA","TTA","ATG","AAT","CCA","CAA","AGA","AGT","ACA","GTA","TGG","TAT","TAA","TTT"},
	 {"GCT","TGC","GAC","GAG","GGT","CAC","ATT","AAG","TTG","#","AAC","CCT","CAG","AGG","AGC","ACT","GTT","#","TAC","TAG","TTC"},
	 {"GCC","#","#","#","GGC","#","ATC","#","CTA","#","#","CCC","#","CGA","TCA","ACC","GTC","#","#","TGA","#"},
	 {"GCG","#","#","#","GGG","#","#","#","CTT","#","#","CCG","#","CGT","TCT","ACG","GTG","#","#","#","#"},
	 {"#","#","#","#","#","#","#","#","CTC","#","#","#","#","CGC","TCC","#","#","#","#","#","#"},
	 {"#","#","#","#","#","#","#","#","CTG","#","#","#","#","CGG","TCG","#","#","#","#","#","#"}
	 };
String[] alp={"C","A","T","G"};
 System.out.println("Enter letter in ALPHANUMERIC form :");
 Scanner scan=new Scanner(System.in);
 value=scan.nextLine();
 String a[] = new String[100];

 String x="",y="",lastElement="";
 a= value.split("(?<=\\G..)");
try{
//The regex (?<=\G...) matches an empty string that has the last match (\G) followed by three characters (...) before it ((?<= ))
int n=value.length();
 if(n%2!=0){
	 if(Arrays.asList(alp).contains(x)){
 n=n/2+1;
	 lastElement=a[a.length-1];}
 else{
	 System.out.println("Error");
 }
 
 //if 3 le divide hunna vane last value hamilai chahinxa append huna lai so last element of array is drawn out in if condition
 
 } else n=n/2;
for (int i=0; i<n;i++){
//System.out.println("A[I]: "+ a[i]);
 if((a[i].length())==2){
x=a[i].substring(0,1);
y=a[i].substring(1,2);
 if(Arrays.asList(alp).contains(x)){
//System.out.println("Hello");
flast=String.valueOf(x);
slast=String.valueOf(y);
//System.out.println(flast);
//System.out.println(slast);
 }
else{
	
	inx=Integer.valueOf(x);
	switch(y){
	case "A":
	iny=0;
	break;
	case "C":
	iny=1;
	break;
	case "D":
	iny=2;
	break;
	case "E":
	iny=3;
	break;
	case "F":
	iny=20;
	break;
	case "G":
	iny=4;
	break;
	case "H":
	iny=5;
	break;
	case "I":
	iny=6;
	break;
	case "K":
	iny=7;
	break;
	case "L":
	iny=8;
	break;
	case "M":
	iny=9;
	break;
	case "N":
	iny=10;
	break;
	case "P":
	iny=11;
	break;
	case "Q":
	iny=12;
	break;
	case "R":
	iny=13;
	break;
	case "S":
	iny=14;
	break;
	case "T":
	iny=15;
	break;
	case "V":
	iny=16;
	break;
	case "W":
	iny=17;
	break;
	case "Y":
	iny=18;
	break;
	case "Z":
	iny=19;
	break;
	 }
	 temp=String.valueOf(b[inx][iny]);
	val=val+temp;
	 
}

output=val+lastElement+flast+slast;
	   
	   
	    }

}
 
System.out.println("val:" +output);
 }catch(Exception ex){
	 System.out.println("Error: " +ex);
 }
 }

public static void main(String args[]){
Raminio obj=new Raminio();
obj.get_value();
}
}