package dto;

/**
 * Created by charles on 2017/6/4.
 */
public class CustomerDto {
    public Long id;
    public String customerName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
