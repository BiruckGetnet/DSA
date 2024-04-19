class LinearQueue:
    def __init__(self):
        self.queue = []

    def enqueue(self, item):
        self.queue.append(item)

    def dequeue(self):
        if not self.is_empty():
            return self.queue.pop(0)
        else:
            print("Queue is empty.")

    def is_empty(self):
        return len(self.queue) == 0

# Example usage:
queue = LinearQueue()
queue.enqueue(10)
queue.enqueue(20)
queue.enqueue(30)
print(queue.dequeue())  # Output: 10
print(queue.dequeue())  # Output: 20