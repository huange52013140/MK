package cn.com.scitc.webapp3.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "login", schema = "scitc", catalog = "")
public class Login {
    private int id;
    private String password;
    private String sex;

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", habit='" + habit + '\'' +
                '}';
    }

    private String habit;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "sex", nullable = false, length = 2)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "habit", nullable = false, length = 10)
    public String getHabit() {
        return habit;
    }

    public void setHabit(String habit) {
        this.habit = habit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Login that = (Login) o;
        return id == that.id &&
                Objects.equals(password, that.password) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(habit, that.habit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password, sex, habit);
    }
}
