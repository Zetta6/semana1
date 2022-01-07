package telefono;

public class Iphone extends Phone implements Ringable {

	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	@Override
	public String ring() {
		String ringtone = getRingTone();
		return ringtone;
	}

	@Override
	public String unlock() {
		String lock = "Haz desbloquedo el telefono";
		return lock;
	}

	@Override
	public void displayInfo() {
		String version = getVersion();
		int battery = getBattery();
		String carrier = getCarrier();
		String ring = getRingTone();
		
		System.out.println("La version del dispositivo es: " + version +
				"\nBateria actual: " + battery + "%" +
				"\nSu portador es: " + carrier +
				"\nTono de llamada: " + ring);
	}

}
