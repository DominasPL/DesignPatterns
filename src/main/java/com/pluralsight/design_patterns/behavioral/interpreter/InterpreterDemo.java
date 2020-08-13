package com.pluralsight.design_patterns.behavioral.interpreter;

public class InterpreterDemo {

    static Expression buildInterpreterTree() {
        TerminalExpression terminal1 = new TerminalExpression("Lions");
        TerminalExpression terminal2 = new TerminalExpression("Tigers");
        TerminalExpression terminal3 = new TerminalExpression("Bears");

        //Tigers and bears
        Expression alternation1 = new AndExpression(terminal2, terminal3);

        //Lions or (Tigers and Bears)
        Expression alternation2 = new OrExpression(terminal1, alternation1);

        return new AndExpression(terminal3, alternation2);
    }

    /*
     * main method- build interpreter and then interpret a specific sequence
     */
    public static void main(String[] args) {
//        String context = "Lions";
//        String context = "Tigers";
//        String context = "Lions Tigers";
//        String context = "Lions Bears";
        String context = "Tigers Bears";

        Expression define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));
    }

}
