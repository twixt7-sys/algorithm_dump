# only works on sorted data
# time complexity: O(log(n))
# space complexity: O(1)

def binary_search(data, number):
    start_index = 0
    end_index = len(data) - 1               # always deduct 1 if dealing with indexed = non-indexed data
    while start_index <= end_index:
        middle_index = (start_index + end_index) // 2
        if number < data[middle_index]:
            end_index = middle_index - 1
        elif number > data[middle_index]:
            start_index = middle_index + 1
        else:
            print(f"Number found at index {middle_index}")
            return
    print("Number not found")

data = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
binary_search(data, 3)