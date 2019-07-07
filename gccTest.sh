# !/bin/bash

# Script para testar se o codigo gerado pelo compilador esta
# compilando corretamente em C

# Para usar: passe o numero do caso de teste como argumento [1-25]

n_test=$1

if [ $n_test -lt 0 ] || [ $n_test -gt 25 ];
then
    echo "O argumento deve ser um valor entre 0 e 25"
    exit 1
fi

java Main Testes/$n_test.in auxGccTest.c

gcc auxGccTest.c -o exGccTest
./exGccTest
rm exGccTest
