#include <iostream>;
#include <cmath>;

/*
	Sa se implementeze functia withdraw ce accepta doi parametri:
	- balance - reprezinta balanta contului curent
	- amount - reprezinta suma pe care dorim sa o extragem din cont
	Functia trebuie sa respecte urmatoarele cerinte:
	- La apelul functiei withdraw se va extrage din balanta suma dorita
	(Exemplu: In urma apelului withdraw(2000, 1000), balanta va avea valoarea 1000)
	- Daca balanta este negativa si se incearca efectuarea unei tranzactii
	se va aplica o penalizare de 10% asupra balantei, fara a efectua tranzactia
	(Exemplu: pentru o balanta de -1000, la incercarea efectuarii unei tranzactii
	balanta va avea valoarea de -1100).
	- Daca suma pe care dorim sa o extragem este negativa, se va efectua operatia de
	depunere. (pentru o balanta de 1000, la apelul functiei cu un amount de -200, vom
	obtine balanta cu valoarae 1200)
	- Daca suma dorita este mai mare decat valoarea balantei, nu se va efectua nicio operatie
	- Daca se va efectua operatia de withdraw cu amount 0, se va aplica o penalizare de 5% asupra balantei

*/

using namespace std;

void withdraw(double *balance, double amount) {
	if (*balance < 0){
	    *balance = *balance - *balance*0.10; //#1 Optimizez if-ul si steatement-ul din if 
	} 
	
	if (amount==0){  //#2 Validare irelevanta, inlocuim cu !amount
	    *balance = *balance - *balance*0.05;
	} 
	
	if (*balance >= amount){
	    *balance = *balance - amount;
	}  //#3 cazuri mutual exclusive => Adaugam else if-uri
}

int main() {

	double amount[5] = { 500,500,-500,5000,0 }; //#4 valori hardocodate => adaugam un cin>> //#5 array alocat static => alocam dinamic creem variabila care stocheaza numarul de amount-uri
	char text[5][24] = { "Test Caz favorabil:    ","Test Balanta negativa: ","Test Amount negativ:   ","Test Balanta < Amount: ","Test Amount este 0:    " };

	for (int i = 0; i < 5; i++) //#6 for hardcodat 
	{
		cout << text[i] << "--> ";
		double balance = 2000; //#7 valoare hardcodata => adaugam cin>> 
		if (i == 1) balance = -balance; //#8 if redundant dupa noile reguli
		cout << "Balanta initiala: " << balance << " |||";
		withdraw(&balance, amount[i]);
		cout << " Amount: " << amount[i] << " |||" << " Balanta modificata: " << balance << endl;
		cout << endl; //#9 cout redundant
	}
}

