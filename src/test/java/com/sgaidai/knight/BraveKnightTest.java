/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgaidai.knight;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.mockito.Mockito.*;


public class BraveKnightTest {
    
    public BraveKnightTest() {
    }
    
    
    @Before
    public void setUp() {
        System.out.println("com.sgaidai.knight.BraveKnightTest.setUpClass()");
    }
    
    
    @After
    public void tearDown() {
        System.out.println("com.sgaidai.knight.BraveKnightTest.setUpClass()");
    }

    
    @org.junit.Test
    public void testEmbarkOnquest() {
        Quest mockQuest =  mock(Quest.class);
        
        
        BraveKnight knight = new BraveKnight ();
        knight.setQuest(mockQuest);
        knight.embarkOnQuest();
        
        verify(mockQuest,times(1)).embark();
        
       // verify(mockMinstrel,times(1)).embark();
        
        
       // System.out.println("embarkOnquest");
       // BraveKnight instance = null;
       // instance.embarkOnquest();
        // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
    }

    
    
}
