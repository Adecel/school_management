package za.ac.cput.school_management.domain.lookup;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Objects;

public class Address {

    private String unitNumber;
    private String complexName;
    private String streetNumber;
    private String streetName;
    private String postalCode;
    @ManyToOne
    @JoinColumn(name = "city_id", updatable = false, insertable = false) //I have add this dont remote we gona use it the controller
    private City city;


    public Address() {
    }

    public Address(String unitNumber, String complexName, String streetNumber, String streetName, String postalCode, City city) {
        this.unitNumber = unitNumber;
        this.complexName = complexName;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.city = city;
    }

    private Address(Builder builder)
    {
        this.unitNumber = builder.unitNumber;
        this.complexName = builder.complexName;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.postalCode = builder.postalCode;
        this.city = builder.city;
    }

    public String getUnitNumber()
    {
        return unitNumber;
    }

    public String getComplexName()
    {
        return complexName;
    }

    public String getStreetNumber()
    {
        return streetNumber;
    }

    public String getStreetName()
    {
        return streetName;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public City getCity()
    {
        return city;
    }

    protected void setUnitNumber(String unitNumber)
    {
        this.unitNumber = unitNumber;
    }

    protected void setComplexName(String complexName)
    {
        this.complexName = complexName;
    }

    protected void setStreetNumber(String streetNumber)
    {
        this.streetNumber = streetNumber;
    }

    protected void setStreetName(String streetName)
    {
        this.streetName = streetName;
    }

    protected void setPostalCode(String postalCode)
    {
        this.postalCode = postalCode;
    }

    protected void setCity(City city)
    {
        this.city = city;
    }

    @Override
    public String toString()
    {
        return "Address{" +
                "unitNumber='" + unitNumber + '\'' +
                ", complexName='" + complexName + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city=" + city +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return getUnitNumber().equals(address
                .getUnitNumber()) && getComplexName()
                .equals(address.getComplexName()) && getStreetNumber()
                .equals(address.getStreetNumber()) && getStreetName()
                .equals(address.getStreetName()) && getPostalCode().equals(address
                .getPostalCode())
                && getCity().equals(address.getCity());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getUnitNumber(), getComplexName(), getStreetNumber(),
                getStreetName(), getPostalCode() ,getCity());

    }

    public static class Builder
    {
        private String unitNumber;
        private String complexName;
        private String streetNumber;
        private String streetName;
        private String postalCode;
        private City city;

        public Builder setUnitNumber(String unitNumber)
        {
            this.unitNumber = unitNumber;
            return this;
        }

        public Builder setComplexName(String complexName)
        {
            this.complexName = complexName;
            return this;
        }

        public Builder setStreetNumber(String streetNumber)
        {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder setStreetName(String streetName)
        {
            this.streetName = streetName;
            return this;
        }

        public Builder setpostalCode(String postalCode)
        {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setCity(City city)
        {
            this.city = city;
            return this;
        }

        public Builder copy(Address address)
        {
            this.unitNumber = address.unitNumber;
            this.complexName = address.complexName;
            this.streetNumber = address.streetNumber;
            this.streetName = address.streetName;
            this.postalCode = address.postalCode;
            this.city = address.city;
            return this;
        }

        public Address build()
        {
            return new Address(this);
        }
    }
}
