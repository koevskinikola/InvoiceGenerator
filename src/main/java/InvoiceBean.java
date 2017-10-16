import java.util.Date;
import java.util.Map;

public class InvoiceBean {

    private int invoiceNumber;
    private CustomerBean customer;
    private Map<ProductBean, Integer> products;
    private Date creationDate;
    private Date issueDate;
    private Date currencyDate;

    public InvoiceBean() {
    }

    public InvoiceBean(int invoiceNumber, CustomerBean customer, Map<ProductBean, Integer> products, Date creationDate, Date issueDate, Date currencyDate) {
        this.invoiceNumber = invoiceNumber;
        this.customer = customer;
        this.products = products;
        this.creationDate = creationDate;
        this.issueDate = issueDate;
        this.currencyDate = currencyDate;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public CustomerBean getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerBean customer) {
        this.customer = customer;
    }

    public Map<ProductBean, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<ProductBean, Integer> products) {
        this.products = products;
    }

    public void addProduct(ProductBean product, Integer amount) {
        this.products.put(product, amount);
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getCurrencyDate() {
        return currencyDate;
    }

    public void setCurrencyDate(Date currencyDate) {
        this.currencyDate = currencyDate;
    }
}
