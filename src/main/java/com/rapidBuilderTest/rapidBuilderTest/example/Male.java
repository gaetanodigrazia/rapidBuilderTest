package com.rapidBuilderTest.rapidBuilderTest.example;


import com.rapidBuilder.annotation.field.FieldBuilderProperty;

public class Male extends Person{
    private String gender;

    public String getGender() {
        return gender;
    }

    @FieldBuilderProperty(builder = true, randomize = true)
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Male{" +
                "gender='" + gender + '\'' +
                '}'+super.toString();
    }
}
