// package com.kgisl.springhibernatemvccrud.model;

// import java.util.Locale;

// import javax.validation.Valid;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.validation.BindingResult;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PostMapping;

// @Controller
// public class AgendaController {

//      @Autowired
//     private AgendaService agendaService;

    
//     @GetMapping("/agendas")

//     public String userForm(Locale locale, Model model)
//     {
//         model.addAttribute("agendas", agendaService.getAll());
//         return "editagendas";
//     }

//     @ModelAttribute("agenda")
//     public Event formBackingObject()
//     {
//         return new Event();
//     }

//     @PostMapping("/addagenda")
//     public String saveEvent(@ModelAttribute("agenda") @Valid Agenda agenda, BindingResult result, Model model)
//     {

//         if(result.hasErrors())
//         {
//             model.addAttribute("agendas", agendaService.getAll());

//             return "editagendas";

//         }

//         agendaService.save(agenda);
//             return "redirect:/";
       
       
//     }
// }

