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
import vitalis.model.HistoricoAtendimento;\
import vitalis.model.Paciente;\
import java.util.ArrayList;\
import java.util.List;\
\
public class ServicoHistorico \{\
    private List<HistoricoAtendimento> historicos = new ArrayList<>();\
\
    public void registrar(HistoricoAtendimento h) \{\
        historicos.add(h);\
        System.out.println("Hist\'f3rico registrado.");\
    \}\
\
    public void consultarPorPaciente(Paciente p) \{\
        System.out.println("--- Hist\'f3rico de " + p.getNome() + " ---");\
        for (HistoricoAtendimento h : historicos) \{\
            if (h.getPaciente().equals(p)) \{\
                System.out.println(h);\
            \}\
        \}\
    \}\
\}}