class bird{
    void eyes(){
        System.out.println("eyes");
    }

    void wings(){
        System.out.println("wings");
    }
}

public class pigeon extends bird {

    void name(){
        System.out.println("names");
    }

    public static void main(String[] args) {
        pigeon p = new pigeon();
        p.eyes();
        p.wings();
        p.name();
    }
}
