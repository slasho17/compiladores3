#include<stdio.h>
#include<string.h>

int fatorial(int n) {
    if ((n <= 0)) {
        return 1;
    }
    else {
        return (n * fatorial((n - 1)));
    }
}

void imprima(int before, int valor, char after[]) {
    int i;
    i = 0;
    while((i < before)) {
        printf("%s", "*");
        i = (i + 1);
    }
    puts("");
    printf("%d\n", valor);
    puts(after);
}

void main() {
    imprima(50,((fatorial(5) * 2) * fatorial(3)),"        fim");
    puts("teste sem erro");
}

