{\rtf1\ansi\ansicpg1252\cocoartf2822
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\froman\fcharset0 Times-Roman;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww16700\viewh19680\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf0 \expnd0\expndtw0\kerning0
package vitalis.service;\
\
import vitalis.model.Consulta;\
import java.time.DayOfWeek;\
import java.time.LocalDateTime;\
import java.util.ArrayList;\
import java.util.List;\
\
public class ServicoAgendamento \{\
    private List<Consulta> agenda = new ArrayList<>();\
\
    // Regra 1: Valida\'e7\'e3o de hor\'e1rio comercial e intervalo de 30min\
    private boolean validarHorario(LocalDateTime data) \{\
        int h = data.getHour();\
        int m = data.getMinute();\
        DayOfWeek dia = data.getDayOfWeek();\
\
        if (dia == DayOfWeek.SATURDAY || dia == DayOfWeek.SUNDAY) return false;\
        if (h < 8 || h >= 18) return false;\
        if (m != 0 && m != 30) return false;\
        return true;\
    \}\
\
    // [RF003] Agendamento\
    public void agendar(Consulta c) \{\
        if (!validarHorario(c.getDataHora())) \{\
            System.out.println("ERRO: Hor\'e1rio inv\'e1lido (Regra 1).");\
            return;\
        \}\
        // Verifica duplicidade\
        for (Consulta item : agenda) \{\
            if (item.getProfissional().equals(c.getProfissional()) && \
                item.getDataHora().equals(c.getDataHora())) \{\
                System.out.println("ERRO: Profissional ocupado.");\
                return;\
            \}\
        \}\
        agenda.add(c);\
        System.out.println("Sucesso: Consulta agendada.");\
    \}\
\
    // [RF007] Cancelamento (Regra 3: Libera slot)\
    public void cancelar(int index) \{\
        if (index >= 0 && index < agenda.size()) \{\
            agenda.remove(index);\
            System.out.println("Sucesso: Consulta cancelada.");\
        \} else \{\
            System.out.println("ERRO: \'cdndice inv\'e1lido.");\
        \}\
    \}\
\
    public List<Consulta> getAgenda() \{ return agenda; \}\
    \
    public void listar() \{\
        System.out.println("--- Agenda ---");\
        for (int i=0; i<agenda.size(); i++) \{\
            System.out.println(i + ": " + agenda.get(i));\
        \}\
    \}\
\}}