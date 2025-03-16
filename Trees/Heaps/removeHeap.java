

/*Set parent to 0.
3. while (true)
4. Set leftChild to (2 * parent) + 1 and rightChild to leftChild + 1.
5. if leftChild >= table.size()
6. Break out of loop.
7. Assume minChild (the smaller child) is leftChild.
8. if rightChild < table.size() and
table[rightChild] < table[leftChild]
9. Set minChild to rightChild.
10. if table[parent] > table[minChild]
11. Swap table[parent] and table[minChild].
12. Set parent to minChild.
else
13. Break out of loop*/
