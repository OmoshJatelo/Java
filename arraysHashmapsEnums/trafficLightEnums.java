public enum trafficLightEnums {
    RED,
    GREEN,
    YELLOW;

    public void action(){
        if(this==RED){
            System.out.println("Stop");
        } else if (this ==YELLOW) {
            System.out.println("get ready");

        }
        else {
            System.out.println("GO");

        }
    }
}
