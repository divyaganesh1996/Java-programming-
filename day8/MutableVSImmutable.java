package day8;

public class MutableVSImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//string
		String s = "welcome";
s.concat("to java");
System.out.println(s);

//stringbuffer and stringbuilder

StringBuffer sr = new StringBuffer("welcome");
sr.append(" to java");
System.out.println(sr);
	}

}
