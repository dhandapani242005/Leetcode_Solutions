/**
 * Function to find two numbers in an array that add up to a given target
 * using nested loops.
 * @param {number[]} nums - The input array of numbers.
 * @param {number} target - The target sum.
 * @return {number[]} - The indices of the two numbers that add up to the target.
 */

var twoSum = function(nums, target) {
    // Loop through each number in the array
    for (let i = 0; i < nums.length; i++) {
        // Loop through the numbers after the current one
        for (let j = i + 1; j < nums.length; j++) {
            // Check if the two numbers add up to the target
            if (nums[i] + nums[j] === target) {
                // Return their indices
                return [i, j];
            }
        }
    }
    // If no pair found, return an empty array
    return [];
};
