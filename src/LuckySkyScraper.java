public class LuckySkyScraper {
    static public void floorList(int totalRealFloors){
        var fakeFloor = 1;
        //loop through real floor numbers
        for(var realFloor=1; realFloor <=totalRealFloors; realFloor++){
            System.out.println("realFloorNo:" + realFloor + " fakeFloor " + fakeFloor);
           do{
               fakeFloor++;
            //fakeFloor ends with 4 or ends with 13
           }while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
        }
    }
}
