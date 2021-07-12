/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Perpus.PerpusSewaBuku;
import Model.TabelSewaBuku;
import Model.Model_Table;
import gui.maingui;
import java.util.List;
import EPerpus.EPerpusSewaBuku;

/**
 *
 * @author ElyaD
 */
public class ConSewaBuku {
    
    public ConSewaBuku(maingui _tampil){
        this._tampilan = _tampil;
        EPerpusSewaBuku = new PerpusSewaBuku();
    }
    
        public void IsiTable(){
      list_sewaBuku = EPerpusSewaBuku.GetAll();
      TabelSewaBuku tabelSewaBuku = new TabelSewaBuku(list_sewaBuku);
      _tampilan.GetTabelData().setModel(tabelSewaBuku);
        
    }
       
       maingui _tampilan;
       EPerpusSewaBuku EPerpusSewaBuku;
       List<Model_Table> list_sewaBuku;
}
