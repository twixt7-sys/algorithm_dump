data = [0, 2, 1, 3, 4, 6, 8, 4, 9]

def get_minimum(data):
    min = 10000
    for i in range(len(data)):
        if(data[i] < min):
            min = data[i]
    print(f"The minimum is {min}")

get_minimum(data)