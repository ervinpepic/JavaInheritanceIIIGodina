class Datum
{
    int d;
    int m;
    int g;

    Datum()
    {
        d = 1;
        m = 1;
        g = 2011;
    }

    Datum(int d, int m, int g)
    {
        this.d = d;
        this.m = m;
        this.g = g;
    }

    int dan()
    {
        return d;
    }

    int mesec()
    {
        return m;
    }

    int godina()
    {
        return g;
    }

    
    int prestupna()
    {
        int p;
        p = (g % 4 != 0 || ( g % 100 == 0 && g % 400 != 0)) ? 0 : 1;
        return p;
    }

    int ispravan()
    {
        int i;
        if (g < 0) return 1;
        if (d < 0) return 1;
        switch (m)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: if (d <= 31)
            return 0;
            else
            return 1;

            case 2: if (d <= (28 + this.prestupna()))
            return 0; //return 0 means no errors occured
            else
            return 1;

            case 4:
            case 6:
            case 9:
            case 11: if (d <= 30)
            return 0;
            else
            return 1;
            default: return 1;
        }
    }
}

    class P_n_e extends Datum   
    {
        String era;
    
        P_n_e()
        {
            super();
            era = "nove ere";
        }
    
        P_n_e(int d, int m, int g, String era)
        {
            super(d, m, g);
            this.era = era;
        }
    
        void ispisEra()
        {
            System.out.println("Danasnji datum sa erom je: " + d + "." + m + "." + g + "." + era);
        }
    }

    class Datum2017 extends Datum
    {

        Datum2017()
        {
            super();
            g = 2020;
        }
    
        Datum2017(int d, int m, int g)
        {
            super(d, m, g);
        }
    
        void ispis()
        {
            System.out.println("Datum je: " + d + "." + m + ". 2017." + "\n");
        }
    }

class Domaci_Datum
{
    public static void main(String[] args) 
    {
        Datum d1 = new Datum(1,1,2000);
        Datum d2 = new Datum(29,2,2010);
        P_n_e d3 = new P_n_e(1,2,3, "Pre nove ere");
        Datum2017 d4 = new Datum2017(11, 6, 2017);

        System.out.println("Datum D1: " + d1.d + "." + d1.m + "." + d1.g + ".");
        System.out.println("Datum D2: " + d2.d + "." + d2.m + "." + d2.g + "."); 
        d3.ispisEra();

        if (d1.ispravan() == 0) 
        System.out.println("Datum je ispravan.");
        else
        System.out.println("Datum nije ispravan.");

        if (d2.prestupna() == 0)
        System.out.println("Godina je prestupna.");
        else
        System.out.println("Godina nije prestupna.");

    }
}

