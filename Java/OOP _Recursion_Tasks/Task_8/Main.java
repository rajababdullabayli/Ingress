package Task_8;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rooms");
        int numb = input.nextInt();
        String [] arrayRoomName = String[numb];
        Double [] arrayRoomArea = Double[numb];
        for (int i=0;i<numb;i++){
            System.out.println("Enter the Room's Name");
            String roomName = input.next();
            arrayRoomName[i] = roomName;
            System.out.println("Enter the Room's Area");
            double roomArea = input.nextDouble();
            arrayRoomArea[i]= roomArea;
        }
        for (int i=0;i<numb;i++){
            House house = new House();
            House.Room room = house.new Room();
            room.setRoomName(arrayRoomName[i]);
            room.setArea(arrayRoomArea[i]);
            room.showRoom();
        }
    }
}
