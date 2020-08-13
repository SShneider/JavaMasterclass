public class PaintJob {
    // write your code here
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        double[] varArray = {width, height, areaPerBucket};
        for (int i = 0; i<varArray.length; i++){
            if(varArray[i]<=0) return -1;
        }
        if(extraBuckets<0) return -1;
        double wallArea = width*height;
        double bucketsNeeded = Math.ceil(wallArea/areaPerBucket-extraBuckets);
        
        return Math.max((int)bucketsNeeded, 0);
    }
      public static int getBucketCount(double width, double height, double areaPerBucket){
        double[] varArray = {width, height, areaPerBucket};
        for (int i = 0; i<varArray.length; i++){
            if(varArray[i]<=0) return -1;
        }
        double wallArea = width*height;
        double bucketsNeeded = Math.ceil(wallArea/areaPerBucket);
        return (int) bucketsNeeded;
    }
     public static int getBucketCount(double areaOfWall, double areaPerBucket){
        double[] varArray = {areaOfWall, areaPerBucket};
        for (int i = 0; i<varArray.length; i++){
            if(varArray[i]<=0) return -1;
        }
        double bucketsNeeded = Math.ceil(areaOfWall/areaPerBucket);
        return (int) bucketsNeeded;
    }
}
