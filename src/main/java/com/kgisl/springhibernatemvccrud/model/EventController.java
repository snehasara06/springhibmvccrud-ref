// package com.kgisl.springhibernatemvccrud.model;

// import java.util.List;
// import java.util.Locale;
// import javax.validation.Valid;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.validation.BindingResult;
// import org.springframework.beans.factory.annotation.Autowired;

// @Controller
// public class EventController {

//     @Autowired
//     private EventService eventService;

//     @Autowired
//     private AgendaService agendaService;

//     @GetMapping("/")
//     public String userForm(Locale locale, Model model) {
//         model.addAttribute("events", eventService.getAll());
//         return "editevents";
//     }

//     @ModelAttribute("event")
//     public Event formBackingObject() {
//         return new Event();
//     }

//     @PostMapping("/addevent")
//     public String saveEvent(@ModelAttribute("event") @Valid Event event, BindingResult result, Model model) {
//         if (result.hasErrors()) {
//             return "editevents";
//         }

//         eventService.save(event);
//         return "redirect:/editagendas";
//     }

//     @ModelAttribute("agenda")
//     public Agenda formBackingObject1() {
//         return new Agenda();
//     }

//     @PostMapping("/addagenda")
//     public String saveAgenda(@ModelAttribute("agenda") @Valid Agenda agenda, BindingResult result, Model model) {
//         if (result.hasErrors()) {
//             return "editagendas";
//         }

//         agendaService.save(agenda);
//         return "redirect:/editagendas";
//     }

//     // @GetMapping("/editagendas")
//     // public String editAgendas(Locale locale, Model model) {
//     //     model.addAttribute("agendas", agendaService.getAll());
//     //     return "editagendas";
//     // }

//     @RequestMapping("/editagendas")
// public String editAgendas(Model model) {
//     // Retrieve the list of events and set it as a model attribute
//     List<Event> events = eventService.getAll();
//     model.addAttribute("events", events);

//     // Create a new Agenda object and set it as a model attribute
//     Agenda agenda = new Agenda();
//     model.addAttribute("agenda", agenda);

//     // Add the 'command' object to the request (optional, if needed by other parts of the JSP)
//     model.addAttribute("command", agenda);

//     // Return the view name
//     return "editagendas";
// }

// }


//     // @ModelAttribute("agenda")
//     // public Agenda formBackingObject1()
//     // {
//     //     return new Agenda();
//     // }

//     // @PostMapping("/addagenda")
//     // public String saveAgenda(@ModelAttribute("agenda") @Valid Agenda agenda, BindingResult result, Model model)
//     // {

//     //     if(result.hasErrors())
//     //     {
//     //         model.addAttribute("agendas", agendaService.getAll());

//     //         return "editagendas";

//     //     }

//     //     agendaService.save(agenda);
//     //         return "redirect:/";
       
       
//     // }

//        /* Event currentevent = eventService.find(eventId);
//         currentevent.setId(event.getId());
//         currentevent.setEdition(event.getEdition());
//         currentevent.setDate(event.getDate());
//         currentevent.setLocation(event.getLocation());
//         currentevent.setIsActive(event.getIsActive()); 
//         currentevent.setAgenda(event.getAgenda());
//         Agenda a = new Agenda();
//         a.setaId(a.getaId());
//         a.setTime(a.getTime());
//         a.setDescription(a.getDescription());
//         a.setInstructor(a.getInstructor());
//         Agenda a1 = new Agenda();
//         a1.setaId(a.getaId());
//         a1.setTime(a.getTime());
//         a1.setDescription(a.getDescription());
//         a1.setInstructor(a.getInstructor());*/


    



