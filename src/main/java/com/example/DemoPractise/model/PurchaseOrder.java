package com.example.DemoPractise.model;

public class PurchaseOrder {
    private String orderId;
    private Long orderCreatedTime;
    private String orderDeliveryData;
    private String orderDispatchDate;
    private String orderQuantity;
    private String status;
    private String source;
    private String uuid;
    private String orderType;

    public PurchaseOrder() {
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getOrderCreatedTime() {
        return orderCreatedTime;
    }

    public void setOrderCreatedTime(Long orderCreatedTime) {
        this.orderCreatedTime = orderCreatedTime;
    }

    public String getOrderDeliveryData() {
        return orderDeliveryData;
    }

    public void setOrderDeliveryData(String orderDeliveryData) {
        this.orderDeliveryData = orderDeliveryData;
    }

    public String getOrderDispatchDate() {
        return orderDispatchDate;
    }

    public void setOrderDispatchDate(String orderDispatchDate) {
        this.orderDispatchDate = orderDispatchDate;
    }

    public String getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(String orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" +
                "orderId='" + orderId + '\'' +
                ", orderCreatedTime=" + orderCreatedTime +
                ", orderDeliveryData='" + orderDeliveryData + '\'' +
                ", orderDispatchDate='" + orderDispatchDate + '\'' +
                ", orderQuantity='" + orderQuantity + '\'' +
                ", status='" + status + '\'' +
                ", source='" + source + '\'' +
                ", uuid='" + uuid + '\'' +
                ", orderType='" + orderType + '\'' +
                '}';
    }
}
