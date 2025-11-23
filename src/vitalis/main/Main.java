{\rtf1\ansi\ansicpg1252\cocoartf2822
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\froman\fcharset0 Times-Roman;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww16700\viewh19680\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf0 \expnd0\expndtw0\kerning0
package vitalis.main;\
\
import vitalis.model.*;\
import vitalis.service.*;\
import java.time.LocalDateTime;\
\
public class Main \{\
    public static void main(String[] args) \{\
        // Servi\'e7os\
        ServicoAgendamento sAgenda = new ServicoAgendamento();\
        ServicoHistorico sHist = new ServicoHistorico();\
        ServicoFinanceiro sFin = new ServicoFinanceiro();\
\
        System.out.println("=== VITALIS SIMULATION ===");\
\
        // 1. Cadastros (RF001/RF002)\
        Paciente p1 = new Paciente("Sarah", "111", "999", "Rua X");\
        Profissional dr = new Profissional("Dr. House", "222", "CRM1", "Geral");\
\
        // 2. Agendamento (RF003) - Teste Regra 1\
        LocalDateTime dataValida = LocalDateTime.of(2025, 12, 1, 10, 0); // Seg, 10:00\
        Consulta c1 = new Consulta(p1, dr, dataValida, 200.0);\
        sAgenda.agendar(c1);\
\
        LocalDateTime dataInvalida = LocalDateTime.of(2025, 12, 1, 10, 15); // Minuto 15 (Erro)\
        Consulta c2 = new Consulta(p1, dr, dataInvalida, 200.0);\
        sAgenda.agendar(c2);\
\
        // 3. Hist\'f3rico (RF004)\
        sHist.registrar(new HistoricoAtendimento(p1, dataValida, "Dor de cabe\'e7a."));\
        sHist.consultarPorPaciente(p1);\
\
        // 4. Cancelamento (RF007)\
        sAgenda.listar();\
        // sAgenda.cancelar(0); // Descomente para testar cancelamento\
\
        // 5. Financeiro (RF005/RF006)\
        sFin.emitirComprovante(c1);\
        sFin.relatorioReceita(sAgenda.getAgenda());\
    \}\
\}}