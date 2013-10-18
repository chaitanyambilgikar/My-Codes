//
//  main.cpp
//  add_num_no_op
//
//  Created by chaitanya on 5/18/13.
//  Copyright (c) 2013 Chaitanya Bilgikar. All rights reserved.
//
// Program that adds two numbers without using any arithematic operators

#include <iostream>
using namespace std;
int Add(int x, int y)
{
    if (y == 0)
    {
        return x;
    }
    else
    {
        return Add(x^y, (x&y) <<1);
    }
}

int main()
{

    int x,y;
    cout<<endl<<"Enter the first number: ";
    cin>>x;
    cout<<endl<<"Enter the second number: ";
    cin>>y;
    cout<<endl<<"The sum is: "<<Add(x, y);
    return 0;
}

