 package inter;                 // Arquivo Stmt.java
 public class Stmt extends Node {
        public Stmt() { }
        public static Stmt Null = new Stmt();
        public void gen(int b, int a) {} // chamado com rotulos begin e after
        int after = 0;                   // guarda rotulo after
        public static Stmt Enclosing = Stmt.Null;  // usado para comandos break
     }
