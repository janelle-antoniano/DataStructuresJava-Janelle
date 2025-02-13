# DataStructuresJava-Janelle
Data Structures and Algorithms in Java
1. Linked List Algorithm
A linked list is a linear data structure where elements (nodes) are linked using pointers. Each node contains two parts:
•	Data (stores the value)
•	Pointer (next) (points to the next node)
Functions of Linked List:
•	Insertion – Adds a new node at the beginning, middle, or end.
•	Deletion – Removes a node based on position or value.
•	Traversal – Iterates through the list to access each element.
•	Searching – Finds a particular element.
Algorithm for Inserting at the End of a Singly Linked List
Pseudocode:
INSERT(node, data):
    newNode = CREATE_NODE(data)
    IF node is NULL:
        node = newNode
    ELSE:
        temp = node
        WHILE temp.next is NOT NULL:
            temp = temp.next
        temp.next = newNode

Java Implementation:
public void insert(int data) {
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        return;
    }
    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }
    temp.next = newNode;
}

2. Queue Algorithm
A queue is a FIFO (First In, First Out) data structure, meaning elements are added at the back and removed from the front.
Functions of Queue:
•	Enqueue (Insertion) – Adds an element at the rear.
•	Dequeue (Deletion) – Removes an element from the front.
•	Front (Peek) – Returns the first element without removing it.
•	IsEmpty – Checks if the queue is empty.
Algorithm for Enqueue and Dequeue in a Queue
Pseudocode:
ENQUEUE(queue, item):
    queue.add(item)

DEQUEUE(queue):
    IF queue is empty:
        RETURN "Queue is empty"
    ELSE:
        RETURN queue.removeFirst()

Java Implementation:
public void enqueue(int item) {
    queue.add(item);
}

public int dequeue() {
    if (queue.isEmpty()) {
        throw new NoSuchElementException("Queue is empty");
    }
    return queue.removeFirst();
}

3. Stack Algorithm
A stack follows LIFO (Last In, First Out) principle, meaning the last inserted element is removed first.
Functions of Stack:
•	Push (Insertion) – Adds an element to the top.
•	Pop (Deletion) – Removes the top element.
•	Peek – Returns the top element without removing it.
•	IsEmpty – Checks if the stack is empty.
Algorithm for Push and Pop in a Stack
Pseudocode:
PUSH(stack, item):
    stack.add(item)

POP(stack):
    IF stack is empty:
        RETURN "Stack is empty"
    ELSE:
        RETURN stack.removeLast()

Java Implementation:
public void push(int item) {
    stack.add(item);
}

public int pop() {
    if (stack.isEmpty()) {
        throw new NoSuchElementException("Stack is empty");
    }
    return stack.removeLast();
}

4. Heap Algorithm
A heap is a complete binary tree that satisfies the heap property:
•	Min-Heap – Parent nodes are smaller than their children.
•	Max-Heap – Parent nodes are larger than their children.
Functions of Heap:
•	Insert – Adds an element while maintaining the heap property.
•	Delete (Extract Min/Max) – Removes the root and rebalances the heap.
•	Heapify – Maintains heap structure after insertions or deletions.
Algorithm for Insert in a Min Heap
Pseudocode:
INSERT(heap, item):
    heap.add(item)
    HEAPIFY_UP(heap, heap.size - 1)

HEAPIFY_UP(heap, index):
    parent = (index - 1) / 2
    WHILE index > 0 AND heap[index] < heap[parent]:
        SWAP heap[index] and heap[parent]
        index = parent
        parent = (index - 1) / 2

Java Implementation:
public void insert(int item) {
    heap.add(item);
    heapifyUp(heap.size() - 1);
}

private void heapifyUp(int index) {
    int parent = (index - 1) / 2;
    while (index > 0 && heap.get(index) < heap.get(parent)) {
        Collections.swap(heap, index, parent);
        index = parent;
        parent = (index - 1) / 2;
    }
}

5. Graph Algorithm
A graph consists of nodes (vertices) and edges (connections between nodes). Graphs can be directed (one-way edges) or undirected.
Functions of Graph:
•	Add Vertex – Adds a new node.
•	Add Edge – Connects two nodes.
•	Traversal (BFS/DFS) – Visits all nodes.
•	Shortest Path – Finds the shortest path between two nodes.
Algorithm for Depth-First Search (DFS)
Pseudocode:
DFS(graph, node, visited):
    PRINT node
    visited[node] = true
    FOR each neighbor in graph[node]:
        IF neighbor is NOT visited:
            DFS(graph, neighbor, visited)

Java Implementation:
public void dfs(int node, boolean[] visited) {
    System.out.print(node + " ");
    visited[node] = true;

    for (int neighbor : adjacencyList.get(node)) {
        if (!visited[neighbor]) {
            dfs(neighbor, visited);
        }
    }
}

6. Tree Algorithm
A tree is a hierarchical data structure consisting of nodes where each node has a parent and can have multiple children. A Binary Search Tree (BST) is a special type of tree where:
•	Left child < Parent
•	Right child > Parent
Functions of Trees:
•	Insert – Adds an element while maintaining order.
•	Search – Finds an element efficiently.
•	Delete – Removes an element while keeping the structure valid.
•	Traversal (Inorder, Preorder, Postorder) – Visits all nodes in a specific order.
Algorithm for Inorder Traversal in a Binary Search Tree (BST)
Pseudocode:
INORDER(node):
    IF node is NOT NULL:
        INORDER(node.left)
        PRINT node.data
        INORDER(node.right)

Java Implementation:
public void inorder(TreeNode node) {
    if (node != null) {
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
}

