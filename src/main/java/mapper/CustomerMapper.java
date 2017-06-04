package mapper;

import dto.Customer;
import dto.CustomerDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Created by charles on 2017/6/4.
 */
@Mapper
public interface CustomerMapper {
    public CustomerMapper MAPPER = Mappers.getMapper(CustomerMapper.class);

    @Mapping(source = "customerName", target = "name")
    Customer toCustomer(CustomerDto customerDto);

    @InheritInverseConfiguration
    CustomerDto fromCustomer(Customer customer);
}
