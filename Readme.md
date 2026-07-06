## Array
we need to import Array module to work with arrays in python or Numpy

following methods supported

we can copy existing array into another array by calling method array in which we provide two parameters first one will be typecode of array and second one will be how you want to copy 

for example:
copyarray=array(val.typecode(),(x*2 for x in val))

this method copy val array into new array by squaring each element using for loop.

1.pop
this method removes element which index will be provided, if index not provided then by default it removes last element.

2.remove
this method removes provided element. if element not present then it throughs exception.

3.insert
you can add element at the specific index using this method.

4.append
this method by default add element at the en of array.

5.index
you can use this method to find the element in your array.this method gives you the index where the provided element is present.
if element not present it gives error. 

## Slicing:
you can filter out any specific part of array by specifying index of array

a=val[starting index:ending index]

if you want to reverse array then you can also do following

a=val[::-1]

you choose all the element to iterate and then start with negative indexing which returns complete array.