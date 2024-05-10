package com.yahia.productserviceapi.model;

public class Recommendation {

    private int productId;
    private int recommendationId;
    private String author;
    private int rate;
    private String content;
    private String serviceAddress;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getRecommendationId() {
        return recommendationId;
    }

    public void setRecommendationId(int recommendationId) {
        this.recommendationId = recommendationId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    @Override
    public String toString() {
        return "Recommendation{" +
                "productId=" + productId +
                ", recommendationId=" + recommendationId +
                ", author='" + author + '\'' +
                ", rate=" + rate +
                ", content='" + content + '\'' +
                ", serviceAddress='" + serviceAddress + '\'' +
                '}';
    }
}
