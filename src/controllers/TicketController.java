package controllers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import models.TicketSoporte;

public class TicketController {

  public Set<TicketSoporte> filtrarYOrdenarTickets(List<TicketSoporte> tickets, int prioridadMinima) {

    Set<TicketSoporte> ticketsFiltrados = new TreeSet<>(
        (c1, c2) -> {
          int comparacion = Integer.compare(c1.getPrioridad(), c2.getPrioridad());
          if (comparacion != 0) {
            return comparacion;
          }
          return c1.getCodigo().compareToIgnoreCase(c2.getCodigo());
        });

    for (TicketSoporte ticket : tickets) {
      if (ticket.getPrioridad() >= prioridadMinima) {
        ticketsFiltrados.add(ticket);
      }
    }

    return ticketsFiltrados;
  }

  public Map<String, Set<String>> agruparCodigosPorPrioridad(List<TicketSoporte> tickets) {

    Map<String, Set<String>> map = new HashMap<>();

    for (TicketSoporte ticket : tickets) {
      String prioridad = String.valueOf(ticket.getPrioridad());
      String codigo = ticket.getCodigo();
      if (!map.containsKey(prioridad)) {
        map.put(prioridad, new HashSet<>());
      }
      map.get(prioridad).add(codigo);
    }
    return map;

  }

}
