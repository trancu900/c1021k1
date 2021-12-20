package com.company.opp.user;

public class Customer {
    private String username;
    private String mobile;
    private Address address;

    public Customer(String username, String mobile, String street, String district, String province, String city, String country) {
        this.username = username;
        this.mobile = mobile;
        address = new Address(street, district, province, city, country);
    }

    public Customer() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "username='" + username + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address=" + address +
                '}';
    }

    public static class Address {
        String street;
        String district;
        String province;
        String city;
        String country;

        public Address(String street, String district, String province, String city, String country) {
            this.street = street;
            this.district = district;
            this.province = province;
            this.city = city;
            this.country = country;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", district='" + district + '\'' +
                    ", province='" + province + '\'' +
                    ", city='" + city + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }
    }
}
