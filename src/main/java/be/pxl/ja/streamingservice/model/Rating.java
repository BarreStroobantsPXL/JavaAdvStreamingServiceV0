package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLE_KIDS(3), OLDER_KIDS(7), TEENS(12), MATURE(16);

    Rating(int minimumAge){
        this.minimumAge = minimumAge;
    }

    private int minimumAge;

    public int getMinimumAge(){
        return minimumAge;

    }

}
