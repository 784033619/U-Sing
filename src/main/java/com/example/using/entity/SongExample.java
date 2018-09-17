package com.example.using.entity;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

public class SongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SongExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Integer value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Integer value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Integer value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Integer value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Integer value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Integer> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Integer> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Integer value1, Integer value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andLrcIsNull() {
            addCriterion("lrc is null");
            return (Criteria) this;
        }

        public Criteria andLrcIsNotNull() {
            addCriterion("lrc is not null");
            return (Criteria) this;
        }

        public Criteria andLrcEqualTo(String value) {
            addCriterion("lrc =", value, "lrc");
            return (Criteria) this;
        }

        public Criteria andLrcNotEqualTo(String value) {
            addCriterion("lrc <>", value, "lrc");
            return (Criteria) this;
        }

        public Criteria andLrcGreaterThan(String value) {
            addCriterion("lrc >", value, "lrc");
            return (Criteria) this;
        }

        public Criteria andLrcGreaterThanOrEqualTo(String value) {
            addCriterion("lrc >=", value, "lrc");
            return (Criteria) this;
        }

        public Criteria andLrcLessThan(String value) {
            addCriterion("lrc <", value, "lrc");
            return (Criteria) this;
        }

        public Criteria andLrcLessThanOrEqualTo(String value) {
            addCriterion("lrc <=", value, "lrc");
            return (Criteria) this;
        }

        public Criteria andLrcLike(String value) {
            addCriterion("lrc like", value, "lrc");
            return (Criteria) this;
        }

        public Criteria andLrcNotLike(String value) {
            addCriterion("lrc not like", value, "lrc");
            return (Criteria) this;
        }

        public Criteria andLrcIn(List<String> values) {
            addCriterion("lrc in", values, "lrc");
            return (Criteria) this;
        }

        public Criteria andLrcNotIn(List<String> values) {
            addCriterion("lrc not in", values, "lrc");
            return (Criteria) this;
        }

        public Criteria andLrcBetween(String value1, String value2) {
            addCriterion("lrc between", value1, value2, "lrc");
            return (Criteria) this;
        }

        public Criteria andLrcNotBetween(String value1, String value2) {
            addCriterion("lrc not between", value1, value2, "lrc");
            return (Criteria) this;
        }

        public Criteria andAlbumIdIsNull() {
            addCriterion("album_id is null");
            return (Criteria) this;
        }

        public Criteria andAlbumIdIsNotNull() {
            addCriterion("album_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumIdEqualTo(Integer value) {
            addCriterion("album_id =", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdNotEqualTo(Integer value) {
            addCriterion("album_id <>", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdGreaterThan(Integer value) {
            addCriterion("album_id >", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("album_id >=", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdLessThan(Integer value) {
            addCriterion("album_id <", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdLessThanOrEqualTo(Integer value) {
            addCriterion("album_id <=", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdIn(List<Integer> values) {
            addCriterion("album_id in", values, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdNotIn(List<Integer> values) {
            addCriterion("album_id not in", values, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdBetween(Integer value1, Integer value2) {
            addCriterion("album_id between", value1, value2, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdNotBetween(Integer value1, Integer value2) {
            addCriterion("album_id not between", value1, value2, "albumId");
            return (Criteria) this;
        }

        public Criteria andPlayTimesIsNull() {
            addCriterion("play_times is null");
            return (Criteria) this;
        }

        public Criteria andPlayTimesIsNotNull() {
            addCriterion("play_times is not null");
            return (Criteria) this;
        }

        public Criteria andPlayTimesEqualTo(Integer value) {
            addCriterion("play_times =", value, "playTimes");
            return (Criteria) this;
        }

        public Criteria andPlayTimesNotEqualTo(Integer value) {
            addCriterion("play_times <>", value, "playTimes");
            return (Criteria) this;
        }

        public Criteria andPlayTimesGreaterThan(Integer value) {
            addCriterion("play_times >", value, "playTimes");
            return (Criteria) this;
        }

        public Criteria andPlayTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("play_times >=", value, "playTimes");
            return (Criteria) this;
        }

        public Criteria andPlayTimesLessThan(Integer value) {
            addCriterion("play_times <", value, "playTimes");
            return (Criteria) this;
        }

        public Criteria andPlayTimesLessThanOrEqualTo(Integer value) {
            addCriterion("play_times <=", value, "playTimes");
            return (Criteria) this;
        }

        public Criteria andPlayTimesIn(List<Integer> values) {
            addCriterion("play_times in", values, "playTimes");
            return (Criteria) this;
        }

        public Criteria andPlayTimesNotIn(List<Integer> values) {
            addCriterion("play_times not in", values, "playTimes");
            return (Criteria) this;
        }

        public Criteria andPlayTimesBetween(Integer value1, Integer value2) {
            addCriterion("play_times between", value1, value2, "playTimes");
            return (Criteria) this;
        }

        public Criteria andPlayTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("play_times not between", value1, value2, "playTimes");
            return (Criteria) this;
        }

        public Criteria andMd5fileIsNull() {
            addCriterion("MD5file is null");
            return (Criteria) this;
        }

        public Criteria andMd5fileIsNotNull() {
            addCriterion("MD5file is not null");
            return (Criteria) this;
        }

        public Criteria andMd5fileEqualTo(String value) {
            addCriterion("MD5file =", value, "md5file");
            return (Criteria) this;
        }

        public Criteria andMd5fileNotEqualTo(String value) {
            addCriterion("MD5file <>", value, "md5file");
            return (Criteria) this;
        }

        public Criteria andMd5fileGreaterThan(String value) {
            addCriterion("MD5file >", value, "md5file");
            return (Criteria) this;
        }

        public Criteria andMd5fileGreaterThanOrEqualTo(String value) {
            addCriterion("MD5file >=", value, "md5file");
            return (Criteria) this;
        }

        public Criteria andMd5fileLessThan(String value) {
            addCriterion("MD5file <", value, "md5file");
            return (Criteria) this;
        }

        public Criteria andMd5fileLessThanOrEqualTo(String value) {
            addCriterion("MD5file <=", value, "md5file");
            return (Criteria) this;
        }

        public Criteria andMd5fileLike(String value) {
            addCriterion("MD5file like", value, "md5file");
            return (Criteria) this;
        }

        public Criteria andMd5fileNotLike(String value) {
            addCriterion("MD5file not like", value, "md5file");
            return (Criteria) this;
        }

        public Criteria andMd5fileIn(List<String> values) {
            addCriterion("MD5file in", values, "md5file");
            return (Criteria) this;
        }

        public Criteria andMd5fileNotIn(List<String> values) {
            addCriterion("MD5file not in", values, "md5file");
            return (Criteria) this;
        }

        public Criteria andMd5fileBetween(String value1, String value2) {
            addCriterion("MD5file between", value1, value2, "md5file");
            return (Criteria) this;
        }

        public Criteria andMd5fileNotBetween(String value1, String value2) {
            addCriterion("MD5file not between", value1, value2, "md5file");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}