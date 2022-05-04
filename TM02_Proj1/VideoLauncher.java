package Project1;

import java.util.*;

class Video{
	String videoName;
	boolean checkout;
	int rating;
	public Video(){	
	}
	
	public Video(String name)
	{
		videoName=name;
	}
	String getName()
	{
		return videoName;
	}
	
	void doCheckout()
	{
		checkout = true;
	}
	
	void doReturn()
	{
		checkout = false;
	}
	
	void reciveRating(int rating)
	{
		this.rating = rating;
	}
	
	int getRating() {
		return rating;
	}
	
	boolean getCheckout() {
		return checkout;
	}
	
	
}

class VideoStore{
	Video[] store;
	int checkVideo(String name) {
		int flag = 0;
		for(Video video:store) {
			if(video.getName().equals(name))
				flag = 1;
		}
		return flag;
	}
void addVideo(String name) {
	int size;
	Video video = new Video(name);
	try {
		size = store.length;
	}catch (Exception e){
		size = 0;
	}
	Video[] newStore = new Video[size+1];;
	newStore[size] = video;
	store = newStore;
}
void doCheckout(String name){
	if(store == null || store.length ==0) {
		System.out.println("Store is empty");
		return ;
	}
	for(Video video : store) {
		if(video.getName().equals(name)) {
			video.doCheckout();
		}
	}
}
void doReturn(String name) {
	if(store==null || store.length==0) {
		System.out.println("Store is empty");
		return;
	}
	for(Video video : store) {
		if(video.getName().equals(name)) {
			video.doReturn();
		}
	}
}
void receiveRating(String name , int rating) {
	if(store[0].videoName.equals(name))
	{
		store[0].reciveRating(rating);
	}

}
void listInventory(){
	if(store == null || store.length == 0) {
		System.out.println("Store is empty");
		return;
	}
	
		System.err.println("-------------------------------------------------------------------------");
		System.err.printf("\t%-20s\t|\t%-10s\t|\t%-15s\n", "Video Name","Checkout Status","Rating");
		System.err.printf("\t%-20s\t|\t%-10s\t|\t%-15s\n", store[0].getName(), store[0].getCheckout(),store[0].getRating());
		System.err.println("-------------------------------------------------------------------------");
	
}
}

public class VideoLauncher {

	public static void main(String[] args) {
		int input = 0;
		Scanner sc=  new Scanner(System.in);
		VideoStore videoStore = new VideoStore();
		
		while(input !=6) {
			System.out.println("MAIN MENU \n=========");
			System.out.println("1. Add Videos:");
			System.out.println("2. Check Out Video:");
			System.out.println("3. Return Video:");
			System.out.println("4. Receive Rating:");
			System.out.println("5. List Inventory:");
			System.out.println("6. Exit:");
			System.out.print("Enter your choice(1..6): ");
			String name;
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input) {
			case 1:
				System.out.println("Enter the name of the video you want to add: ");
				name = sc.nextLine();
				videoStore.addVideo(name);
				System.err.println("Video "+'"' +name+'"' + " added successfully");
				break;
				
			case 2:
				System.out.println("Enter the name of the video you want to check out: ");
				name = sc.nextLine();
				if(videoStore.checkVideo(name)== 0)
				{
					System.err.println("Video does not exist");
				}
				else
				{
					videoStore.doCheckout(name);
					System.err.println("video "+ name +" checked out successfully");
				}
				break;
				
			case 3:
				System.out.println("Enter the name of the video you want to return");
				name = sc.nextLine();
				if(videoStore.checkVideo(name)==0)
				{
					System.err.println("Video does not exist");
				}
				else {
					videoStore.doReturn(name);
					System.err.println("video "+ name + " returned successfully.");
				}
				break;
			case 4:
				System.out.println("Enter the name of the video you want to rate: ");
				
				name = sc.nextLine();
				if(videoStore.checkVideo(name)==0){
					System.err.println("Video does not exis");
				}
				else {
					System.out.println("Enter the rating of this video: ");
					int rating = sc.nextInt();
					videoStore.receiveRating(name,rating);
					System.err.println("Rating "+'"'+rating+'"'+" has been mapped to the Video "+'"'+name+'"');
				}
			case 5:
				videoStore.listInventory();
				break;
			default: 
				System.err.println("Exiting ...!! Thanks for using the application");
				break;
			}
			
		}
		sc.close();
	}

}
