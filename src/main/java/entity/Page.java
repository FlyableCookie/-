package entity;

import org.springframework.stereotype.Component;

@Component
public class Page {
    int pageNum;
    int max;
    int next;

    public int getMax() {
        return max;
    }

    public int getNext() {
        return next;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
}
