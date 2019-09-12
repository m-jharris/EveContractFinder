import java.util.Comparator;
import java.util.List;

public class ContractSort implements Comparator<Contract> {

    void betweeenPrice(double upper, double lower, List<Contract> alist) {
        for (int x = 0; x < alist.size()-1; x++) {
            if (alist.get(x).getPrice()>=upper || alist.get(x).getPrice()<= lower) {
                alist.remove(x);
                System.out.println("Removed contract" + alist.get(x).toString());
            }
        }
    }

    void sortByContractPrice(List<Contract> alist){
        alist.sort(Comparator.comparing(Contract::getPrice));
        for(Contract aContract : alist){
            System.out.println("price is " + aContract.getPrice());
        }
    }

    @Override
    public int compare(Contract o1, Contract o2) {
        return 0;
    }
}

//todo: compare function