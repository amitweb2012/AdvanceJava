package recordPkg;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Amit", "amit@gmail.com", 19, "test address");
        System.out.println(student.toString());
        System.out.println(student.name());
        student.displayName();
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1; // Invalid input
        }

        double totalArea = width * height;
        double areaCoveredByExtras = extraBuckets * areaPerBucket;
        double remainingArea = totalArea - areaCoveredByExtras;

        if (remainingArea <= 0) {
            return 0; // No additional buckets needed
        }

        int bucketsNeeded = (int) Math.ceil(remainingArea / areaPerBucket);
        return bucketsNeeded;
    }
}
