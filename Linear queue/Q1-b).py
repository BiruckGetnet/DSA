class CircularQueue:
    def __init__(self, capacity):
        self.queue = [None] * capacity
        self.front = self.rear = -1
        self.capacity = capacity

    def enqueue(self, item):
        if self.is_full():
            print("Queue is full.")
        elif self.is_empty():
            self.front = self.rear = 0
            self.queue[self.rear] = item
        else:
            self.rear = (self.rear + 1) % self.capacity
            self.queue[self.rear] = item

    def dequeue(self):
        if self.is_empty():
            print("Queue is empty.")
        elif self.front == self.rear:
            item = self.queue[self.front]
            self.front = self.rear = -1
            return item
        else:
            item = self.queue[self.front]
            self.front = (self.front + 1) % self.capacity
            return item

    def is_empty(self):
        return self.front == -1

    def is_full(self):
        return (self.rear + 1) % self.capacity == self.front


queue = CircularQueue(5)
queue.enqueue(10)
queue.enqueue(20)
queue.enqueue(30)
print(queue.dequeue())
print(queue.dequeue())