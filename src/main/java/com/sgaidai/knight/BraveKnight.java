
package com.sgaidai.knight;


public class BraveKnight implements Knight {
    public Quest quest;
    
    
    public BraveKnight(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        }
    
    @Override
    public void embarkOnQuest()  {
        quest.embark(); 
        
    }
}
