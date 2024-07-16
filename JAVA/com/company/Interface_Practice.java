package com.company;
interface MyCamera{
    void TakeSnap();
    void RecordVideo();
    private void PortraitMode(){
        System.out.println("Opening Portrait Mode");
    }
    default void BokehMode(){
        PortraitMode();
        System.out.println("Opened Bokeh Mode");
    }
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int PhoneNumber){
        System.out.println("Calling Number..." + PhoneNumber);
    }
    void disconnectCall(){
        System.out.println("Disconnecting Call...");
    }
}
class MySmartphone extends MyCellPhone implements MyCamera,MyWifi{
    @Override
    public String[] getNetworks() {
        System.out.println("Getting Networks");
        String[] networkList = {"JioFiber-Bhumit","NEHA","RailWire"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }

    @Override
    public void TakeSnap() {
        System.out.println("Taking Snap...");
    }

    @Override
    public void RecordVideo() {
        System.out.println("Recording Video...");
    }
}
public class Interface_Practice {
    public static void main(String[] args) {
        MySmartphone ms = new MySmartphone();
        ms.TakeSnap();
        ms.RecordVideo();
        ms.BokehMode();
        String[] arr = ms.getNetworks();
        for (String item:arr){
            System.out.println(item);
        }
    }
}
