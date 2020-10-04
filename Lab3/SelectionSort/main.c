#include <stdio.h>
#include <stdlib.h>

//swap the element
void swap(int *i, int *j)
{
    int temp = *i;
    *i = *j;
    *j = temp;
}
//function for selection sort
void selectionSort(int arr[], int size)
{
    int i, j, Min_Index;
    for (i = 0; i < size-1; i++)
    {
        Min_Index = i;
        for (j = i+1; j < size; j++)
          if (arr[j] < arr[Min_Index])
            Min_Index = j;
        swap(&arr[i], &arr[Min_Index]);
    }
}
void printArr(int arr[], int size)      //print the array
{
    int i;
    for(i = 0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}
int main()
{
    int arr[] = {76, 34, 44, 12, 15, 1, 4};
    int size = sizeof(arr)/sizeof(arr[0]);             //get the size of the array
    selectionSort(arr, size);
    printf("Sorted array: ");
    printArr(arr, size);

    return 0;
}
