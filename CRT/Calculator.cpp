#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n, choice;
    cout << "Enter the number of values you want to perform: ";
    if (!(cin >> n) || n <= 0) {
        cout << "Invalid size. Exiting.\n";
        return 0;
    }

    vector<int> arr(n);
    cout << "Enter " << n << " numbers:\n";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    cout << "1. Sum of Numbers\n";
    cout << "2. Average of Numbers\n";
    cout << "3. Maximum Number\n";
    cout << "4. Minimum Number\n";
    cout << "5. Product of Numbers\n";
    cout << "6. Subtraction of Numbers (from largest)\n";
    cout << "Enter your choice: ";
    cin >> choice;

    switch (choice) {
        case 1: { // Sum
            long long result = 0;
            for (int i = 0; i < n; i++) result += arr[i];
            cout << "Sum is = " << result << endl;
            break;
        }

        case 2: { // Average (integer)
            long long sum = 0;
            for (int i = 0; i < n; i++) sum += arr[i];
            cout << "Average is = " << (sum / n) << " (integer division)" << endl;
            break;
        }

        case 3: { // Maximum
            int mx = arr[0];
            for (int i = 1; i < n; i++) {
                if (mx < arr[i]) mx = arr[i];
            }
            cout << "Maximum = " << mx << endl;
            break;
        }

        case 4: { // Minimum
            int mn = arr[0];
            for (int i = 1; i < n; i++) {
                if (mn > arr[i]) mn = arr[i];
            }
            cout << "Minimum = " << mn << endl;
            break;
        }

        case 5: { // Product
            long long product = 1;
            for (int i = 0; i < n; i++) product *= arr[i];
            cout << "The product is " << product << endl;
            break;
        }

        case 6: { // Subtraction from largest (example)
            int maxVal = arr[0];
            int maxIndex = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] > maxVal) {
                    maxVal = arr[i];
                    maxIndex = i;
                }
            }

            long long result = maxVal;
            for (int i = 0; i < n; i++) {
                if (i != maxIndex) result -= arr[i];
            }
            cout << "Subtraction is " << result << endl;
            break;
        }

        default:
            cout << "Invalid choice." << endl;
    }

    return 0;
}