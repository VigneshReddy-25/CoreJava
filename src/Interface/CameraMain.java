package Interface;

public class CameraMain {
	
	public static void takePhoto(Camera cam) {
		cam.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camera cam=new SamsungCamera();
		CameraMain.takePhoto(cam);
	}

}
