package com.app.entity;

import java.util.ArrayList;
import java.util.List;

public class ConsumerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsumerExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andConsumerIdIsNull() {
            addCriterion("consumer_id is null");
            return (Criteria) this;
        }

        public Criteria andConsumerIdIsNotNull() {
            addCriterion("consumer_id is not null");
            return (Criteria) this;
        }

        public Criteria andConsumerIdEqualTo(String value) {
            addCriterion("consumer_id =", value, "consumerId");
            return (Criteria) this;
        }

        public Criteria andConsumerIdNotEqualTo(String value) {
            addCriterion("consumer_id <>", value, "consumerId");
            return (Criteria) this;
        }

        public Criteria andConsumerIdGreaterThan(String value) {
            addCriterion("consumer_id >", value, "consumerId");
            return (Criteria) this;
        }

        public Criteria andConsumerIdGreaterThanOrEqualTo(String value) {
            addCriterion("consumer_id >=", value, "consumerId");
            return (Criteria) this;
        }

        public Criteria andConsumerIdLessThan(String value) {
            addCriterion("consumer_id <", value, "consumerId");
            return (Criteria) this;
        }

        public Criteria andConsumerIdLessThanOrEqualTo(String value) {
            addCriterion("consumer_id <=", value, "consumerId");
            return (Criteria) this;
        }

        public Criteria andConsumerIdLike(String value) {
            addCriterion("consumer_id like", value, "consumerId");
            return (Criteria) this;
        }

        public Criteria andConsumerIdNotLike(String value) {
            addCriterion("consumer_id not like", value, "consumerId");
            return (Criteria) this;
        }

        public Criteria andConsumerIdIn(List<String> values) {
            addCriterion("consumer_id in", values, "consumerId");
            return (Criteria) this;
        }

        public Criteria andConsumerIdNotIn(List<String> values) {
            addCriterion("consumer_id not in", values, "consumerId");
            return (Criteria) this;
        }

        public Criteria andConsumerIdBetween(String value1, String value2) {
            addCriterion("consumer_id between", value1, value2, "consumerId");
            return (Criteria) this;
        }

        public Criteria andConsumerIdNotBetween(String value1, String value2) {
            addCriterion("consumer_id not between", value1, value2, "consumerId");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(String value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(String value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(String value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(String value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(String value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(String value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLike(String value) {
            addCriterion("created_at like", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotLike(String value) {
            addCriterion("created_at not like", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<String> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<String> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(String value1, String value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(String value1, String value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andKeyConsumerIsNull() {
            addCriterion("key_consumer is null");
            return (Criteria) this;
        }

        public Criteria andKeyConsumerIsNotNull() {
            addCriterion("key_consumer is not null");
            return (Criteria) this;
        }

        public Criteria andKeyConsumerEqualTo(String value) {
            addCriterion("key_consumer =", value, "keyConsumer");
            return (Criteria) this;
        }

        public Criteria andKeyConsumerNotEqualTo(String value) {
            addCriterion("key_consumer <>", value, "keyConsumer");
            return (Criteria) this;
        }

        public Criteria andKeyConsumerGreaterThan(String value) {
            addCriterion("key_consumer >", value, "keyConsumer");
            return (Criteria) this;
        }

        public Criteria andKeyConsumerGreaterThanOrEqualTo(String value) {
            addCriterion("key_consumer >=", value, "keyConsumer");
            return (Criteria) this;
        }

        public Criteria andKeyConsumerLessThan(String value) {
            addCriterion("key_consumer <", value, "keyConsumer");
            return (Criteria) this;
        }

        public Criteria andKeyConsumerLessThanOrEqualTo(String value) {
            addCriterion("key_consumer <=", value, "keyConsumer");
            return (Criteria) this;
        }

        public Criteria andKeyConsumerLike(String value) {
            addCriterion("key_consumer like", value, "keyConsumer");
            return (Criteria) this;
        }

        public Criteria andKeyConsumerNotLike(String value) {
            addCriterion("key_consumer not like", value, "keyConsumer");
            return (Criteria) this;
        }

        public Criteria andKeyConsumerIn(List<String> values) {
            addCriterion("key_consumer in", values, "keyConsumer");
            return (Criteria) this;
        }

        public Criteria andKeyConsumerNotIn(List<String> values) {
            addCriterion("key_consumer not in", values, "keyConsumer");
            return (Criteria) this;
        }

        public Criteria andKeyConsumerBetween(String value1, String value2) {
            addCriterion("key_consumer between", value1, value2, "keyConsumer");
            return (Criteria) this;
        }

        public Criteria andKeyConsumerNotBetween(String value1, String value2) {
            addCriterion("key_consumer not between", value1, value2, "keyConsumer");
            return (Criteria) this;
        }

        public Criteria andSecretIsNull() {
            addCriterion("secret is null");
            return (Criteria) this;
        }

        public Criteria andSecretIsNotNull() {
            addCriterion("secret is not null");
            return (Criteria) this;
        }

        public Criteria andSecretEqualTo(String value) {
            addCriterion("secret =", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotEqualTo(String value) {
            addCriterion("secret <>", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretGreaterThan(String value) {
            addCriterion("secret >", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretGreaterThanOrEqualTo(String value) {
            addCriterion("secret >=", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretLessThan(String value) {
            addCriterion("secret <", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretLessThanOrEqualTo(String value) {
            addCriterion("secret <=", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretLike(String value) {
            addCriterion("secret like", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotLike(String value) {
            addCriterion("secret not like", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretIn(List<String> values) {
            addCriterion("secret in", values, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotIn(List<String> values) {
            addCriterion("secret not in", values, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretBetween(String value1, String value2) {
            addCriterion("secret between", value1, value2, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotBetween(String value1, String value2) {
            addCriterion("secret not between", value1, value2, "secret");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andJwtTokenIsNull() {
            addCriterion("jwt_token is null");
            return (Criteria) this;
        }

        public Criteria andJwtTokenIsNotNull() {
            addCriterion("jwt_token is not null");
            return (Criteria) this;
        }

        public Criteria andJwtTokenEqualTo(String value) {
            addCriterion("jwt_token =", value, "jwtToken");
            return (Criteria) this;
        }

        public Criteria andJwtTokenNotEqualTo(String value) {
            addCriterion("jwt_token <>", value, "jwtToken");
            return (Criteria) this;
        }

        public Criteria andJwtTokenGreaterThan(String value) {
            addCriterion("jwt_token >", value, "jwtToken");
            return (Criteria) this;
        }

        public Criteria andJwtTokenGreaterThanOrEqualTo(String value) {
            addCriterion("jwt_token >=", value, "jwtToken");
            return (Criteria) this;
        }

        public Criteria andJwtTokenLessThan(String value) {
            addCriterion("jwt_token <", value, "jwtToken");
            return (Criteria) this;
        }

        public Criteria andJwtTokenLessThanOrEqualTo(String value) {
            addCriterion("jwt_token <=", value, "jwtToken");
            return (Criteria) this;
        }

        public Criteria andJwtTokenLike(String value) {
            addCriterion("jwt_token like", value, "jwtToken");
            return (Criteria) this;
        }

        public Criteria andJwtTokenNotLike(String value) {
            addCriterion("jwt_token not like", value, "jwtToken");
            return (Criteria) this;
        }

        public Criteria andJwtTokenIn(List<String> values) {
            addCriterion("jwt_token in", values, "jwtToken");
            return (Criteria) this;
        }

        public Criteria andJwtTokenNotIn(List<String> values) {
            addCriterion("jwt_token not in", values, "jwtToken");
            return (Criteria) this;
        }

        public Criteria andJwtTokenBetween(String value1, String value2) {
            addCriterion("jwt_token between", value1, value2, "jwtToken");
            return (Criteria) this;
        }

        public Criteria andJwtTokenNotBetween(String value1, String value2) {
            addCriterion("jwt_token not between", value1, value2, "jwtToken");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNull() {
            addCriterion("app_name is null");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNotNull() {
            addCriterion("app_name is not null");
            return (Criteria) this;
        }

        public Criteria andAppNameEqualTo(String value) {
            addCriterion("app_name =", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotEqualTo(String value) {
            addCriterion("app_name <>", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThan(String value) {
            addCriterion("app_name >", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("app_name >=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThan(String value) {
            addCriterion("app_name <", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThanOrEqualTo(String value) {
            addCriterion("app_name <=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLike(String value) {
            addCriterion("app_name like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLike(String value) {
            addCriterion("app_name not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(List<String> values) {
            addCriterion("app_name in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(List<String> values) {
            addCriterion("app_name not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameBetween(String value1, String value2) {
            addCriterion("app_name between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotBetween(String value1, String value2) {
            addCriterion("app_name not between", value1, value2, "appName");
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