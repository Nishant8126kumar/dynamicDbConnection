package com.example.DemoPractise.utils;

public interface DButilsMapping {
    enum VMARTDATABASE {
        vehicle("vehicle","vehicle-manager"),
        purchaseOrder("PurchaseOrder","purchase-order");
        private String collectionName;
        private String databaseCollectionName;

        VMARTDATABASE(String collectionName, String databaseCollectionName) {
            this.collectionName = collectionName;
            this.databaseCollectionName = databaseCollectionName;
        }

        public String getCollectionName() {
            return collectionName;
        }

        public void setCollectionName(String collectionName) {
            this.collectionName = collectionName;
        }

        public String getDatabaseCollectionName() {
            return databaseCollectionName;
        }

        public void setDatabaseCollectionName(String databaseCollectionName) {
            this.databaseCollectionName = databaseCollectionName;
        }
    }
}
