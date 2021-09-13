package com.bridgelabz

class Employee {

    static belongsTo = [company: Company]
    String name
    Integer age
    Integer salary
    String city

    static constraints = {
        name size: 4..40, unique: true, blank: false
        age min:17, max: 51, blank:false
        salary min:10000, max:50000, blank:false
        city blank:false
    }

    String toString() {
        name
    }
}
