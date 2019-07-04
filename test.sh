#!/bin/bash

rm Results/*.out

for i in {1..30}
do
	java Main Testes/$i.in > Results/$i.out
	echo ================== TESTE $i =======================
	cat  Results/$i.out
	echo ===================================================
done
