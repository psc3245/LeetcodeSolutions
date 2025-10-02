import List
import collections

class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        adjList = {i: [] for i in range(numCourses)}
        for course, prereq in prerequisites:
            adjList[prereq].append(course)
    
        result = []
        queue = collections.deque()

        indegree = {i: 0 for i in range(numCourses)}
        for course, prereq in prerequisites:
            indegree[course] += 1
            
        for course in range(numCourses):
            if indegree[course] == 0:
                queue.append(course)

        while queue:
            completedCourse = queue.popleft()
            result.append(completedCourse)
            for neighbor in adjList[completedCourse]:
                indegree[neighbor] -= 1

                if indegree[neighbor] == 0:
                    queue.append(neighbor)
        if len(result) == numCourses:
            return result
        return []
