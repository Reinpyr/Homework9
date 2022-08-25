public class Main {
    public static void main(String[] args) {
        int nykyinen = 0;
        int edellinen = 0;
        int muutos = 0;
        int suurinmuutos = 0;
        int vastaus = 0;

        for (int t=0; t <= 100; t = t + 1)
        {
            nykyinen = t*(t-20)*(t-100)+120000;
            edellinen = (t-1)*((t-1)-20)*((t-1)-100)+120000;
            muutos = nykyinen - edellinen;
            if (muutos < suurinmuutos)
            {
                suurinmuutos = muutos;
                vastaus = t;
            }
        }
        System.out.println(vastaus);
    }
}