package model;

public class ImageTbl {
	private int id;
	private String imageName;
	
	public ImageTbl() {
		super();
	}
	public ImageTbl(String imageName) {
		super();
		
		this.imageName = imageName;
	}
	public ImageTbl(int id, String imageName) {
		super();
		this.id = id;
		this.imageName = imageName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	

}
