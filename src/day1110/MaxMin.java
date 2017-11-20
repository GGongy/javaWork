package day1110;

public class MaxMin {
    public static class Result{
        private double max;
        private double mix;

        public Result(double max, double mix){
            this.max = max;
            this.mix = mix;
        }

        public double getMax() {
            return max;
        }

        public double getMix() {
            return mix;
        }
    }
    public static Result getResult(double[] arr){
        double max = Double.MIN_VALUE;
        double mix = Double.MAX_VALUE;
        for (double i : arr){
            if (i > max) {
                max = i;
            }
            if (i < mix) {
                mix = i;
            }
        }

        return new Result(max,mix);
    }

    public static void main(String[] args) {
        double[] arr = new double[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 100*Math.random();
        }
        System.out.println("源数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        double max = MaxMin.getResult(arr).getMax();
        System.out.println("最大值：" + max);
        double mix = MaxMin.getResult(arr).getMix();
        System.out.println("最小值：" + mix);
    }
}
