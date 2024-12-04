package edu.icet.crm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Rental {
    private Integer id;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private Double totalCost;
    private LocalDate dueDate;
    private Double fine;
}

