//
//  main.cpp
//  Trials
//
//  Created by chaitanya on 5/11/13.
//  Copyright (c) 2013 Chaitanya Bilgikar. All rights reserved.
//
//  Singly - Linked Lists as a queue
//  Insertion insert() , deletion del() and printing print()

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

//****************** main ********************************
int main()
{
    for (int i = 0; i< 10 ; i++ )
    {
        insert(i);
    }
    print();
    del();
    print();
    
    return 0;
}

