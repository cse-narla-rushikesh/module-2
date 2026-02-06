class JavaApplication{
	public static void execution(){

		    Engine engine = new Engine(1200,4,1000);
			MediaPlayer mediaPlayer = new MediaPlayer("Boat","India",63636363.635463);

			Car car = new Car("Hyundai-Creta","Crimson","India",969696.96969685, engine);

			car.displayCarInfo();
			car.getEngine().displayEngineInfo();

			// Dependency Injection - Setter Method
			car.setMediaPlayer(mediaPlayer);

			car.getMediaPlayer().displayMediaPlayerInfo();
		}
}