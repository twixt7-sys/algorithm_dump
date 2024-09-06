data = [3,5,34,5,345,7,5,64,3,4,6,7,9,8,7,6,5,4,3,90]

def merge_sort(data):
    if len(data) > 1:
        mid = len(data) // 2
        left = data[:mid]
        right = data[mid:]
        
        merge_sort(left)
        merge_sort(right)

        i = j = k = 0
        
        while i < len(left) and j < len(right):
            if left[i] < right[j]:
                data[k] = left[i]
                i += 1
            else:
                data[k] = right[j]
                j += 1
            k += 1
        
        while i < len(left):
            data[k] = left[i]
            i += 1
            k += 1
        
        while j < len(right):
            data[k] = right[j]
            j += 1
            k += 1

    return data

data = merge_sort(data)

print(data)

