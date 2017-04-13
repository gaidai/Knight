/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgaidai.knight;

/**
 *
 * @author user
 */
public class BraveKnight implements Knight {
    public Quest quest;
    public Minstrel minstrel;
    
    public BraveKnight(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel = minstrel;
    }
    @Override
    public void embarkOnQuest()  {
        
        quest.embark(); 
        
    }
    
}
