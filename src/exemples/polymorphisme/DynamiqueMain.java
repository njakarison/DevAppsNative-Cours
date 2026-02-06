package exemples.polymorphisme;

class DynamiqueMain {
    static DynamiqueChien c = new DynamiqueChien();
    static DynamiqueVache v = new DynamiqueVache();
    public static void main(String args[]){
        c.emettreSon();
        v.emettreSon();
    }
}
