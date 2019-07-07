#!/bin/bash

# Script para rodar todos os testes de uma vez exibir as os resultados no terminal
# Tambem armazena os resultados em arquivos dentro do diretorio /Results

rm Results/*.out

for i in {1..25}
do
	java Main Testes/$i.in Testes/Results/$i.c
	echo ================== TESTE $i =======================
	cat  Testes/Results/$i.c
	echo ===================================================
	echo
	echo
done
