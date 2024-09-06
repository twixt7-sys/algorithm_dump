data = [3, 45, 45, 2, 6, 8, 3, 7, 9, 6, 4, 7, 8, 6, 87, 0, 6, 6]

def insertion_sort(data):
    for i in range(1, len(data)):           #for 1 to length (unsorted data)
        temp = data[i]                          # key = element i
        j = i - 1                               # iterate without repetition
        while j >= 0 and temp < data[j]:        # leftside loop (sorted data) (stops)
            data[j + 1] = data[j]               # nudge to left
            j -= 1                              # point to open space
        data[j + 1] = temp                      # set new temp
    return data

print(insertion_sort(data))