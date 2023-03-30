// Nama Naya Nirwana
// Stambuk 13020210105

interface A {
    public void Naya();
}

interface B extends A {

}

class Central0105 implements B {
    public void Naya() {
        System.out.println("Naya");
    }

    public static void main(String arg[]) {
        System.out.println("main");
        Central0105 obj = new Central0105();
        obj.Naya();
    }
}
