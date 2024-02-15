class Solution {
    public int maxArea(int[] height) {
        int start = 0, end = height.length-1, area = 0, maxArea = 0;
        area = calculateArea(height, start, end);
        if (area>maxArea) maxArea = area;

        while (start < end) {
            if (height[start]>height[end]){
                end -= 1;
                area = calculateArea(height, start, end);
                if (area>maxArea) maxArea = area;
            } else {
                start += 1;
                area = calculateArea(height, start, end);
                if (area>maxArea) maxArea = area;
            }
        }
        return maxArea;
    }

    public int calculateArea(int[] height, int start, int end){
        int shorter = height[start];
        if (height[end]<shorter) shorter = height[end];
        int width = end-start;
        return (shorter*width);
    }
}