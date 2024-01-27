public class Main {
    public static void main(String[] args) {
//        String[] nones = ArrayCreator.create(10, "none");
//
//        System.out.println(nones);

        Scale<String> scale = new Scale<>("a","b");
        Scale<Integer> scale2 = new Scale<>(1,2);

        System.out.println(scale.getHeavier());
        System.out.println(scale2.getHeavier());
    }
}
