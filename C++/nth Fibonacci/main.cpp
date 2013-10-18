//
//  main.cpp
//  nth Fibonacci
//
//  Created by chaitanya on 5/22/13.
//  Copyright (c) 2013 Chaitanya Bilgikar. All rights reserved.
//
//  Program to generate the nth Fibonacci Number

#include <iostream>
using namespace std;

int nthFibonacci (int k)
{
    if ( k < 1)
    {
        cout<<endl<<"Invalid value of k!";
        return -1;
    }
    else if (k == 1)
    {
        return 0;
    }
    else if ( k == 2 )
    {
        return 1;
    }
    else
    {
        return nthFibonacci ( k-1 ) + nthFibonacci ( k-2 );
    }
}

int main()
{
    int k;
    cout<<endl<<"Enter the value of k: ";
    cin>>k;
    cout<<endl<<"The kth Fibonacci Number is: "<<nthFibonacci( k );
    
    return 0;
}

