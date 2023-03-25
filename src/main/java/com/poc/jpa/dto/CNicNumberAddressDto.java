package com.poc.jpa.dto;

import com.poc.jpa.model.OneToMany.Address;
import lombok.Data;

import java.util.List;

@Data
public class CNicNumberAddressDto {
    private String Name;
    private String cNicNo;

    public List<Address> addressList;
}
