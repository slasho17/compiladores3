#include<stdio.h>
#include<string.h>

int constante() {
    int valorA;
    int valorB;
    valorA = ((1 * +2) + (+5 * -4));
    valorB = ((10 / 2) - (20 / -5));
    if ((0 || (valorB != 10))) {
        return valorA;
    }
    return valorB;
}

int multiplicar(int multA, int multB, int tipo) {
    int total;
    if ((tipo == 1)) {
        int i;
        i = 1;
        total = 0;
        while((i <= multB)) {
            total = (total + multA);
            i = (i + 1);
        }
        return total;
    }
    if ((tipo == 0)) {
        total = (multA * multB);
        return total;
    }
}

int maiorIgual(int valorAa, int valorBb) {
    if ((valorAa >= valorBb)) {
        return 1;
    }
    else {
        return 0;
    }
}

char* mensagem(char msg[]) {
    puts(msg);
    return "write";
}

void calc(int oper) {
    int valor;
    int x;
    x = (-constante() + 100);
    valor = (1 + constante());
    if ((((oper == 1) || (((x > 80) && (x < 0)) && (valor != 2))) || (valor > 50))) {
        valor = (valor + 50);
    }
}

void mensagens(char msgA[], char msgB[]) {
    char aux[10000];
    strcpy(aux,"Ola, sua mensagem:");
    printf("%s", aux);
    puts(msgA);
    printf("%s", aux);
    puts(msgB);
}

int portaAnd(int eA, int eB) {
    eA;
    eB;
    int resultado;
    if (((eA == 1) && (eB == 1))) {
        resultado = 1;
    }
    else {
        resultado = 0;
    }
    return resultado;
}

void comparador(char msgF[], int tipoComp) {
    char com[10000];
    strcpy(com,"Permitido");
    if (tipoComp) {
        strcpy(com,"Proibido");
    }
    if ((strcmp(msgF, com) == 0)) {
        printf("%s", "Acertou");
    }
}

void loopInfinito() {
    int expr;
    while(1) {
    }
}

void main() {
    int resultadoM;
    char texto[10000];
    resultadoM = multiplicar(constante(),10,1);
    calc(maiorIgual(resultadoM,10));
    strcpy(texto,mensagem("ola"));
    mensagens("Cuidado","Pode ir");
    comparador("Permitido",portaAnd(1,0));
    loopInfinito();
}

