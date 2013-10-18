//
//  main.cpp
//  remove_duplicates
//
//  Created by chaitanya on 5/13/13.
//  Copyright (c) 2013 Chaitanya Bilgikar. All rights reserved.
//
//  Remove duplicates from an unsorted Linked List (assumed to be doubly-linked list here)

#include <iostream>
#include <map>

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

void remove_duplicates()
{
    if (Head == NULL)
    {
        cout<<endl<<"Empty List!";
    }
    else
    {
        map<int, int>hash;
        Node * curr = Head;
        while (curr!=NULL)
        {
            if (hash.count(curr->getdata()) == 0)
            {
                int temp = curr->getdata();
                hash.insert(std::pair<int,int>(temp,1));
            }
            else
            {
                if (curr->next ==NULL)
                {
                    curr->prev->next = NULL;
                    curr->prev = NULL;
                }
                else
                {
                    curr->prev->next = curr->next;
                    curr->next->prev = curr->prev;
                    curr->prev = NULL;
                }
                
            }
            curr = curr->next;
        }
    }
}

int main()
{
    for(int i = 1; i<10; i++)
    {
        insert(i);
    }
    insert(9);
    insert(9);
    insert(4);
    insert(4);
    print();
    remove_duplicates();
    print();
    return 0;
}

