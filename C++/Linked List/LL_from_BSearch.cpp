//
//  main.cpp
//  LL_from_BSearch
//
//  Created by chaitanya on 5/13/13.
//  Copyright (c) 2013 Chaitanya Bilgikar. All rights reserved.
//
//  Create a linked list of all elements at depth d of a binary search tree. Do this for all depths 1 to n


#include <iostream>
using namespace std;
class treeNode
{
private:
    int data;
public:
    treeNode * leftChild;
    treeNode * rightChild;
    treeNode * parent;
    treeNode()
    {
        leftChild = NULL;
        rightChild = NULL;
        parent = NULL;
    }
    void setdata(int item)
    {
        data = item;
    }
    int getdata()
    {
        return data;
    }
}*root;

void insert (int item)
{
    if (root == NULL)   // Creating the first node
    {
        root = new treeNode;
        root->setdata(item);
    }
    else        // traverse through the tree comparing 
    {
        treeNode * curr = root;
        treeNode * newNode = new treeNode;
        newNode->setdata(item);
        while (curr != NULL)
        {
            if ( item <= curr->getdata() )
            {
                if( curr->leftChild == NULL)
                {
                    curr->leftChild = newNode;
                    newNode->parent = curr;
                    break;
                }
                else
                {
                    curr = curr->leftChild;
                }
            }
            else
            {
                if(curr->rightChild == NULL)
                {
                    curr->rightChild = newNode;
                    newNode->parent = curr;
                    break;
                }
                else
                {
                    curr = curr->rightChild;
                }
            }
        } // end of while
    } //end of if-else
}

void printTree(treeNode * curr)     //print the tree using INORDER traversal - LeftChild - Root - RightChild
{
    if (root == NULL)
    {
        cout<<endl<<"Empty Tree";
    }
    else
    {
        if (curr!=NULL)
        {
            printTree(curr->leftChild);
            cout<<" "<<curr->getdata();
            printTree(curr->rightChild);
        }
    }
}

void getQueues()
{
    
}

int main()
{
    int item;
    cout<<endl<<" Enter the Binary Tree (-1 to stop): ";
    cin>>item;
    while (item != -1)
    {
        insert(item);
        cin>>item;
    }
    printTree(root);
    
    return 0;
}

