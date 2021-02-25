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
	if (*balance < 0) *balance -= abs(*balance*0.10); //functie si operatii optimizate folosind operatorii din cpp
	else if (!amount) *balance -= *balance*0.05;
	else if (*balance >= amount) *balance -= amount;
}

int main() {

	double* amountArray;
	int noAmounts;
	cout<<"Number of Amounts: ";
	cin>>noAmounts;
	amountArray = new double[noAmounts];
	char textCazuri[5][75] = { "Test Caz favorabil ( adaugati balanta si amount pozitiv):    ",
	"Test Balanta negativa (adaugati balanta negativa si amount pozitiv): ",
	"Test Amount negativ (adaugati balanta pozitiva si amount negativ):   ",
	"Test Balanta < Amount (adaugati balanta < amount): ",
	"Test Amount este 0 (adaugati amount = 0 si balanta pozitiva):    " };
	cout<<"Adaugati amount-urile"<<endl;
	for(int j = 0; j < noAmounts; j++){
	    cout<<textCazuri[j];
	    cin>>amountArray[j];
	}
    
    cout<<"Adaugati balance-urile"<<endl;
	for(int i = 0; i < noAmounts; i++)
	{
		cout << textCazuri[i] << "--> ";
		double balance;
		cin>>balance;
		cout << "Balanta initiala: " << balance << " |||";
		withdraw(&balance, amountArray[i]);
		cout << " Amount: " << amountArray[i] << " |||" << " Balanta modificata: " << balance << endl;
		cout << endl;
	}
}

