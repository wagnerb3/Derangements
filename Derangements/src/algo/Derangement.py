def printDerangements(order, result):
    if len(result) == len(order):
        print(result)
        return
    for num in order:
        if num in result or num == len(result)+1:
            continue
        else:
            result.append(num)
            printDerangements(order, result)
            result.pop()


printDerangements([1, 2, 3, 4], [])