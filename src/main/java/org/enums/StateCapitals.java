package org.enums;

public enum StateCapitals {

    ODISHA {
        @Override
        public String getCapital() {
            return "bhubaneswar";
        }
    }, KARNATAKA {
        @Override
        public String getCapital() {
            return "bengaluru";
        }
    }, TAMILNADU {
        @Override
        public String getCapital() {
            return "chennai";
        }
    };

    public String getCountry() {
        return "INDIA";
    }

    public abstract String getCapital();
}
