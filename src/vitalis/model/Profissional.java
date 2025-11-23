{\rtf1\ansi\ansicpg1252\cocoartf2822
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\froman\fcharset0 Times-Roman;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww16700\viewh19680\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf0 \expnd0\expndtw0\kerning0
package vitalis.model;\
\
public class Profissional extends Pessoa \{\
    private String registroProfissional;\
    private String especialidade;\
\
    public Profissional(String nome, String cpf, String registro, String especialidade) \{\
        super(nome, cpf);\
        // Valida\'e7\'e3o simples (Regra 2)\
        if (registro != null && !registro.isEmpty()) \{\
            this.registroProfissional = registro;\
        \} else \{\
            this.registroProfissional = "INVALIDO";\
        \}\
        this.especialidade = especialidade;\
    \}\
\
    public String getRegistroProfissional() \{ return registroProfissional; \}\
    public String getEspecialidade() \{ return especialidade; \}\
\
    @Override\
    public String toString() \{\
        return super.toString() + " | Registro: " + registroProfissional + " | Esp: " + especialidade;\
    \}\
\}}