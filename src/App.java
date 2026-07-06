import java.util.ArrayList;
import java.util.List;

import controllers.TicketController;
import models.TicketSoporte;

public class App {
    public static void main(String[] args) throws Exception {

        List<TicketSoporte> tickets = new ArrayList<>();

        tickets.add(new TicketSoporte("TK-101", "Ana Torres", 5));
        tickets.add(new TicketSoporte("TK-102", "Juan Perez", 2));
        tickets.add(new TicketSoporte("TK-103", "Alex Carrion", 1));
        tickets.add(new TicketSoporte("TK-104", "John Gomez", 3));
        tickets.add(new TicketSoporte("TK-101", "Ana Torres", 4));
        tickets.add(new TicketSoporte("TK-106", "Luis Andrade", 2));
        tickets.add(new TicketSoporte("TK-107", "Sofia Cordero", 5));
        tickets.add(new TicketSoporte("TK-108", "Juan Armijos", 3));
        tickets.add(new TicketSoporte("TK-109", "Mateo Rojas", 1));
        tickets.add(new TicketSoporte("TK-110", "Ana Torres", 1));
        
        TicketController ticketController = new TicketController();

        System.out.println(ticketController.filtrarYOrdenarTickets(tickets, 1));
        System.out.println(ticketController.agruparCodigosPorPrioridad(tickets));

    }
}
