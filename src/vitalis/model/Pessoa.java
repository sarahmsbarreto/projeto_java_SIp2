{\rtf1\ansi\ansicpg1252\cocoartf2822
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\froman\fcharset0 Times-Roman;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww16700\viewh19680\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf0 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 package vitalis.model;\
\
public abstract class Pessoa \{\
    private String nome;\
    private String cpf;\
\
    public Pessoa(String nome, String cpf) \{\
        this.nome = nome;\
        this.cpf = cpf;\
    \}\
\
    public String getNome() \{ return nome; \}\
    public void setNome(String nome) \{ this.nome = nome; \}\
    public String getCpf() \{ return cpf; \}\
    \
    @Override\
    public String toString() \{\
        return "Nome: " + nome + " | CPF: " + cpf;\
    \}\
\}}