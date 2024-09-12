# Function to do counting sort based on a specific digit
def counting_sort(arr, exp):
    n = len(arr)
    output = [0] * n  # Output array to store sorted values
    count = [0] * 10  # Range for base 10 digits (0-9)
    
    # Count occurrences of digits in the given array based on the exp (current digit position)
    for i in range(n):
        index = (arr[i] // exp) % 10
        count[index] += 1
    
    # Update count[i] to contain actual position of this digit in output[]
    for i in range(1, 10):
        count[i] += count[i - 1]
    
    # Build the output array
    for i in range(n - 1, -1, -1):
        index = (arr[i] // exp) % 10
        output[count[index] - 1] = arr[i]
        count[index] -= 1
    
    # Copy the sorted elements into the original array
    for i in range(n):
        arr[i] = output[i]

# Function to get the maximum value in the array
def get_max(arr):
    return max(arr)

# The main radix sort function
def radix_sort(arr):
    # Find the maximum number to know the number of digits
    max_val = get_max(arr)
    
    # Perform counting sort for each digit (ones, tens, hundreds, etc.)
    exp = 1
    while max_val // exp > 0:
        counting_sort(arr, exp)
        exp *= 10

# Example usage
if __name__ == "__main__":
    arr = [170, 45, 75, 90, 802, 24, 2, 66]
    
    print("Original Array:")
    print(arr)
    
    radix_sort(arr)
    
    print("Sorted Array:")
    print(arr)
