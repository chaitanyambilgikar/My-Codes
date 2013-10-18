//
//  main.cpp
//  Queue_DLL
//
//  Created by chaitanya on 5/12/13.
//  Copyright (c) 2013 Chaitanya Bilgikar. All rights reserved.
//
//  Doubly-linked list implemented as a Queue
//  Insertion - insert(), Deletion - del(), Printing - print()

#include <iostream>

using namespace std;

class Node
{
private:
    int data;
public:
    Node * next;
    Node * prev;
    
    Node()
    {
        next = NULL;
        prev = NULL;
    }
    int getdata()
    {
        return data;
    }
    void setdata(int item)
    {
        data = item;
    }
}*Head;

void insert(int item)
{
    if (Head == NULL)
    {
        Head = new Node;
        Head->setdata(item);
    }
    else
    {
        Node * temp = Head;
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        Node * new_node = new Node;
        new_node->setdata(item);
        new_node->prev = temp;
        temp->next = new_node;
    }
}

void print()
{
    if (Head == NULL)
    {
        cout<<endl<<"Empty List!";
    }
    else
    {
        Node * curr = Head;
        cout<<endl<<"List:";
        while (curr != NULL)
        {
            cout<<" "<<curr->getdata();
            curr = curr->next;
        }
    }
}

void del()
{
    if(Head == NULL)
    {
        cout<<endl<<"Empty List!";
    }
    else
    {
        cout<<endl<<"Item deleted was: "<<Head->getdata();
        Head = Head->next;
        Head->prev = NULL;
    }
}

int main()
{
    for (int i = 1; i<10; i++)
    {
        insert(i);
    }
    print();
    del();
    print();
    return 0;
}

