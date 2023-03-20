package com.example.Procesamiento.servicioProcesamiento;

public class Persona {
    private String index;
    private String userID;
    private String firstName;
    private String apellido;
    private String sex;
    private String email;
    private String phone;
    private String dataOfBirth;
    private String jobTitle;

    public Persona(String index, String userID, String firstName, String apellido, String sex, String email, String phone, String dataOfBirth, String jobTitle) {
        this.index = index;
        this.userID = userID;
        this.firstName = firstName;
        this.apellido = apellido;
        this.sex = sex;
        this.email = email;
        this.phone = phone;
        this.dataOfBirth = dataOfBirth;
        this.jobTitle = jobTitle;
    }

    public String getIndex() {
        return index;
    }

    public String getUserID() {
        return userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
