package com.an.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.6.2" }, date = "2018-09-28T00:30:04.398+0700")
public class UsersdaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.an.dao.Usersdao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.6.2");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.an.dao.Usersdao.class, "selectAllUsers");

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public UsersdaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<com.an.model.Users> selectAllUsers() {
        entering("com.an.dao.UsersdaoImpl", "selectAllUsers");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/an/dao/Usersdao/selectAllUsers.sql");
            __query.setEntityType(com.an.model._Users.getSingletonInternal());
            __query.setCallerClassName("com.an.dao.UsersdaoImpl");
            __query.setCallerMethodName("selectAllUsers");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<com.an.model.Users>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.an.model.Users>(com.an.model._Users.getSingletonInternal()));
            java.util.List<com.an.model.Users> __result = __command.execute();
            __query.complete();
            exiting("com.an.dao.UsersdaoImpl", "selectAllUsers", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.an.dao.UsersdaoImpl", "selectAllUsers", __e);
            throw __e;
        }
    }

}
