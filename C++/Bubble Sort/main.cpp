//
//  main.cpp
//  Bubble Sort
//
//  Created by chaitanya on 5/19/13.
//  Copyright (c) 2013 Chaitanya Bilgikar. All rights reserved.
//
// Program to perform Bubble Sort on an array

#include <iostream>
using namespace std;

void bubbleSort(int a[], int n)
{
    for (int i = 0; i < n ; i++)
    {
        for (int j = i+1; j<n ; j++)
        {
            if (a[i]>a[j])
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
}

int main()
{
    int a[10],n=10;
    cout<<endl<<"Enter the items of the array: ";
    for (int  i = 0;  i < n ; i++ )
    {
        cin>>a[i];
    }
    bubbleSort(a, n);
    cout<<endl<<"Sorted Array: ";
    for (int  j = 0;  j < n ; j++ )
    {
        cout<<a[j]<<" ";
    }
    return 0;
}

