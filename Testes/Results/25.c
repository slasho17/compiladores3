#include<stdio.h>
#include<string.h>

int recebeDado() {
    int num;
    int numDois;
    char texto[10000];
    scanf("%d\n", &num); 
    scanf("%d\n", &numDois); 
    gets(texto);
    puts(texto);
    return (num * numDois);
}

void main() {
    int result;
    int logico;
    logico = 1;
    while(logico) {
        result = recebeDado();
        printf("%d\n", result);
        if ((result == 0)) {
            logico = 0;
        }
    }
    puts("teste sem erro");
}

