public class LuckySkyScraper {

    //basic logic
   /* static public void floorList(int totalRealFloors){
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

    */
    static public int toRealFloor(int fakeFloorGoal){
        var fakeFloor = 1;
        //loop through real floor numbers
        for(var realFloor=1; realFloor <= fakeFloorGoal; realFloor++){
            if(fakeFloorGoal == fakeFloor){
                return realFloor;
            }
            do{
                fakeFloor++;
                //fakeFloor ends with 4 or ends with 13
            }while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
        }
        return -1;//Could not find real floor number
    }
}
