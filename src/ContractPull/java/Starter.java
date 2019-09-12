public class Starter {

    public static void main(String[] args){

        ContractPull cP = new ContractPull("https://esi.evetech.net/latest/contracts/public/10000002/?datasource=tranquility&page=2");
        cP.pullItemExchangeContractsUrl();
        ContractSort cs = new ContractSort();
        cs.betweeenPrice(10000000, 1000000, cP.pullItemExchangeContractsUrl());

    }

}
