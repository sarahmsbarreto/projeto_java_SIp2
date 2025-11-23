{\rtf1\ansi\ansicpg1252\cocoartf2822
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\froman\fcharset0 Times-Roman;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww16700\viewh19680\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf0 \expnd0\expndtw0\kerning0
package vitalis.model;\
\
public class Paciente extends Pessoa \{\
    private String telefone;\
    private String endereco;\
\
    public Paciente(String nome, String cpf, String telefone, String endereco) \{\
        super(nome, cpf);\
        this.telefone = telefone;\
        this.endereco = endereco;\
    \}\
\
    // Getters e Setters\
    public String getTelefone() \{ return telefone; \}\
    public void setTelefone(String telefone) \{ this.telefone = telefone; \}\
    public String getEndereco() \{ return endereco; \}\
    public void setEndereco(String endereco) \{ this.endereco = endereco; \}\
\
    @Override\
    public String toString() \{\
        return super.toString() + " | Tel: " + telefone + " | End: " + endereco;\
    \}\
\}}