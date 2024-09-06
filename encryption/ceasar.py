key = int(input("Please enter key: "))

word = "Eternity"

for i in range(len(word)):
    newstring = chr(ord(word[i]) + key)
    print(newstring, end='')
