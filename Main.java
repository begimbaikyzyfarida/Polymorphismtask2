public class Main {
    public static void main(String[] args) {
        Beast[] beasts = new Beast[3];
        beasts[0] = new Tiger("Lion",567,3);
        beasts[1] = new Gepard("Uikuchu",234,7);
        beasts[2] = new Wolf("Laily",126,2);
        int maxSpeed = 5;

        for (Beast beastss:beasts) {
            if (beastss.getSpeed()>=maxSpeed){
                System.out.println(beastss);
            }

        }
    }
}

