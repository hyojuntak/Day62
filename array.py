array = [7,5,9,0,3,1,6,2,4,8]

for i in range(len(array)):
    min_index = i
    for j in range(i+1,len(array)):
        if array[min_index]>array[j]:
            min_index = j
    array[min_index],array[i] = array[i],array[min_index]
print(array)




## homework



num_list = list(map(int, input("숫자 입력 : ").split()))

sort_num(num_list)


def sort_num(num_list):
    
    num_list = sorted(num_list)

    return num_list











