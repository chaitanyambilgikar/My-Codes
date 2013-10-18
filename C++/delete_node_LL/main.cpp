//
//  main.cpp
//  delete_node_LL
//
//  Created by chaitanya on 5/14/13.
//  Copyright (c) 2013 Chaitanya Bilgikar. All rights reserved.
//
//   Delete a node from a singly-linked list.


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
            cout<<" "<<curr->getdata();
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

void del_selected(int item)
{
    if (Head == NULL)
    {
        cout<<endl<<"Empty List!";
    }
    else
    {
        Node * curr = Head;
        Node * prev = NULL;
        
        while (curr != NULL)
        {
            if ( curr->getdata() == item )
            {
                cout<<endl<<"Item deleted: "<<curr->getdata();
                if (curr == Head)
                {
                    Head = curr->next;
                }
                else
                {
                    prev->next = curr->next;
                }
                break;
            }
            else
            {
                prev = curr;
                curr = curr->next;
            }
        }
    }
}

int main()
{
    for (int i = 1; i<=10; i++)
    {
        insert(i);
    }
    print();
    del_selected(1);
    print();
   
    return 0;
}

