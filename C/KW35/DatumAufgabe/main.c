#include <stdio.h>
int isLeapYear(int year);
int daysInMonth(int month, int year);
void printDateInfo(int month, int year);

int main() {
    int month ;
    int year ;
    printf("Type a month then a year\n");
    scanf("%d %d", &month, &year);
    
    printDateInfo(month, year);
    
    return 0;
}
int isLeapYear(int year){
  
     if (year % 4 == 0){
        return 1;
    }else{
        return 0;
    }
}
int daysInMonth(int days, int year){
    if(days == 1){
        return 31;
    }else if (days ==2 && isLeapYear(1)){
   return 29; 
    }else if (days ==2 && isLeapYear(0)){
        return 28;
    }else if (days == 3){
        return 31;
    }else if (days == 4){
        return 30;
    }else if (days == 5){
        return 31;
    }else if (days == 6){
        return 30;
    }else if (days == 7){
        return 31;
    }else if (days == 8){
        return 31;
    }else if (days == 9){
        return 30;
    }else if (days == 10){
        return 31;
    }else if (days == 11){
        return 30;
    }else if (days == 12){
        return 31;
    }
}
void printDateInfo(int month, int year){
    int days = daysInMonth(month, year);
    
    printf("Der Monat %d hat im Jahr %d %d Tage. \n", month, year, days);
    
    printf("Das Jahr %d ist ", year);
    if(!isLeapYear(year)){
        printf("kein ");
    }else{
        printf("ein ");
    }
    printf("Schaltjahr. \n");
}