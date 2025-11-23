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
import java.util.List;\
\
public class ServicoFinanceiro \{\
\
    // [RF005] Comprovante\
    public void emitirComprovante(Consulta c) \{\
        System.out.println("\\n[COMPROVANTE] Valor pago: R$" + c.getValor() + \
                           " | Paciente: " + c.getPaciente().getNome());\
    \}\
\
    // [RF006] Relat\'f3rio e Regra 4\
    public void relatorioReceita(List<Consulta> lista) \{\
        double total = 0;\
        for (Consulta c : lista) total += c.getValor();\
        System.out.println("\\n[RELAT\'d3RIO FINANCEIRO] Receita Total: R$" + total);\
    \}\
\}}