package charles.lab;

import dto.Customer;
import dto.CustomerDto;
import mapper.CustomerMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        Customer customer = new Customer();
        customer.setName("Charles");
        customer.setId(1L);

        CustomerDto dto = CustomerMapper.MAPPER.fromCustomer(customer);

        System.out.println(dto.id);
        System.out.println(dto.customerName);
    }
}
