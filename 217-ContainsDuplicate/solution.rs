use std::collections::HashSet;

impl Solution
{
    pub fn contains_duplicate(nums: Vec<i32>)->bool
    {
        let mut numbers=HashSet::new();
        nums.iter().any(|&x| !numbers.insert(x))
    }
}