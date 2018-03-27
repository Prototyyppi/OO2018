package asunto;
import java.io.*;
import java.util.Scanner;
import java.lang.Integer;

class AsuntoMain {
    static Scanner lukija = new Scanner(System.in);

	public static void main(String[] args)
	{
        System.out.println("Anna tontin nimi: ");
        String tontin_nimi = lukija.nextLine();
        System.out.println("Anna longituudi: ");
        String longituudi = lukija.nextLine();
        System.out.println("Anna latituudi: ");
        String latituudi = lukija.nextLine();
        System.out.println("Anna tontin ala: ");
        double tontin_ala = lukija.nextDouble();
        Tontti tontti = new Tontti(tontin_nimi, longituudi, latituudi, tontin_ala);
        System.out.println("Anna rakennuksen ala: ");
        double rakennuksen_ala = lukija.nextDouble();
        System.out.println("Anna huoneiden lkm: ");
        int huoneiden_lkm = lukija.nextInt();
        System.out.println("Anna asukkaiden lkm: ");
        int asukkaiden_lkm = lukija.nextInt();
        Rakennus rakennus = new Rakennus(rakennuksen_ala, huoneiden_lkm, asukkaiden_lkm, tontti);
        Asukkaat[] asukas = new Asukkaat[asukkaiden_lkm];
        int i;
		for (i = 0; i < asukkaiden_lkm; i++) {
            System.out.println("Asukkaan " + i + " nimi: ");
            String asukkaan_nimi = lukija.nextLine();
            System.out.println("Asukkaan " + i + " syntymäaika: ");
            String asukkaan_synt = lukija.nextLine();
			asukas[i] = new Asukkaat(i, asukkaan_nimi, asukkaan_synt, rakennus);
		}

        asukas[0].printInfo();
        

	}
}
/*
forget and pursue this:
class Author
{
 String authorName;
 int age;
 String place;
 Author(String name,int age,String place)
 {
  this.authorName=name;
  this.age=age;
  this.place=place;
 }
 public String getAuthorName()
 {
  return authorName;
 }
 public int getAge()
 {
  return age;
 }
 public String getPlace()
 {
  return place;
 }
}

class Book
{
 String name;
 int price;
 Author auth;
 Book(String n,int p,Author at)
 {
  this.name=n;
  this.price=p;
  this.auth=at;
 }
 public void showDetail()
 {
  System.out.println("Book is"+name);
  System.out.println("price "+price);
  System.out.println("Author is "+auth.getAuthorName());
 }
}

class Test
{
 public static void main(String args[])
 {
  Author ath=new Author("Me",22,"India");
  Book b=new Book("Java",550,ath);
  b.showDetail();
 }
}
*/