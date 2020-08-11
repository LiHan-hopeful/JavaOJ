class Solution {
    public int DFS(Map<Integer, Employee> info, int id)
   {
        Employee curE = info.get(id);
        int curSum = curE.importance;
        for(int curId : curE.subordinates)
       {
            curSum += DFS(info, curId);
       }
        return curSum;
   }
    public int getImportance(List<Employee> employees, int id) {
        if(employees.isEmpty()){
               return 0;
        }
        Map<Integer, Employee> info = new HashMap<>();
        for(Employee e : employees)
            info.put(e.id, e);
        return DFS(info, id);
   }
}

