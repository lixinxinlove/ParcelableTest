package com.lixinxin.parcelabletest.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by lixinxin on 2016/7/27.
 */
public class Student implements Parcelable {
    private String name;
    private int age;
    private boolean sex;

    public Student(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    protected Student(Parcel in) {
        name = in.readString();
        age = in.readInt();
        sex = in.readByte() != 0;
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(age);
        parcel.writeByte((byte) (sex ? 1 : 0));
    }
}
