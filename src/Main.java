public class Main {
    public static void main(String[] args) {
        CNF cky = new CNF();
        cky.addProductionRule("S -> A S B");
        cky.addProductionRule("A -> a A S");
        cky.addProductionRule("A -> a");
        cky.addProductionRule("A -> $");
        cky.addProductionRule("B -> S b S");
        cky.addProductionRule("B -> A");
        cky.addProductionRule("B -> b b");
        cky.printProductionRule();
        cky.convertToChomskyNorm();
        System.out.println();
        cky.printProductionRule();
    }
}
