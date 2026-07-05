from array import *

val=array('i',[1,2,3,4,5,6])

# for i in range(0,6):
#     print(val[i],end=" ")


# val.reverse()

# print("\n")
# for i in range(0,len(val)):
#     print(val[i],end=" ")



val.insert(1,10)

# for i in range(0,len(val)):
#     print(val[i],end=" ")


copyarray=array(val.typecode,(x*3 for x in val))

for i in range(0,len(copyarray)):
    print(copyarray[i],end=" ")
