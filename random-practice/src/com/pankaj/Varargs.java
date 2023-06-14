class Varargs{
    public static void main(String... args){
        String[] stringArray1={"Hello","How","are","You"};
        String[] stringArray2={"GoodBye"};
        testVarArgs(stringArray1, stringArray2);
    }
    static void testVarArgs(String[]... string){
        System.out.println(string[0][3]);
        System.out.println(string[1][0]);
    }
}