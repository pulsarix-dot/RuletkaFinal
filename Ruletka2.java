
package ruletka2;


public class Ruletka2 {
    private int Konto;
    private int spinPocet;
    
    public Ruletka2(int Konto) {
        this.Konto = Konto;
        this.spinPocet = 0;
    }
    
    public void turn(int bet, String vybraneCislo) {
        int betVyhry = bet * 36;
        if (this.Konto >= bet) {
            this.Konto -= bet;
        int spinCislo = spin();
        System.out.println(toString());
        if ((spinCislo == Integer.parseInt(vybraneCislo)) || (spinCislo == 37 && Integer.parseInt(vybraneCislo) == 00)){
           System.out.println(" Vyhravajuce čislo je " + spinCislo + " a vyhravaš" + betVyhry); 
           this.Konto += betVyhry;
        }
        else {
                System.out.println("Vybral si zle čislo.");
                }
        }
        else {
            System.out.println("Nemáš peniaze.");
        }
    }
    
    private int spin() {
    this.spinPocet++;
    return (int) (Math.floor(Math.random()*100)%38);
    }
    
    public String toString() {
        return ("Ruleta Hra:\n" + 
                "Konto = €" + this.Konto + "\n" +
                "Počet hier " + this.spinPocet);
    }

    public static void main(String[] args) {
        Ruletka2 rg1 = new Ruletka2(10);
        rg1.turn(1,"10");
        rg1.turn(2,"20");
        rg1.turn(3,"30");
        rg1.turn(4,"40");
        rg1.turn(5,"50");
        
    
    }
    
}
