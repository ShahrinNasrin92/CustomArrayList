package com.store.storage;

public class CustomArrayList<T> {
	
	private static int SIZE_FACTOR=6;
	
    private  int size;
    private int index=0;
    private Object data[];
	public CustomArrayList() {
		super();
		this.size =  SIZE_FACTOR;
		this.data = new Object[ SIZE_FACTOR];
		
	}
	public void addStudent(T obj)
	{
		System.out.println("Size:"+this.size+" Data size:" +this.data.length+ " index:"+this.index);
		if(this.index==this.size-1)
		{
			increasespace();
		}
		
		data[this.index]=obj;
		      
		this.index++;
	}
	public void increasespace()
	{
		this.size=this.size+SIZE_FACTOR;
		Object newdata[]=new Object[this.size];
		for(int i=0;i<this.data.length;i++)
		{
			newdata[i]=data[i];
		}
		this.data=newdata;
		//System.out.println("Size:"+this.size+" Data size:" +this.data.length+ " index:"+this.index);
	}
	
	public T get(int i)
	{
		return (T) this.data[i];
	}
	
	/*
	 * public void removeStudent(int x) { System.out.println("The deleted index:"
	 * +this.data[x]); for(int i=x;i<this.data.length-1;i++) { data[i]=data[i+1]; }
	 * this.index--;
	 * 
	 * }
	 */
    
	public void remove(int i) {
		//System.out.println("Object getting removed:"+this.data[i]);
		for(int x=i; x<this.data.length-1;x++){
			data[x]=data[x+1];
		}
		this.index--;
}

}
