package Task_8;

public class House {
    public class Room {
        private String roomName;
        private double area;

        public Room() {
        }

        public String getRoomName() {
            return roomName;
        }

        public double getArea() {
            return area;
        }

        public void setRoomName(String roomName) {
            this.roomName = roomName;
        }

        public void setArea(double area) {
            this.area = area;
        }

        public void showRoom() {
            System.out.println("This Room's name is " + roomName);
            System.out.println(" ,This Room's area is " + area);
        }
    }

    public House() {
    }
}
