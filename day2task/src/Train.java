package day2task.src;

public class Train {
		private int trainno;
		private String traincode;
		private String station;
		private String Arrival;
		private String Departure;
		
		public Train(int trainno, String traincode, String station, String arrival, String departure) {
			this.trainno = trainno;
			this.traincode = traincode;
			this.station = station;
			Arrival = arrival;
			Departure = departure;
		}
		public void printStatement() {
			
			System.out.printf("%d %1s %17s %8s %11s\n", trainno,traincode,station,Arrival,Departure);

		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Yasvantpur Delhi Sarai Rohilla AC Duronto Express (12213)\r\n");
			System.out.println("-----------------------------------------------");
			System.out.println("# code    station           Arr.       Dep.");
			System.out.println("-----------------------------------------------");
			Train[] transactions = {
					new Train(1,"YPR","Yasvantpur Jn","11:00","23:40"),
					new Train(2,"GTL","Guntakal Jn","03:45","03:50"),
					new Train(3,"YPR","Sekandrabad Jn","08:55","9:00"),
					new Train(4,"YPR","Balharshah Jn","13:30","13:35"),
					new Train(5,"YPR","HabibGanj Jn","21:20","23:40"),
					new Train(6,"YPR","Jhansi Jn","01:15","23:40")
					};
			for (Train transaction : transactions) {
				transaction.printStatement();
			}

		}

	}
