//
//  main.cpp
//  Bit Change Required
//
//  Created by chaitanya on 5/19/13.
//  Copyright (c) 2013 Chaitanya Bilgikar. All rights reserved.
//
//  Program to find out the number of bit changes required to change number A to B

#include <iostream>
using namespace std;
void bitSwapReqd(int a, int b)
{
    int count = 0;
    for (   int swapsReqd = a ^ b; swapsReqd != 0 ; swapsReqd = swapsReqd >> 1)
    {
        count += swapsReqd & 1;
    }
    cout<<endl<<"The number of bit changes required to change "<<a<<" to "<<b<<" are: "<<count;
}
int main()
{
    int a,b;
    cout<<endl<<"Enter the first number: ";
    cin>>a;
    cout<<endl<<"Enter the second number: ";
    cin>>b;
    bitSwapReqd(a, b);
   
    return 0;
}

