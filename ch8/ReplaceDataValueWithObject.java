package ch8;


/* 
 * You have a data item that needs additional data or behavior
 * 
 * Turn the data item into an object
 * 
 *  
 */
class Order {
  private String _customer;

  public Order(String customer) {
    _customer = customer;
  }

  public String getCustomer() {
    return _customer;
  }

  public void setCustomer(String arg) {
    _customer = arg;
  }
}

class Customer {
  private final String _name;
  public Customer(String name) {
    _name = name;
  }

  public String getName() {
    return _name;
  }
}

class OrderRefactored {
  private Customer _customer;

  public Order(String customerName) {
    _customer = new Customer(customerName);
  }

  public String getCustomerName() {
    return _customer.getName();
  }

  // each order has its own customer
  // as a rule value object should be immutable, this avoids some nasty aliasing bugs
  public void setCustomer(String customerName) {
    _customer = new Customer(customerName);
  }
}
