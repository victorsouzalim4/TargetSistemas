#include <stdio.h>

int summation(int index){
    int sum = 0;
    for(int k = 1; k < index; k++){
        sum += k;
    }
    return sum;
}

int main(){
    printf("%d", summation(12));
    return 0;
}

//RESP = 66