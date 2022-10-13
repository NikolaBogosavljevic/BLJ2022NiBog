int calcPow(int base, int exp){
    if(exp == 0){
        return 1; 
    }
    
    int result = base;
    
    while(exp > 1){
        exp--;
        result = result * base;
    }
    
    return result;
}

int squareRoot(int square){
    int c = 2;
    while(c > 1){
        
        if(c * c == square){
           break;
           //deleted unnecessary code
        }
        c++;
    }
    return c;
}