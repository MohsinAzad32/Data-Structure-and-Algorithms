import array

val=array.array('i',[1,2,3,4,5,6])

# for i in range(0,6):
#     print(val[i],end=" ")


# val.reverse()

# print("\n")
# for i in range(0,len(val)):
#     print(val[i],end=" ")



val.insert(1,10)

for i in range(0,len(val)):
    print(val[i],end=" ")