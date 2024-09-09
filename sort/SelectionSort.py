data = [4,6,6,3,4,6,78,89,56,4,5,7,8,98,567,46,46]

min_index = 0
for i in range(len(data) - 1):
    for j in range(i + 1, len(data)):
        if data[min_index] > data[j]:
            min_index = j
    temp = data[min_index]
    data[min_index] = data[i]
    data[i] = temp
    
print(data)