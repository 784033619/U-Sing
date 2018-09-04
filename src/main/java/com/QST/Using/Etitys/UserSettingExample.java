package com.QST.Using.Etitys;

import java.util.ArrayList;
import java.util.List;

public class UserSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserSettingExample() {
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

        public Criteria andLetterIsNull() {
            addCriterion("letter is null");
            return (Criteria) this;
        }

        public Criteria andLetterIsNotNull() {
            addCriterion("letter is not null");
            return (Criteria) this;
        }

        public Criteria andLetterEqualTo(Integer value) {
            addCriterion("letter =", value, "letter");
            return (Criteria) this;
        }

        public Criteria andLetterNotEqualTo(Integer value) {
            addCriterion("letter <>", value, "letter");
            return (Criteria) this;
        }

        public Criteria andLetterGreaterThan(Integer value) {
            addCriterion("letter >", value, "letter");
            return (Criteria) this;
        }

        public Criteria andLetterGreaterThanOrEqualTo(Integer value) {
            addCriterion("letter >=", value, "letter");
            return (Criteria) this;
        }

        public Criteria andLetterLessThan(Integer value) {
            addCriterion("letter <", value, "letter");
            return (Criteria) this;
        }

        public Criteria andLetterLessThanOrEqualTo(Integer value) {
            addCriterion("letter <=", value, "letter");
            return (Criteria) this;
        }

        public Criteria andLetterIn(List<Integer> values) {
            addCriterion("letter in", values, "letter");
            return (Criteria) this;
        }

        public Criteria andLetterNotIn(List<Integer> values) {
            addCriterion("letter not in", values, "letter");
            return (Criteria) this;
        }

        public Criteria andLetterBetween(Integer value1, Integer value2) {
            addCriterion("letter between", value1, value2, "letter");
            return (Criteria) this;
        }

        public Criteria andLetterNotBetween(Integer value1, Integer value2) {
            addCriterion("letter not between", value1, value2, "letter");
            return (Criteria) this;
        }

        public Criteria andSongListCollectIsNull() {
            addCriterion("song_list_collect is null");
            return (Criteria) this;
        }

        public Criteria andSongListCollectIsNotNull() {
            addCriterion("song_list_collect is not null");
            return (Criteria) this;
        }

        public Criteria andSongListCollectEqualTo(Byte value) {
            addCriterion("song_list_collect =", value, "songListCollect");
            return (Criteria) this;
        }

        public Criteria andSongListCollectNotEqualTo(Byte value) {
            addCriterion("song_list_collect <>", value, "songListCollect");
            return (Criteria) this;
        }

        public Criteria andSongListCollectGreaterThan(Byte value) {
            addCriterion("song_list_collect >", value, "songListCollect");
            return (Criteria) this;
        }

        public Criteria andSongListCollectGreaterThanOrEqualTo(Byte value) {
            addCriterion("song_list_collect >=", value, "songListCollect");
            return (Criteria) this;
        }

        public Criteria andSongListCollectLessThan(Byte value) {
            addCriterion("song_list_collect <", value, "songListCollect");
            return (Criteria) this;
        }

        public Criteria andSongListCollectLessThanOrEqualTo(Byte value) {
            addCriterion("song_list_collect <=", value, "songListCollect");
            return (Criteria) this;
        }

        public Criteria andSongListCollectIn(List<Byte> values) {
            addCriterion("song_list_collect in", values, "songListCollect");
            return (Criteria) this;
        }

        public Criteria andSongListCollectNotIn(List<Byte> values) {
            addCriterion("song_list_collect not in", values, "songListCollect");
            return (Criteria) this;
        }

        public Criteria andSongListCollectBetween(Byte value1, Byte value2) {
            addCriterion("song_list_collect between", value1, value2, "songListCollect");
            return (Criteria) this;
        }

        public Criteria andSongListCollectNotBetween(Byte value1, Byte value2) {
            addCriterion("song_list_collect not between", value1, value2, "songListCollect");
            return (Criteria) this;
        }

        public Criteria andVideoCollectIsNull() {
            addCriterion("video_collect is null");
            return (Criteria) this;
        }

        public Criteria andVideoCollectIsNotNull() {
            addCriterion("video_collect is not null");
            return (Criteria) this;
        }

        public Criteria andVideoCollectEqualTo(Byte value) {
            addCriterion("video_collect =", value, "videoCollect");
            return (Criteria) this;
        }

        public Criteria andVideoCollectNotEqualTo(Byte value) {
            addCriterion("video_collect <>", value, "videoCollect");
            return (Criteria) this;
        }

        public Criteria andVideoCollectGreaterThan(Byte value) {
            addCriterion("video_collect >", value, "videoCollect");
            return (Criteria) this;
        }

        public Criteria andVideoCollectGreaterThanOrEqualTo(Byte value) {
            addCriterion("video_collect >=", value, "videoCollect");
            return (Criteria) this;
        }

        public Criteria andVideoCollectLessThan(Byte value) {
            addCriterion("video_collect <", value, "videoCollect");
            return (Criteria) this;
        }

        public Criteria andVideoCollectLessThanOrEqualTo(Byte value) {
            addCriterion("video_collect <=", value, "videoCollect");
            return (Criteria) this;
        }

        public Criteria andVideoCollectIn(List<Byte> values) {
            addCriterion("video_collect in", values, "videoCollect");
            return (Criteria) this;
        }

        public Criteria andVideoCollectNotIn(List<Byte> values) {
            addCriterion("video_collect not in", values, "videoCollect");
            return (Criteria) this;
        }

        public Criteria andVideoCollectBetween(Byte value1, Byte value2) {
            addCriterion("video_collect between", value1, value2, "videoCollect");
            return (Criteria) this;
        }

        public Criteria andVideoCollectNotBetween(Byte value1, Byte value2) {
            addCriterion("video_collect not between", value1, value2, "videoCollect");
            return (Criteria) this;
        }

        public Criteria andPraiseGetIsNull() {
            addCriterion("praise_get is null");
            return (Criteria) this;
        }

        public Criteria andPraiseGetIsNotNull() {
            addCriterion("praise_get is not null");
            return (Criteria) this;
        }

        public Criteria andPraiseGetEqualTo(Byte value) {
            addCriterion("praise_get =", value, "praiseGet");
            return (Criteria) this;
        }

        public Criteria andPraiseGetNotEqualTo(Byte value) {
            addCriterion("praise_get <>", value, "praiseGet");
            return (Criteria) this;
        }

        public Criteria andPraiseGetGreaterThan(Byte value) {
            addCriterion("praise_get >", value, "praiseGet");
            return (Criteria) this;
        }

        public Criteria andPraiseGetGreaterThanOrEqualTo(Byte value) {
            addCriterion("praise_get >=", value, "praiseGet");
            return (Criteria) this;
        }

        public Criteria andPraiseGetLessThan(Byte value) {
            addCriterion("praise_get <", value, "praiseGet");
            return (Criteria) this;
        }

        public Criteria andPraiseGetLessThanOrEqualTo(Byte value) {
            addCriterion("praise_get <=", value, "praiseGet");
            return (Criteria) this;
        }

        public Criteria andPraiseGetIn(List<Byte> values) {
            addCriterion("praise_get in", values, "praiseGet");
            return (Criteria) this;
        }

        public Criteria andPraiseGetNotIn(List<Byte> values) {
            addCriterion("praise_get not in", values, "praiseGet");
            return (Criteria) this;
        }

        public Criteria andPraiseGetBetween(Byte value1, Byte value2) {
            addCriterion("praise_get between", value1, value2, "praiseGet");
            return (Criteria) this;
        }

        public Criteria andPraiseGetNotBetween(Byte value1, Byte value2) {
            addCriterion("praise_get not between", value1, value2, "praiseGet");
            return (Criteria) this;
        }

        public Criteria andNewFanIsNull() {
            addCriterion("new_fan is null");
            return (Criteria) this;
        }

        public Criteria andNewFanIsNotNull() {
            addCriterion("new_fan is not null");
            return (Criteria) this;
        }

        public Criteria andNewFanEqualTo(Byte value) {
            addCriterion("new_fan =", value, "newFan");
            return (Criteria) this;
        }

        public Criteria andNewFanNotEqualTo(Byte value) {
            addCriterion("new_fan <>", value, "newFan");
            return (Criteria) this;
        }

        public Criteria andNewFanGreaterThan(Byte value) {
            addCriterion("new_fan >", value, "newFan");
            return (Criteria) this;
        }

        public Criteria andNewFanGreaterThanOrEqualTo(Byte value) {
            addCriterion("new_fan >=", value, "newFan");
            return (Criteria) this;
        }

        public Criteria andNewFanLessThan(Byte value) {
            addCriterion("new_fan <", value, "newFan");
            return (Criteria) this;
        }

        public Criteria andNewFanLessThanOrEqualTo(Byte value) {
            addCriterion("new_fan <=", value, "newFan");
            return (Criteria) this;
        }

        public Criteria andNewFanIn(List<Byte> values) {
            addCriterion("new_fan in", values, "newFan");
            return (Criteria) this;
        }

        public Criteria andNewFanNotIn(List<Byte> values) {
            addCriterion("new_fan not in", values, "newFan");
            return (Criteria) this;
        }

        public Criteria andNewFanBetween(Byte value1, Byte value2) {
            addCriterion("new_fan between", value1, value2, "newFan");
            return (Criteria) this;
        }

        public Criteria andNewFanNotBetween(Byte value1, Byte value2) {
            addCriterion("new_fan not between", value1, value2, "newFan");
            return (Criteria) this;
        }

        public Criteria andSongRankIsNull() {
            addCriterion("song_rank is null");
            return (Criteria) this;
        }

        public Criteria andSongRankIsNotNull() {
            addCriterion("song_rank is not null");
            return (Criteria) this;
        }

        public Criteria andSongRankEqualTo(Byte value) {
            addCriterion("song_rank =", value, "songRank");
            return (Criteria) this;
        }

        public Criteria andSongRankNotEqualTo(Byte value) {
            addCriterion("song_rank <>", value, "songRank");
            return (Criteria) this;
        }

        public Criteria andSongRankGreaterThan(Byte value) {
            addCriterion("song_rank >", value, "songRank");
            return (Criteria) this;
        }

        public Criteria andSongRankGreaterThanOrEqualTo(Byte value) {
            addCriterion("song_rank >=", value, "songRank");
            return (Criteria) this;
        }

        public Criteria andSongRankLessThan(Byte value) {
            addCriterion("song_rank <", value, "songRank");
            return (Criteria) this;
        }

        public Criteria andSongRankLessThanOrEqualTo(Byte value) {
            addCriterion("song_rank <=", value, "songRank");
            return (Criteria) this;
        }

        public Criteria andSongRankIn(List<Byte> values) {
            addCriterion("song_rank in", values, "songRank");
            return (Criteria) this;
        }

        public Criteria andSongRankNotIn(List<Byte> values) {
            addCriterion("song_rank not in", values, "songRank");
            return (Criteria) this;
        }

        public Criteria andSongRankBetween(Byte value1, Byte value2) {
            addCriterion("song_rank between", value1, value2, "songRank");
            return (Criteria) this;
        }

        public Criteria andSongRankNotBetween(Byte value1, Byte value2) {
            addCriterion("song_rank not between", value1, value2, "songRank");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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