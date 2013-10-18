//
//  main.cpp
//  Float to Binary
//
//  Created by chaitanya on 5/19/13.
//  Copyright (c) 2013 Chaitanya Bilgikar. All rights reserved.
//
//  Convert a Floating point number to its binary representation.
// The bitset method I am not so sure about. Uncomment to run it.

#include <iostream>
#include <bitset>
using namespace std;

/*
union floater
{
    float input;
    int output;
    
}data;
 void float2binary()
 {
 cout<<endl<<"Enter a floating point number: ";
 cin>>data.input;
 bitset<sizeof(float)* CHAR_BIT > bits (data.output);
 cout<<endl<<"The binary representaion is: "<<bits;
 }
 
 */

void float2binary()
{
    float input;
    cout<<endl<<"Enter a floating point number: ";
    cin>>input;
    int integer = input;
    input = input - integer;
    cout<<endl<<"INT: "<<integer<<" DEC: "<<input;
    cout<<endl<<"Binary representation of Integer part (read right to left): ";
    while (integer > 0)
    {
        cout<<integer%2;
        integer/=2;
    }
    cout<<endl<<"Binary representaion of fractional part: ";
    while (input < 1)
    {
        int temp = input*2;
        cout<<temp;
        input*=2;
    }
    
}

int main()
{
    float2binary();
    return 0;
}

