//
//  main.cpp
//  find_loop_DLL
//
//  Created by chaitanya on 5/13/13.
//  Copyright (c) 2013 Chaitanya Bilgikar. All rights reserved.
//
//  Print the begining of a loop in a circular (corrupt) DLL

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

void make_loop(int point_to,int item)
{
    if (Head == NULL)
    {
        cout<<endl<<"Empty List!";
    }
    else
    {
        Node * last = Head;
        Node * curr,  * last_node;
        while (last!=NULL)
        {
            if (last->getdata() == point_to)
            {
                curr = last;
            }
            if( last->next == NULL)
            {
                last_node = last;
            }
            last = last->next;
        }
        Node * new_node = new Node;
        new_node->setdata(item);
      
        last_node->next = new_node;
        new_node->prev = last_node;
        
        new_node->next = curr;
    }
}

void find_loop()
{
    map<Node *, int>hash;
    if (Head == NULL)
    {
        cout<<endl<<"Empty List!";
    }
    else
    {
        Node * curr = Head;
        // add the head node to the hash table
        hash.insert(std::pair<Node *, int>(curr,1));
        while(curr!=NULL)
        {
            //check if the next node is NULL or not
            if (curr->next == NULL)
            {
                continue;
            }
            else
            {
                    //check if the next node has been seen before. If yes, then break. Else add it to the hash table
                if(hash.count(curr->next) == 0)     // next node has never been seen before - add it with count 1
                {
                    hash.insert(std::pair<Node *, int>(curr->next,1));
                }
                else        // next node has been seen before. Break.
                {
                    cout<<endl<<"Loop starts at: "<<curr->next->getdata();
                    break;
                }
            }
            curr = curr->next;
        }   // end of while
        
    }
}

int main()
{
    for (int i = 1 ; i< 10 ; i++ )
    {
        insert(i);
    }
    print();
    make_loop(4, 16);
    find_loop();
    
    
    return 0;
}

