public class DenyListException extends ContractException {
    public DenyListException(){
        super("Customer is on denylist");
    }
}
