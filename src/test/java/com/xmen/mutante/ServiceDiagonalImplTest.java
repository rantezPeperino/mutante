package com.xmen.mutante;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.xmen.mutante.service.impl.ServiceDiagonalImpl;
import com.xmen.mutante.utils.Utils;

class ServiceDiagonalImplTest {

    private ServiceDiagonalImpl serviceDiagonal;


    @BeforeEach
    @SuppressWarnings("unused")
    void setUp() {
        serviceDiagonal = new ServiceDiagonalImpl();
    }

    @Test
    void checkDiagonal_WhenValidSequenceExists_ReturnsTrue() {
        String[] dna =  {
             "ATGCGA",
             "CAGTGC",
             "TTATGT",
             "AGAAGG",
             "CCCCTA",
             "TCACTG"
        };
        char[][] m = Utils.convertToMatrix(dna);
        assertTrue(serviceDiagonal.checkDiagonal(m, 0, 0));
    }

    @Test
    void checkDiagonal_WhenNoValidSequenceExists_ReturnsFalse() {
        String [] dna =  {
              "ATGCGA",
              "CTGTGC",
              "TTGTGT",
              "AGATGG",
              "CCCCTA",
              "TCACTG"
        };
        char[][] m = Utils.convertToMatrix(dna);
        assertFalse(serviceDiagonal.checkDiagonal(m, 0, 0));
    }

    @Test
    void checkDiagonal_WhenOutOfBounds_ReturnsFalse() {
        String [] dna =  {
                "ATG",
                "CAG",
                "TTA"
      };
      char[][] m = Utils.convertToMatrix(dna);
        assertFalse(serviceDiagonal.checkDiagonal(m, 0, 0));
    }

    @Test
    void checkDiagonal_WhenEmptySpace_ReturnsFalse() {
        String [] dna =  {
               " TGC",
               "C GT",
               "TT T",
               "AGA "
  };
        char[][] m = Utils.convertToMatrix(dna);
        assertFalse(serviceDiagonal.checkDiagonal(m, 0, 0));
    }

    @Test
    void checkInverseDiagonal_WhenValidSequenceExists_ReturnsTrue() {
            String [] dna =  {
                "ATGCGA",
                "CACTGC",
                "TCATGT",
                "CGAAGG",
                "CCCCTA",
                "TCACTG"
       };
        
        char[][] m = Utils.convertToMatrix(dna);
        assertTrue(serviceDiagonal.checkInverseDiagonal(m, 0, 3));
    }

    @Test
    void checkInverseDiagonal_WhenNoValidSequenceExists_ReturnsFalse() {
        String [] dna =  {
            "ATGCGA",
            "CAGTGC",
            "TTTTGT",
            "AGAGGG",
            "CCCCTA",
            "TCACTG"
       };
        char[][] m = Utils.convertToMatrix(dna);
        assertFalse(serviceDiagonal.checkInverseDiagonal(m, 0, 3));
    }

    @Test
    void checkInverseDiagonal_WhenOutOfBounds_ReturnsFalse() {
        String [] dna =  {
            "ATG",
            "CAG",
            "TTA"
       };
       char[][] m = Utils.convertToMatrix(dna);
        assertFalse(serviceDiagonal.checkInverseDiagonal(m, 0, 2));
    }

    @Test
    void hasDiagonalSequence_WhenSequenceExists_ReturnsTrue() {
        String [] dna =  {
            "ATGCGA",
            "CAGTGC",
            "TTATGT",
            "AGAAGG",
            "CCCCTA",
            "TCACTG"
       };
        char[][] m = Utils.convertToMatrix(dna);
        assertTrue(serviceDiagonal.hasDiagonalSequence(m));
    }

    @Test
    void hasDiagonalSequence_WhenNoSequenceExists_ReturnsFalse() {
        String [] dna =  {
            "ATGCGA",
            "CTGTGC",
            "TTTTGT",
            "AGAGGG",
            "CCCCTA",
            "TCACTG"
       };
        char[][] m = Utils.convertToMatrix(dna);
        assertFalse(serviceDiagonal.hasDiagonalSequence(m));
    }
}