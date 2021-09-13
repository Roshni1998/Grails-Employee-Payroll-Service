package com.bridgelabz

class Company {

    String companyName
    String product
    Integer capacity
    String city

    static hasMany = [employee: Employee]

    static constraints = {
        companyName size: 4..40, unique: true, blank: false
        product blank: false
        capacity blank: false
        city blank: false
    }

    String toString() {
        companyName
    }
}
