#include <stdio.h>
#include <stdlib.h>

//function for insertion sort
void insertionSort(int arr[], int size)
{
    int key, j, i;
    for (i = 1; i < size; i++) {
        key = arr[i];
        j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}
void printArray(int arr[], int size)   //print the array
{
    int i;
    for (i = 0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}
int main()
{
    int arr[] = { 76, 34, 44, 12, 15, 1, 3};
    int size = sizeof(arr) / sizeof(arr[0]);        //get the size of the array
    insertionSort(arr, size);
    printf("Sorted array: ");
    printArray(arr, size);

    return 0;
}