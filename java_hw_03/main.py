# Реализовать алгоритм сортировки слиянием и выборкой.(Самое эффективное, - изучить эти сортировки на Питоне,
# и постараться написать их на java)

import random


# merge sort
def merge_sort(arr):
    # last dividing of the array
    if len(arr) <= 1:
        return arr
    mid = len(arr) // 2
    # executing merge_sort by recursion from begin and from end
    left, right = merge_sort(arr[:mid]), merge_sort(arr[mid:])

    # merge both part together
    return merge(left, right, arr.copy())


def merge(left, right, merged):
    left_cursor, right_cursor = 0, 0
    while left_cursor < len(left) and right_cursor < len(right):

        # sort each other and then add to result
        if left[left_cursor] <= right[right_cursor]:
            merged[left_cursor + right_cursor] = left[left_cursor]
            left_cursor += 1
        else:
            merged[left_cursor + right_cursor] = right[right_cursor]
            right_cursor += 1

    for left_cursor in range(left_cursor, len(left)):
        merged[left_cursor + right_cursor] = left[left_cursor]

    for right_cursor in range(right_cursor, len(right)):
        merged[left_cursor + right_cursor] = right[right_cursor]

    return merged


# selection sort
def selection_sort(arr):
    for i in range(len(arr)):
        minimum = i

        for j in range(i + 1, len(arr)):
            # finding min
            if arr[j] < arr[minimum]:
                minimum = j

        # move min before sorted array
        arr[minimum], arr[i] = arr[i], arr[minimum]

    return arr


n = 16  # count of items in array
numbers = [random.randint(1, n * 100) for _ in range(n)]

if __name__ == "__main__":
    print("data          ", numbers)

    print("merge_sort    ", merge_sort(numbers))
    print("selection_sort", selection_sort(numbers))
