#include <stdio.h>

int summation(int limiteSuperior){
    return (limiteSuperior)*(limiteSuperior+1)/2;
}

int main(){
    int index = 12;
    printf("%d", summation(index-1));
    return 0;
}

/*
EXPLICAÇÃO:
    Dado que a soma proposta pelo exercicio pode ser representada matematicamente pelo somatorio abaixo:
            11
            Σ(k)          //12 não esta incluso pois o teto é até < 12
            k=1
    
    E este somatorio segue o formato proposto por Gauss:
            n
            Σ(k) = 1+2+3...+(n-2)+(n-1)+(n) = n(n+1)/2
            k=1
    
    Podemos então, ao invés de realizar um brute force e calcular o valor total desse somatorio, 
utilizar o somatorio de Gauss e reduzir a complexidade do problema de um grau linear O(n) para um grau constante O(1), 
gerando uma eficiencia maior na execuçaõ do programa

            11
            Σ(k) = 11(11+1)/2 = 66
            k=1
*/
