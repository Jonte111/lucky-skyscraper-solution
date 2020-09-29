public class Main {
    public static void main(String[] args) {
        //System.out.println(LuckySkyScraper.toRealFloor(15));
        for(var floor = 1; floor <= 220; floor++){
            System.out.println("floor " + floor);
            var fakeFloor = LuckySkyScraper.toFakeFloor(floor);
            System.out.println("fake floor: " + fakeFloor);
            var backToRealFloor = LuckySkyScraper.toRealFloor(fakeFloor);
            System.out.println("back to real: " + backToRealFloor);
        }
    }
}
