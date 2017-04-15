
package com.sgaidai.knight;


public class BraveKnight implements Knight {
    public Quest quest;

  public BraveKnight(){};
    
    
   // public BraveKnight(Quest quest) {
    //    this.quest = quest;
    
    public void setQuest(Quest quest)  {
        this.quest = quest; 
        
    }

    //    }
    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
