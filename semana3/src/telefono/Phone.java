package telefono;

public abstract class Phone {

    private String versionNumber;

    private int batteryPercentage;

    private String carrier;

    private String ringTone;

    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){

        this.versionNumber = versionNumber;

        this.batteryPercentage = batteryPercentage;

        this.carrier = carrier;

        this.ringTone = ringTone;

    }

    // METODO ABSTRACTO

    public abstract void displayInfo();
    
    //GETTERS
    
    public String getVersion() {
    	return versionNumber;
    }
    
    public int getBattery() {
    	return batteryPercentage;
    }
    
    public String getCarrier() {
    	return carrier;
    }
    
    public String getRingTone() {
    	return ringTone;
    }
	
    
    //SETTERS
    
    public void setVersion(String version) {
    	this.versionNumber = version;
    }
    
    public void setBattery(int battery) {
    	this.batteryPercentage = battery;
    }
    
    public void setCarrier(String carrier) {
    	this.carrier = carrier;
    }
    
    public void setRingtone(String ringtone) {
    	this.ringTone = ringtone;
    }
    
}
