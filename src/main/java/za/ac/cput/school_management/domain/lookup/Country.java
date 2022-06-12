package za.ac.cput.school_management.domain.lookup;

/*
 * Author : Mogamad Tawfeeq Cupido
 * Student Number : 216266882
 *(Term 2 Exam)
 * */

public class Country {
	private String id;
	private String name;


private Country(Builder builder){
    this.id = builder.id;
	this.name = builder.name;

}

 public String getId() {
        return id;
    }

 public String getName() {
        return name;
    }

 public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

@Override
    public String toString() {
        return "Country{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

       //Builder
    public static class Builder {
        private String id;
        private String name;
      
        //Builder setters

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public Country build() {
            return new Country(this);
        }
    }
}
