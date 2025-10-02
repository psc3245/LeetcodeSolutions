import List

class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        adjList = {i: [] for i in range(numCourses)}
        for course, prereq in prerequisites:
            adjList[course].append(prereq)
        visited = set()
        visiting = set()
        for node in range(numCourses):
            if self.hasCycle(node, adjList, visited, visiting):
                return False
        return True
    
    def hasCycle(self, node, adjList, visited, visiting):
        visiting.add(node)
        for neighbor in adjList[node]:
            if neighbor in visiting:
                return True
            elif neighbor in visited:
                pass
            else:
                if self.hasCycle(neighbor, adjList, visited, visiting):
                    return True
        visiting.remove(node)
        visited.add(node)
        return False
            

