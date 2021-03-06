package cn.haohao.dbbook.data.entity.http;

import java.util.ArrayList;
import java.util.List;


public class BookReviewsListResponse extends BaseResponse {
    private int count;
    private int start;
    private int total;
    private List<BookReviewResponse> reviews;

    public BookReviewsListResponse() {
        this.reviews = new ArrayList<>();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<BookReviewResponse> getReviews() {
        return reviews;
    }

    public void setReviews(List<BookReviewResponse> reviews) {
        this.reviews = reviews;
    }
}
