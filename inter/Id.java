 package inter;                 // Arquivo Id.java
 import lexer.*; import symbols.*;
 public class Id extends Expr {
        public int offset;     // endereco relativo
        public Id(Word id, Type p, int b) { super(id, p); offset = b; }
     }