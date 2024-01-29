public class testPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Wahyu SW", "Jakarta");

        System.out.println("Informasi awal:");
        System.out.println(person1);

        // Mengubah alamat
        person1.setAddress("Jakarta Timur");
        
        System.out.println("\nInformasi setelah mengubah alamat:");
        System.out.println(person1);
    }
}
