class class_object {
    public static void main(String args[]){
        Animal2 a1 = new Animal2();
        Animal2 a2 = new Animal2();
        a1.setvalue("Dogs", 4, "Brcken");
        
        a1.name = "bull";
        // System.out.print(a1.name);
        a1.print();
    }
} 
    class Animal2{
        String name;
        int age;
        String language;
        void setvalue(String nem,int age, String lan){
            name = nem;
            this.language = lan;
            this.age = age;
        }
        void print(){
            System.out.print(name + ", ");
            System.out.print(language + ", ");
            System.out.println(age);
        }
    }