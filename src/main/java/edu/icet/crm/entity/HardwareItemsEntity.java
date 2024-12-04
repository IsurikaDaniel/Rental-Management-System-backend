package edu.icet.crm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hardware_items")
public class HardwareItemsEntity {
    private Integer id;
    private String name;
    private String availability;
    private Double finePerDay;
    private Double rentalPerDay;
}
