# Disjoint-set/Union-find Forest
### Overview
* Method:
  - Find(x): find the root/cluster-id of x
  - Union(x,y): merge two clusters
* Specialty: check whether two elements are in the same set or not in O(1)
* Best: Find: O(1), without optimization: O(n)
* Keys to optimization
  - Path compression: make tree flat
  - Union by rank: merge low rank tree to high rank one
