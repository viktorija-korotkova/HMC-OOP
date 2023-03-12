package HW2;

public class HW2 {

    public void testHW2() {
        System.out.println("======== HW2 START ========");

        System.out.println("Given list measures:");
        Measurable[] list = getCountryList();
        for (Measurable measurable : list) {
            System.out.println(measurable.getMeasure());
        }
        System.out.println("Item with max value measure is: ");
        System.out.println(measurableMaximum(list).getMeasure());

        System.out.println("======== HW2 END ========");
    }

    public static Measurable measurableMaximum(Measurable[] objects) {
        Measurable max = objects[0];
        for (int i = 1; i < objects.length; i++) {
            if (objects[i].getMeasure() > max.getMeasure()) {
                max = objects[i];
            }
        }
        return max;
    }

    public static Measurable[] getCountryList() {
        Measurable[] array = new Measurable[5];
        array[0] = new Country(200);
        array[1] = new Country(600);
        array[2] = new Country(100);
        array[3] = new Country(10000);
        array[4] = new Country(100);
        return array;
    }
}
