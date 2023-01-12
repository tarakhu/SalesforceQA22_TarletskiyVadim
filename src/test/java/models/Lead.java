package models;

import java.util.Objects;

public class Lead {
    private final String firstName;
    private final String lastName;
    private final String company;
    private final String city;
    private final int postalCode;
    private final String province;
    private final String country;
    private final int numberOfEmployees;
    private final int annualRevenue;
    private final int phone;
    private final String email;
    private final String website;
    private final String industry;
    private final String salutation;
    private final String leadStatus;
    private final String rating;
    private final String leadSource;
    private final String street;
    private final String description;

    private Lead(LeadBuilder leadBuilder) {

        this.firstName = leadBuilder.firstName;
        this.lastName = leadBuilder.lastName;
        this.company = leadBuilder.company;
        this.city = leadBuilder.city;
        this.postalCode = leadBuilder.postalCode;
        this.province = leadBuilder.province;
        this.country = leadBuilder.country;
        this.numberOfEmployees = leadBuilder.numberOfEmployees;
        this.annualRevenue = leadBuilder.annualRevenue;
        this.phone = leadBuilder.phone;
        this.email = leadBuilder.email;
        this.website = leadBuilder.website;
        this.industry = leadBuilder.industry;
        this.salutation = leadBuilder.salutation;
        this.leadStatus = leadBuilder.leadStatus;
        this.rating = leadBuilder.rating;
        this.leadSource = leadBuilder.leadSource;
        this.description = leadBuilder.description;
        this.street = leadBuilder.street;
    }



//    public Lead(String firstName, String lastName, String company, String city, int postalCode, String province,
//                String country, int numberOfEmployees, int annualRevenue, int phone, String email, String website, String industry,
//                String salutation, String leadStatus, String rating, String leadSource,String street, String description) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.company = company;
//        this.city = city;
//        this.postalCode = postalCode;
//        this.province = province;
//        this.country = country;
//        this.numberOfEmployees = numberOfEmployees;
//        this.annualRevenue = annualRevenue;
//        this.phone = phone;
//        this.email = email;
//        this.website = website;
//        this.industry = industry;
//        this.salutation = salutation;
//        this.leadStatus = leadStatus;
//        this.rating = rating;
//        this.leadSource = leadSource;
//        this.description = description;
//        this.street = street;
//
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lead lead = (Lead) o;
        return postalCode == lead.postalCode && numberOfEmployees == lead.numberOfEmployees && annualRevenue == lead.annualRevenue && phone == lead.phone && company.equals(lead.company) && city.equals(lead.city) && province.equals(lead.province) && country.equals(lead.country) && email.equals(lead.email) && website.equals(lead.website) && industry.equals(lead.industry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, city, postalCode, province, country, numberOfEmployees, annualRevenue, phone, email, website, industry);
    }


    public String getStreet() {
        return street;
    }


    public String getDescription() {
        return description;
    }


    public String getSalutation() {
        return salutation;
    }

    public String getLeadStatus() {
        return leadStatus;
    }

    public String getRating() {
        return rating;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getCity() {
        return city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getProvince() {
        return province;
    }

    public String getCountry() {
        return country;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public int getAnnualRevenue() {
        return annualRevenue;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getWebsite() {
        return website;
    }

    public String getIndustry() {
        return industry;
    }

    public static class LeadBuilder {

        private String firstName;
        private String lastName;
        private String company;
        private String city;
        private int postalCode;
        private String province;
        private String country;
        private int numberOfEmployees;
        private int annualRevenue;
        private int phone;
        private String email;
        private String website;
        private String industry;
        private String salutation;
        private String leadStatus;
        private String rating;
        private String leadSource;
        private String street;
        private String description;

        public LeadBuilder(String lastName, String company, String leadStatus) {
            this.lastName = lastName;
            this.company = company;
            this.leadStatus = leadStatus;

        }

        public LeadBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public LeadBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public LeadBuilder setPostalCode(int postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public LeadBuilder setProvince(String province) {
            this.province = province;
            return this;
        }

        public LeadBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public LeadBuilder setNumberOfEmployees(int numberOfEmployees) {
            this.numberOfEmployees = numberOfEmployees;
            return this;
        }

        public LeadBuilder setAnnualRevenue(int annualRevenue) {
            this.annualRevenue = annualRevenue;
            return this;
        }

        public LeadBuilder setPhone(int phone) {
            this.phone = phone;
            return this;
        }

        public LeadBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public LeadBuilder setWebsite(String website) {
            this.website = website;
            return this;
        }

        public LeadBuilder setIndustry(String industry) {
            this.industry = industry;
            return this;
        }

        public LeadBuilder setSalutation(String salutation) {
            this.salutation = salutation;
            return this;
        }

        public LeadBuilder setRating(String rating) {
            this.rating = rating;
            return this;
        }

        public LeadBuilder setLeadSource(String leadSource) {
            this.leadSource = leadSource;
            return this;
        }

        public LeadBuilder setStreet(String street) {
            this.street = street;
            return this;
        }

        public LeadBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Lead build() {
            return new Lead(this);
        }




    }

}
