'''
    This method represents the non recursive implementation of linear search. It
    searches for the specified key within the given list and returns the result

    @param key value which is searched for.
    @param valuesList this is the list to be searched for the availability the of key.
    @return int valuesList index in which the value is located at or -1 if the value is not
             available within the array.
'''


def linear_search_non_recursive(key, valuesList):
    if valuesList is not None and len(valuesList) > 0:
        for index in range(len(valuesList)):
            if key == valuesList[index]:
                return index
    return -1


'''
    This method evaluvates the output index (which is passed as the resultIndex paramter) from linear search functions and
    if the result is not equals to -1 then a message will be displayed as "Value found at index <index>" (ex : Value found at index 3).

    If the result is -1 then this will produce the output "Value not found"
'''


def display_result(resultIndex):
    print(f'Value found at index {resultIndex}' if (resultIndex is not None and resultIndex != -1) else 'Value not found')


def main():
    numbers = [23, 34, 56, 78, 89, 45, 2, 5]
    print('\nExecuting linear_search_non_recursive function')
    display_result(linear_search_non_recursive(23, numbers))  # Value found at index 0
    display_result(linear_search_non_recursive(78, numbers))  # Value found at index 3
    display_result(linear_search_non_recursive(5, numbers))  # Value found at index 7

    # Value not found
    display_result(linear_search_non_recursive(-23, numbers))
    display_result(linear_search_non_recursive(654, numbers))  # Value not found
    display_result(linear_search_non_recursive(654, None))  # Value not found
    display_result(linear_search_non_recursive(654, []))  # Value not found


if __name__ == '__main__':
    main()
