//
//  main.cpp
//  n_to_last_LL
//
//  Created by chaitanya on 5/12/13.
//  Copyright (c) 2013 Chaitanya Bilgikar. All rights reserved.
//
//  Code to find the nth to last element in a Linked List (assumed to be singly-linked list here)


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
    
}*Head;

void insert(int item)
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

void print()
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

void del()
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
void n_to_last(int n)
{
    if (Head == NULL)
    {
        cout<<endl<<"Empty List!";
    }
    else
    {
        Node * p1 = Head;
        Node * p2 = Head;
        for (int i = 0; i<n && p2!= NULL; i++)
        {
            p2 = p2->next;
        }
        if (p2 == NULL)
        {
            cout<<endl<<"List length shorter than "<<n;
        }
        else
        {
            while (p2->next != NULL)
            {
                p1 = p1->next;
                p2 = p2->next;
            }
            cout<<endl<<n<<"th from last is: "<<p1->getdata();
        }
    }
}
int main()
{
    for(int i = 1; i<10 ; i++)
    {
        insert(i);
    }
    print();
    int n;
    cout<<endl<<"Enter the value of n: ";
    cin>>n;
    n_to_last(n);
    
    return 0;
}

