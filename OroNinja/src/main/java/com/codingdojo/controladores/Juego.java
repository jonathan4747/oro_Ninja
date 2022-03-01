package com.codingdojo.controladores;

import java.util.Random;

import javax.servlet.http.HttpSession;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.modelos.numeros;

@Controller
public class Juego {
	 Random randMachine = new Random();
	@RequestMapping( value = "/gold", method = RequestMethod.GET )
	public String despliegaLogin(HttpSession session,Model model) {
		session.getAttribute("numero1");
		session.getAttribute("numero2");
		session.getAttribute("numero3");
		session.getAttribute("numero4");
		
		return "index.jsp";
	}
	
	@RequestMapping(value="/gold/1", method=RequestMethod.POST)
	public String login1(HttpSession session,RedirectAttributes flash) {
		 Random randMachine = new Random();
		 Date fecha = new Date(); 
		 String strDateFormat = "MMMMM dd yyyy hh:mm a";
		 SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
		 int numero1;
		 numero1= 10 + randMachine.nextInt(11);
		 numeros num1 = new numeros (numero1);
		 session.setAttribute("numero1", num1.getNumero());
		 flash.addFlashAttribute( "numero1", num1.getNumero() );
		 flash.addFlashAttribute( "anuncio1", "Usted ha ganado "+num1.getNumero()+" Gold"+"("+objSDF.format(fecha)+")" );
		 return"redirect:/gold";
		
	}
	@RequestMapping(value="/gold/2", method=RequestMethod.POST)
	public String login2(HttpSession session,RedirectAttributes flash) {
		 Random randMachine = new Random();
		 Date fecha = new Date(); 
		 String strDateFormat = "MMMMM dd yyyy hh:mm a";
		 SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
		 int numero2;
		 numero2= 5+ randMachine.nextInt(6);
		 numeros num2 = new numeros (numero2);
		 session.setAttribute("numero2", num2.getNumero());
		 flash.addFlashAttribute( "numero1", num2.getNumero() );
		 flash.addFlashAttribute( "anuncio2", "Usted ha ganado "+num2.getNumero()+" Gold"+"("+objSDF.format(fecha)+")" );
		 return"redirect:/gold";
		
	}
	@RequestMapping(value="/gold/3", method=RequestMethod.POST)
	public String login3(HttpSession session,RedirectAttributes flash) {
		 Random randMachine = new Random();
		 Date fecha = new Date(); 
		 String strDateFormat = "MMMMM dd yyyy hh:mm a";
		 SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
		 int numero3;
		 numero3= 2 + randMachine.nextInt(4);
		 numeros num3 = new numeros (numero3);
		 session.setAttribute("numero3", num3.getNumero());
		 flash.addFlashAttribute( "numero1", num3.getNumero() );
		 flash.addFlashAttribute( "anuncio3", "Usted ha ganado "+num3.getNumero()+" Gold"+"("+objSDF.format(fecha)+")" );
		 return"redirect:/gold";
		
	}
	@RequestMapping(value="/gold/4", method=RequestMethod.POST)
	public String login4(HttpSession session,RedirectAttributes flash) {
		 Random randMachine = new Random();
		 Date fecha = new Date(); 
		 String strDateFormat = "MMMMM dd yyyy hh:mm a";
		 SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
		 int numero4;
		 numero4= -50 + randMachine.nextInt(101);
		 numeros num4 = new numeros (numero4);
		 session.setAttribute("numero1", num4.getNumero());
		 flash.addFlashAttribute( "numero4", num4.getNumero() );
		 
		 if(num4.getNumero()>=0) {
			 flash.addFlashAttribute( "anuncio4", "Usted ha ganado "+num4.getNumero()+" Gold"+"("+objSDF.format(fecha)+")" );
		 }
		 if(num4.getNumero()<0) {
			 flash.addFlashAttribute( "anuncio5", "Usted ha perdido "+num4.getNumero()+" Gold"+"("+objSDF.format(fecha)+")" );
		 }
		 
		 return"redirect:/gold";
		 
		
	}
}
