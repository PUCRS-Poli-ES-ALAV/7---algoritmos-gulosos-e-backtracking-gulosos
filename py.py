def displaySubset(subSet, subSize):
    for i in range(subSize):
        print(subSet[i], end="  ")
    print()

def subsetSum(set, subSet, n, subSize, total, nodeCount, sum):
    if total == 0:
        displaySubset(subSet, subSize)

    for i in range(nodeCount, n):
        subSet[subSize] = set[i]
        subsetSum(set, subSet, n, subSize + 1, total + set[i], i + 1, sum)

def findSubset(set, size, sum):
    subSet = [0] * size
    subsetSum(set, subSet, size, 0, 0, 0, sum)

if __name__ == "__main__":
    weights = [i for i in range(-2, 51) if i != 0]
    print("Pesos:", weights)
    
    size = len(weights)
    
    findSubset(weights, size, 0)
