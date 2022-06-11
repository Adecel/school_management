package za.ac.cput.school_management.domain.city;

//This is a placeholder for country entity since it was not created and my class "City" need to reference it.

public class Country1 {
    private String id;
    private String name;

    public Country1(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static class Builder{
        private String id;
        private String name;

        public Builder(String id){
            this.id = id;
        }
        public Builder buildName(String name){
            this.name = name;
            return this;
        }
        public Country1 build(){
            return new Country1(this);
        }
    }
}
