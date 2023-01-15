package models;

import enums.*;

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
    private final String annualRevenue;
    private final int phone;
    private final String email;
    private final String website;
    private final Industry industry;
    private final Salutations salutation;
    private final LeadStatus leadStatus;
    private final Rating rating;
    private final LeadSource leadSource;
    private final String street;
    private final String description;
    private final String fullName;
    private final String fullAddress;

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
        this.fullName = leadBuilder.fullName;
        this.fullAddress = leadBuilder.fullAddress;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lead lead = (Lead) o;
        return numberOfEmployees == lead.numberOfEmployees
                && annualRevenue == lead.annualRevenue;
//                && phone == lead.phone
//                && Objects.equals(company, lead.company)
//                && Objects.equals(email, lead.email)
//                && Objects.equals(website, lead.website)
//                && industry == lead.industry
//                && leadStatus == lead.leadStatus
//                && rating == lead.rating
//                && leadSource == lead.leadSource
//                && Objects.equals(description, lead.description)
//                && Objects.equals(fullName, lead.fullName)
//                && Objects.equals(fullAddress, lead.fullAddress);

    }

    @Override
    public int hashCode() {
        return Objects.hash(company, numberOfEmployees, annualRevenue, phone, email, website, industry, salutation, leadStatus, rating, leadSource, description, fullName);
    }

//    public String getFullName() {
//        if (this.fullName != null) {
//            return this.fullName;
//        } else {
//            String salutation = Objects.isNull(this.salutation) ? "" : this.salutation.getName();
//            String firstName = Objects.isNull(this.firstName) ? "" : this.firstName;
//            String lastName = Objects.isNull(this.lastName) ? "" : this.lastName;
//            return (salutation + " " + firstName + " " + lastName).trim();
//        }
//    }
//
//    public String getFullAddress() {
//        if (this.fullAddress != null) {
//            return this.fullAddress;
//        } else {
//            String street = Objects.isNull(this.street) ? "" : this.street + "\n";
//            String city = Objects.isNull(this.city) ? "" : this.city + ", ";
//            String province = Objects.isNull(this.province) ? "" : this.province;
//            String postalCode = Objects.isNull(this.postalCode) ? "" : String.valueOf(this.postalCode);
//            String country = Objects.isNull(this.country) ? "" : "\n" + this.country;
//            return (street + city + province + postalCode + country).trim();
//        }
//    }

    public String getStreet() {
        return street;
    }


    public String getDescription() {
        return description;
    }


    public Salutations getSalutation() {
        return salutation;
    }

    public LeadStatus getLeadStatus() {
        return this.leadStatus;
    }

    public Rating getRating() {
        return rating;
    }

    public LeadSource getLeadSource() {
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

    public String getAnnualRevenue() {
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

    public Industry getIndustry() {
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
        private String annualRevenue;
        private int phone;
        private String email;
        private String website;
        private Industry industry;
        private Salutations salutation;
        private LeadStatus leadStatus;
        private Rating rating;
        private LeadSource leadSource;
        private String street;
        private String description;
        private String fullName;
        private String fullAddress;

        public LeadBuilder(String lastName, String company, LeadStatus leadStatus) {
            this.lastName = lastName;
            this.company = company;
            this.leadStatus = leadStatus;
        }


        public LeadBuilder(String fullName, LeadStatus leadStatus, String company) {
            this.fullName = fullName;
            this.leadStatus = leadStatus;
            this.company = company;
        }


        public LeadBuilder setFullAddress(String fullAddress) {
            this.fullAddress = fullAddress;
            return this;
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

        public LeadBuilder setAnnualRevenue(String annualRevenue) {
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

        public LeadBuilder setIndustry(Industry industry) {
            this.industry = industry;
            return this;
        }

        public LeadBuilder setSalutation(Salutations salutation) {
            this.salutation = salutation;
            return this;
        }

        public LeadBuilder setRating(Rating rating) {
            this.rating = rating;
            return this;
        }

        public LeadBuilder setLeadSource(LeadSource leadSource) {
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
            if (this.fullAddress == null && this.fullName == null) {
                String salutation = Objects.isNull(this.salutation) ? "" : this.salutation.getName();
                String firstName = Objects.isNull(this.firstName) ? "" : this.firstName;
                String lastName = Objects.isNull(this.lastName) ? "" : this.lastName;
                String street = Objects.isNull(this.street) ? "" : this.street + "\n";
                String city = Objects.isNull(this.city) ? "" : this.city + ", ";
                String province = Objects.isNull(this.province) ? "" : this.province + " ";
                String postalCode = Objects.isNull(this.postalCode) ? "" : String.valueOf(this.postalCode);
                String country = Objects.isNull(this.country) ? "" : "\n" + this.country;
                this.fullAddress = (street + city + province + postalCode + country).trim();
                this.fullName = (salutation + " " + firstName + " " + lastName).trim();
                return new Lead(this);
            }
            return new Lead(this);
        }




    }

}
