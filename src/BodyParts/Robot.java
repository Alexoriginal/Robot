package BodyParts;

public class Robot {
    private Head basicHead;
    private Legs basicLegs;
    private Arms basicArms;

    public Robot() {
    }

    public Robot(Head basicHead, Legs basicLegs, Arms basicArms) {
        this.basicHead = basicHead;
        this.basicLegs = basicLegs;
        this.basicArms = basicArms;
    }

    public Head getBasicHead() {
        return basicHead;
    }

    public void setBasicHead(Head basicHead) {
        this.basicHead = basicHead;
    }

    public Legs getBasicLegs() {
        return basicLegs;
    }

    public void setBasicLegs(Legs basicLegs) {
        this.basicLegs = basicLegs;
    }

    public Arms getBasicArms() {
        return basicArms;
    }

    public void setBasicArms(Arms basicArms) {
        this.basicArms = basicArms;
    }
}
