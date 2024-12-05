package com.ecld.java.assesment2a;

public abstract class LibraryItem {
    protected String id;
    protected String title;
    protected boolean available;

    public LibraryItem(String id, String title) {     //constructor
        this.id = id;
        this.title = title;
        this.available = true;
    }

    public String getId() {    //getter
        return id;
    }

    public String getTitle() {   //getter
        return title;
    }

    public boolean isAvailable() {  //getter
        return available;
    }

    public void setAvailable(boolean available) {   //setter
        this.available = available;
    }

    public abstract double calculateLateFee(int daysLate);

}
