abstract class Bluetooth
{
	abstract public void OnOff();
	abstract public void pair();
	abstract public void play();
}

class BluetoothSpeaker extends Bluetooth
{
	public void OnOff()
	{
		System.out.println("On/Off Bluetooth Speaker");
	}
	public void pair()
	{
		System.out.println("Pair Bluetooth Speaker");
	}
	public void play()
	{
		System.out.println("Play Music on Bluetooth Speaker");
	}
}

class  P1
{
	public static void main(String[] args) 
	{
		Bluetooth ref = new BluetoothSpeaker();
		ref.OnOff();
		ref.pair();
		ref.play();
	}
}