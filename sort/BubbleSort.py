data = [3,4,6,6,3,5,6,8,98,987,685,74,6,26,78,59,60,17,92]

for i in range(len(data) - 1):
    for j in range(len(data) - i - 1):
        if data[j] < data[j + 1]:
            temp = data[j]
            data[j] = data[j + 1]
            data[j + 1] = temp

print(data)