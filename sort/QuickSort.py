data = [3,5,3,4,6,6,5,5,452,436,457]

def QuickSort(data):
    if len(data) <= 1:
        return data
    else:
        pivot = data[len(data) // 2]                        # pivot is the data in the middle
        left = [x for x in data if x < pivot]               # list of data to the left of pivot
        middle = [x for x in data if x == pivot]            # number equal to pivot
        right = [x for x in data if x > pivot]              # list of data to the right of pivot
        return QuickSort(left) + middle + QuickSort(right)  # return the whole list

print(QuickSort(data))