package mx.tabasco.gob.msvc.reports.core.models;

public class Pageable {
    public Sort sort;
    public int offset;
    public int pageNumber;
    public int pageSize;
    public boolean paged;
    public boolean unpaged;

    public Pageable() {
    }

    public Pageable(Sort sort, int offset, int pageNumber, int pageSize, boolean paged, boolean unpaged) {
        this.sort = sort;
        this.offset = offset;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.paged = paged;
        this.unpaged = unpaged;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isPaged() {
        return paged;
    }

    public void setPaged(boolean paged) {
        this.paged = paged;
    }

    public boolean isUnpaged() {
        return unpaged;
    }

    public void setUnpaged(boolean unpaged) {
        this.unpaged = unpaged;
    }
}
