#include <stdio.h>
#include <stdlib.h>

//swap the element
void swap(int *i, int *j)
{
    int temp = *i;
    *i = *j;
    *j = temp;
}
//function for bubble sort
void bubbleSort (int arr[], int size)
{
    for(int i = 0; i < size-1; i++)
        for(int j = 0; j < size-i-1; j++)
            if(arr[j] > arr[j+1])
                swap(&arr[j], &arr[j+1]);
}
void printArr(int arr[], int size)  //print the array
{
    int i;
    for(i = 0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}
int main()
{
    int arr[] = {76, 34, 44, 12, 15, 1, 2};
    int size = sizeof(arr)/sizeof(arr[0]);        //get the size of the array
    bubbleSort(arr, size);
    printf("Sorted array: ");
    printArr(arr, size);

    return 0;
}
