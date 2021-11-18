package com.rapid.commerce.model;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "CONSUMER")
public class Consumer {

    @Id
    private String id;

    @NotBlank(message = "Phone number is required")
    @Column(name = "phone_number")
    private String phoneNumber;

    @NotBlank(message = "Name is required")
    private String name;

    @Email
    @NotBlank(message = "Phone number is required")
    private String email;

    private LocalDate birthday;

    private UUID uuid;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "consumer_id", referencedColumnName = "id")
    private List<ConsumerAddress> addressesList;

    public Consumer(String id, String phoneNumber, String name, String email, LocalDate birthday, UUID uuid, List<ConsumerAddress> addressesList) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.uuid = uuid;
        this.addressesList = addressesList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
