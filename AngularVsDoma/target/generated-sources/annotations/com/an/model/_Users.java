package com.an.model;

/** */
@javax.annotation.Generated(value = { "Doma", "2.6.2" }, date = "2018-09-28T00:30:04.052+0700")
public final class _Users extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.an.model.Users> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.6.2");
    }

    private static final _Users __singleton = new _Users();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator();

    /** the id */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.an.model.Users, java.lang.Integer, Object> $id = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<>(com.an.model.Users.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "id", "", __namingType, false, __idGenerator);

    /** the username */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.an.model.Users, java.lang.String, Object> $username = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.an.model.Users.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "username", "", __namingType, true, true, false);

    /** the address */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.an.model.Users, java.lang.String, Object> $address = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.an.model.Users.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "address", "", __namingType, true, true, false);

    /** the email */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.an.model.Users, java.lang.String, Object> $email = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.an.model.Users.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "email", "", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<com.an.model.Users>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.an.model.Users, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.an.model.Users, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.an.model.Users, ?>> __entityPropertyTypeMap;

    private _Users() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Users";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.an.model.Users, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.an.model.Users, ?>> __list = new java.util.ArrayList<>(4);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.an.model.Users, ?>> __map = new java.util.HashMap<>(4);
        __idList.add($id);
        __list.add($id);
        __map.put("id", $id);
        __list.add($username);
        __map.put("username", $username);
        __list.add($address);
        __map.put("address", $address);
        __list.add($email);
        __map.put("email", $email);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(com.an.model.Users entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.an.model.Users> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.an.model.Users entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.an.model.Users> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.an.model.Users entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.an.model.Users> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.an.model.Users entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.an.model.Users> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.an.model.Users entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.an.model.Users> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.an.model.Users entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.an.model.Users> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.an.model.Users, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.an.model.Users, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.an.model.Users, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.an.model.Users, ?, ?> getGeneratedIdPropertyType() {
        return $id;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.an.model.Users, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.an.model.Users newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.an.model.Users, ?>> __args) {
        com.an.model.Users entity = new com.an.model.Users();
        __args.values().forEach(v -> v.save(entity));
        return entity;
    }

    @Override
    public Class<com.an.model.Users> getEntityClass() {
        return com.an.model.Users.class;
    }

    @Override
    public com.an.model.Users getOriginalStates(com.an.model.Users __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.an.model.Users __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Users getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Users newInstance() {
        return new _Users();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<com.an.model.Users> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
