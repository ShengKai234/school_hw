#include <iostream>
#include <fstream>

using namespace std;

void main() {

	int minNum, maxNum, ans;
	int guess = NULL;

	//open file
	ifstream fileInput;
	fileInput.open("input.txt", ios::in);
	if (!fileInput) {
		cout << "File is fail" << endl;
		system("pause");
	}

	//read file min¡Bmax and answer
	fileInput >> minNum >> maxNum >> ans;

	//Start guess number
	while (guess != ans)
	{
		if (guess > minNum && guess < maxNum || guess == NULL)
		{
			if (guess < ans && guess) minNum = guess; 
			else if(guess) maxNum = guess;
			cout << "Pleas guess a integer number between " << minNum << " and " << maxNum << endl;
		}
		else
		{
			cout << "Your enter number not in range " << minNum << " and " << maxNum << endl << "Please try again" << endl;
		}
		cin >> guess;
	}
	cout << "Bingo!!" << endl;
	system("pause");
}