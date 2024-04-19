class LinearQueueUsingStacks:
    def __init__(self):
        self.stack1 = []
        self.stack2 = []

    def enqueue(self, item):
        while self.stack1:
            self.stack2.append(self.stack1.pop())
        self.stack1.append(item)
        while self.stack2:
            self.stack1.append(self.stack2.pop())

    def dequeue(self):
        if not self.is_empty():
            return self.stack1.pop()
        else:
            print("Queue is empty.")

    def is_empty(self):
        return len(self.stack1) == 0

queue = LinearQueueUsingStacks()
queue.enqueue(10)
queue.enqueue(20)
queue.enqueue(30)
print(queue.dequeue())
print(queue.dequeue())