package br.ifpr.paranavai.atividadepos.atividadepos01.controle;
 
import java.util.Optional;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RequestParam;
 

@Controller
public class AtividadeControle {
 
	public int total_requisicao = 0;
	
  
	@GetMapping("/atividade")
	public String atividade(Model model) {
 
		total_requisicao += 1;
		model.addAttribute("enviaNumero", total_requisicao);
		 
		return "atividade/index";
	}
	
 

}
