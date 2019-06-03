public class Main {
    public static void main(String[] args) {
        String input = "b b a b a a";
        CNF cky = new CNF(input);
        cky.addProductionRule("S -> A S B");
        cky.addProductionRule("A -> a A S");
        cky.addProductionRule("A -> a");
        cky.addProductionRule("A -> $");
        cky.addProductionRule("B -> S b S");
        cky.addProductionRule("B -> A");
        cky.addProductionRule("B -> b b");

        cky.setStartSymbol("S");
        cky.printProductionRule();
        cky.convertToChomskyNorm();
        System.out.println();
        cky.printProductionRule();
    }
}
