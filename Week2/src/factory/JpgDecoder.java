package factory;

public class JpgDecoder extends ImageDecoder {

		public JpgDecoder(String fileName) {
			super(fileName);
		}

		@Override
		void displayImage() {
			System.out.println("Display JPG image.");
		}

	}
	
