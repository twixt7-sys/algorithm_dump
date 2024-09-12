data = [15,2,26,26,26,26,73,48,59,3,95,74,84,15,49,74]

def counting_sort(data):
    max_val = max(data)

    count = [0] * (max_val + 1)

    for num in data:
        count[num] += 1

    for i in range(1, len(count)):
        count[i] += count[i - 1]

    output = [0] * len(data)

    for num in data:
        output[count[num] - 1] = num
        count[num] -= 1

    for i in range(len(data)):
        data[i] = output[i]
    return data

print(counting_sort(data))