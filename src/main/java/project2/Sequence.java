package project2;

import java.util.Arrays;

/**
 *
 * @author oscar
 */
public class Sequence <E>
{
   private Object data[]; //Declaring data array of type Object
   private int size; //Declaring size of type int
   
   public Sequence()
   {
       data=new Object[10];
       size=10;
   }//Default constructor. Creates an array of Object type size 10
   
   public Sequence(int capacity)
   {
       data=new Object[capacity];
       size=capacity;
   }//Constructor. Creates an array of Object type size of parameter (capacity)
   
   public int size()
   {
       return this.size;
   }//Returns the size of data
   
   public void append(E element)
   {
       boolean empty=false;
       int sizeOf=size();
       int emptyElement=-1;
       if(sizeOf>0)
       {
           for(int x=0;x<sizeOf;x++)
           {
                if(data[x]==null)
                {
                   emptyElement=x;
                   empty=true;
                   break;
                }//If an empty element is found then the location is saved and breaks the loop
            }//Checks for an empty element
       }
       
       if(empty==false)
       {
           data=Arrays.copyOf(data, size+1);//Copying and creating an array of the original with one more element
           if(sizeOf==0)
           {
               data[0]=element;
           }
           else
           {
               data[size-1]=element;
           }
           size++;
       }//If the array is full then will create a new one adding 1 more size
       else
       {
           data[emptyElement]=element;
       }//else places the element in an empty element
   }//Adds extra capacity if the array is already full otherwise puts the data into the first empty element
   
   E get(int index)
   {
       return (E) data[index];
   }//returns the data at a given index
   
   void set(int index, E newElement)
   {
      data[index]=newElement; 
   }//Places or replaces data at a given index
}
