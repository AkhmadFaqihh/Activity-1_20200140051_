/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.Kelas.B.Tugas.Java.Kelas.B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author mwllf
 */
@Controller
@RequestMapping
public class TugasKelasB {
    
        public String tampil (Model model){
            
            ArrayList<List<String>> data = new ArrayList<>();
            
        
        data.add(Arrays.asList("2245001","33250000","Faqih","Limpung"));
        data.add(Arrays.asList("2245002","33250001","Arfan","Limpung"));
        data.add(Arrays.asList("2245003","33250002","Faiz","Limpung"));
        data.add(Arrays.asList("2245004","33250003","Hanif","Limpung"));
        data.add(Arrays.asList("2245005","33250004","Firizki","Limpung"));
        data.add(Arrays.asList("2245006","33250005","Lana","Limpung"));
        data.add(Arrays.asList("2245007","33250006","Tegar","Limpung"));
        data.add(Arrays.asList("2245008","33250007","Indra","Limpung"));
        data.add(Arrays.asList("2245009","33250008","Riza","Limpung"));
        data.add(Arrays.asList("22450010","33250009","Bayu","Limpung"));
        data.add(Arrays.asList("22450011","332500010","Andri","Limpung"));
        data.add(Arrays.asList("22450012","332500011","Andra","Limpung"));
        data.add(Arrays.asList("22450013","332500012","Prasetyo","Limpung"));
        data.add(Arrays.asList("22450014","332500013","Andhika","Limpung"));
        data.add(Arrays.asList("22450015","332500014","Anggara","Limpung"));
        data.add(Arrays.asList("22450016","332500015","Afiq","Limpung"));
        data.add(Arrays.asList("22450017","332500016","Firly","Limpung"));
        data.add(Arrays.asList("22450018","332500017","Dewi","Limpung"));
        data.add(Arrays.asList("22450019","332500018","Fina","Limpung"));
        data.add(Arrays.asList("22450020","332500019","Irul","Limpung"));
        
        model.addAttribute("table", data);//proses mengirim data yang ada di ArrayList
        return "viewData"; //Didalam tanda petik adalah nama file html
    }
    
}
