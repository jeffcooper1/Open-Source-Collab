#Bugs introduced+OD

def remove_duplicates(arr):
    # sorts array
    arr.sort()
    unique_arr = []
    removed_elements = []
    # iterates through the array
    for i in range(len(arr)):
        # if i is 0 or not equal to the last element, append to unique array
        if i == 0 or arr[i] != arr[i-1]:
            unique_arr.append(arr[i])
        else:
            # else, append the element to the removed_elements list
            removed_elements.append(arr[i])
    return unique_arr, removed_elements

# Test the function
arr = [1, 2, 2, 3, 4, 4, 5]
unique_arr, removed_elements = remove_duplicates(arr)
print("Original array:", arr)
print("Unique array:", unique_arr)
print("Removed elements:", removed_elements)
