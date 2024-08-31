data = [2, 45, 23, 12, 9, 56, 3, 23, 10, 32, 12]

def linear_search(data, num):
    for i in range(len(data)):
        if num == data[i]:
            print(f"Number found at index {i}")

linear_search(data, 12)