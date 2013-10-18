//
//  main.cpp
//  add_num_LL
//
//  Created by chaitanya on 5/14/13.
//  Copyright (c) 2013 Chaitanya Bilgikar. All rights reserved.
//
// Represent each number as a linked list. Input two numbers and add them. The result is also a linked list.

#include <iostream>
using namespace std;


class Node
{
private:
    int data;
public:
    Node * next;
    Node ()
    {
        next = NULL;
    }
    
    void setdata(int i)
    {
        data = i;
    }
    int getdata()
    {
        return data;
    }
    
}*num1,*num2,*sum;

void insert(int item, Node *& Head)
{
    if (Head == NULL)
    {
        Head = new Node;
        Head->next = NULL;
        Head->setdata(item);
    }
    else
    {
        Node * temp = Head;
        while (temp->next!=NULL)
        {
            temp = temp->next;
        }
        Node * last = new Node;
        last->setdata(item);
        last->next = NULL;
        temp->next = last;
        
    }
}

void print(Node * Head)
{
    if( Head == NULL )
    {
        cout<<endl<<"Empty List!";
    }
    else
    {
        Node * curr = Head;
        cout<<endl<<"List is: ";
        while (curr!=NULL)
        {
            cout<<curr->getdata();
            curr = curr->next;
        }
        cout<<endl;
    }
}

void del(Node * &Head)
{
    if (Head == NULL)
    {
        cout<<endl<<"Empty List!";
    }
    else
    {
        cout<<endl<<"Item Deleted: "<<Head->getdata();
        Head = Head->next;
    }
}
void getNumbers()
{
    int item;
    cout<<endl<<"Enter the first number: ";
    cin>>item;
    while (item>0)
    {
        int d = item%10;
        insert(d, num1);
        item = item/10;
    }
    
    cout<<endl<<"Enter the second number: ";
    cin>>item;
    while (item > 0)
    {
        int d = item %10;
        insert(d, num2);
        item = item /10;
    }
    
    
}

void add (Node * n1, Node * n2)
{
    
}
int main()
{
    getNumbers();
    print(num1);
    print(num2);
    
    return 0;
}

