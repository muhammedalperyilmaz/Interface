public class CustomerManager implements ICustomerDal {
     private ICustomerDal customerDal;
    // job codes
    public CustomerManager(ICustomerDal _customerDal) {
        customerDal=_customerDal;
    }
    public void Add()
    {
        customerDal.Add();
    }
}
