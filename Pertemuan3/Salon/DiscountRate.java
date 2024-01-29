class DiscountRate {
    static final double serviceDiscountPremium = 0.2;
    static final double serviceDiscountGold = 0.15;
    static final double serviceDiscountSilver = 0.1;
    static final double productDiscountPremium = 0.1;
    static final double productDiscountGold = 0.1;
    static final double productDiscountSilver = 0.1;

    static double getServiceDiscountRate(String type) {
        switch (type.toLowerCase()) {
            case "premium":
                return serviceDiscountPremium;
            case "gold":
                return serviceDiscountGold;
            case "silver":
                return serviceDiscountSilver;
            default:
                return 0.0;
        }
    }

    static double getProductDiscountRate(String type) {
        switch (type.toLowerCase()) {
            case "premium":
                return productDiscountPremium;
            case "gold":
                return productDiscountGold;
            case "silver":
                return productDiscountSilver;
            default:
                return 0.0;
        }
    }
}
